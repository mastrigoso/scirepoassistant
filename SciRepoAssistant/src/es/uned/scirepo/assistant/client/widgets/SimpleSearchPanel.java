package es.uned.scirepo.assistant.client.widgets;

import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DisclosurePanel;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.StackPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

import es.uned.scirepo.assistant.client.services.AreaService;
import es.uned.scirepo.assistant.client.services.AreaServiceAsync;
import es.uned.scirepo.assistant.shared.domain.Area;
import es.uned.scirepo.assistant.shared.domain.Category;

public class SimpleSearchPanel extends Composite {

	private static SimpleSearchPanelUiBinder uiBinder = GWT
			.create(SimpleSearchPanelUiBinder.class);

	private static AreaServiceAsync areaService = AreaService.Util.getInstance();
	
	interface SimpleSearchPanelUiBinder extends
			UiBinder<Widget, SimpleSearchPanel> {
	}

	@UiField 
	StackPanel areasStack;
	
	public SimpleSearchPanel() {
		initWidget(uiBinder.createAndBindUi(this));
		areaService.getAllAreas(new AsyncCallback<List<Area>>() {
			
			@Override
			public void onSuccess(List<Area> result) {
				for(Area area : result) {
					areasStack.add(createAreaItem(area), area.getDescription(), true);
				}
				
			}

			@Override
			public void onFailure(Throwable caught) {
				Window.alert("Error recueprando las áreas disponibles");
			}
		});
		
	}
	
	private VerticalPanel createAreaItem(Area area) {
		VerticalPanel item = new VerticalPanel();
		
		for(Category category : area.getCategories()) {
			DisclosurePanel disclosurePanel = new DisclosurePanel(category.getDescription());
			disclosurePanel.add(createCategoryItem(category));
			item.add(disclosurePanel);
			item.setCellHorizontalAlignment(disclosurePanel, HasHorizontalAlignment.ALIGN_LEFT);
		}
		
		return item;
	}

	private VerticalPanel createCategoryItem(Category category) {
		VerticalPanel item = new VerticalPanel();
		for(Category subcategory: category.getSubcategories()) {
			item.add(new Label(subcategory.getDescription()));
		}
		return item;
	}

}
