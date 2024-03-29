package es.uned.scirepo.assistant.client.widgets;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.StackPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.datepicker.client.DateBox;

import es.uned.scirepo.assistant.client.format.CustomDateFormats;
import es.uned.scirepo.assistant.client.services.AreaService;
import es.uned.scirepo.assistant.client.services.AreaServiceAsync;
import es.uned.scirepo.assistant.shared.domain.Area;
import es.uned.scirepo.assistant.shared.domain.Category;

public class ComplexSearchPanel extends Composite {

	private static ComplexSearchPanelUiBinder uiBinder = GWT
			.create(ComplexSearchPanelUiBinder.class);

	private static AreaServiceAsync areaService = AreaService.Util.getInstance();
	
	interface ComplexSearchPanelUiBinder extends
			UiBinder<Widget, ComplexSearchPanel> {
	}

	@UiField SimplePanel areasStackPanel;
	@UiField ImageButton searchButton;
	
	@UiField TextBox title;
	@UiField TextBox abstractText;
	@UiField TextBox comments;
	@UiField TextBox record;
	@UiField TextBox author;
	@UiField TextBox journal;
	@UiField DateBox dateInit;
	@UiField DateBox dateEnd;	
	@UiField TextBox citations;
	@UiField TextBox idReport;
	@UiField TextBox idArxiv;
	@UiField TextBox doi;
	
	private List<CategoryStackField> categories = new ArrayList<CategoryStackField>();
	
	public ComplexSearchPanel() {
		initWidget(uiBinder.createAndBindUi(this));
		dateInit.setFormat(CustomDateFormats.SHORT_WITH_CENTURY.getDateBoxFormat());
		dateEnd.setFormat(CustomDateFormats.SHORT_WITH_CENTURY.getDateBoxFormat());
		dateEnd.setValue(new Date());
				
		searchButton.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				List<String> tags = getTagsSelected();
				String msg = "Tags para buscar : \n";
				for(String tag : tags) {
					msg += "\"" + tag + "\"\n";
				}
				Window.alert(msg);
			}
		});
		
		areaService.getAllAreas(new AsyncCallback<List<Area>>() {
			
			@Override
			public void onSuccess(List<Area> result) {
				
				StackPanel areasStack = new StackPanel();
				areasStack.setWidth("100%");
				
				for(Area area : result) {
					
					VerticalPanel item = new VerticalPanel();
					
					for(Category category : area.getCategories()) {			
						CategoryStackField widget = new CategoryStackField(category);
						categories.add(widget);
						item.add(widget);
						item.setCellHorizontalAlignment(widget, HasHorizontalAlignment.ALIGN_LEFT);
					}
					
					areasStack.add(item, area.getDescription(), true);
				}
				
				areasStackPanel.setWidget(areasStack);
			}

			@Override
			public void onFailure(Throwable caught) {
				Window.alert("Error recuperando las áreas disponibles");
			}
			
		});
		
	}
	
	private List<String> getTagsSelected(){
		List<String> tags = new ArrayList<String>();
		for(CategoryStackField category : categories) {
			tags.addAll(category.getSearchSelectedTags());
		}
		return tags;
	}

}
