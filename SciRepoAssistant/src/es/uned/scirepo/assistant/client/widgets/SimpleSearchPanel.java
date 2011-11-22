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
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.gwt.user.datepicker.client.DateBox.Format;

import es.uned.scirepo.assistant.client.format.CustomDateFormats;
import es.uned.scirepo.assistant.client.services.AreaService;
import es.uned.scirepo.assistant.client.services.AreaServiceAsync;
import es.uned.scirepo.assistant.shared.domain.Area;
import es.uned.scirepo.assistant.shared.domain.Category;

public class SimpleSearchPanel extends Composite {

	private static SimpleSearchPanelUiBinder uiBinder = GWT
			.create(SimpleSearchPanelUiBinder.class);

	private static AreaServiceAsync areaService = AreaService.Util.getInstance();
	
	private static Format dateFormat = new DateBox.DefaultFormat(
			CustomDateFormats.SHORT_WITH_CENTURY.getFormat());

	interface SimpleSearchPanelUiBinder extends
			UiBinder<Widget, SimpleSearchPanel> {
	}

	@UiField SimplePanel areasStackPanel;
	@UiField DateBox dateInit;
	@UiField DateBox dateEnd;	
	@UiField ImageButton searchButton;
	
	private List<CategoryStackField> categories = new ArrayList<CategoryStackField>();
	
	public SimpleSearchPanel() {
		initWidget(uiBinder.createAndBindUi(this));
		dateInit.setFormat(dateFormat);
		dateEnd.setFormat(dateFormat);
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
