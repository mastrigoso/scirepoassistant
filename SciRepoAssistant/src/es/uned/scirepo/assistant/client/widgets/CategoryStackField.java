package es.uned.scirepo.assistant.client.widgets;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DisclosurePanel;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.VerticalPanel;

import es.uned.scirepo.assistant.shared.domain.Category;

public class CategoryStackField extends Composite implements ClickHandler{

	private Category category;

	private CheckBox checkBox = new CheckBox();
	
	private List<CategoryStackField> subcategories = new ArrayList<CategoryStackField>();
	
	public CategoryStackField(Category category){
		
		this.category = category;
		this.checkBox.addClickHandler(this);
		
		HorizontalPanel panel = new HorizontalPanel();
		panel.getElement().getStyle().setWidth(100, Unit.PCT);
		
		if(category.getSubcategories().size()>0) {
			DisclosurePanel disclosurePanel = new DisclosurePanel(category.getDescription());
			VerticalPanel internalPanel = new VerticalPanel();
			internalPanel.getElement().getStyle().setWidth(100, Unit.PCT);
			for(Category subcategory : category.getSubcategories()) {
				CategoryStackField subWidget = new CategoryStackField(subcategory);
				subcategories.add(subWidget);
				internalPanel.add(subWidget);
			}
			disclosurePanel.add(internalPanel);
			panel.add(disclosurePanel);
			panel.setCellHorizontalAlignment(disclosurePanel, HasHorizontalAlignment.ALIGN_LEFT);
		} else {
			SimplePanel internalPanel = new SimplePanel();
			internalPanel.getElement().getStyle().setMarginLeft(22, Unit.PX);
			internalPanel.getElement().getStyle().setWidth(100, Unit.PCT);
			internalPanel.add(new Label(category.getDescription()));
			panel.add(internalPanel);
			panel.setCellHorizontalAlignment(internalPanel, HasHorizontalAlignment.ALIGN_LEFT);
		}
		panel.add(this.checkBox);
		panel.setCellHorizontalAlignment(this.checkBox, HasHorizontalAlignment.ALIGN_RIGHT);
		
		initWidget(panel);
		
	}
	
	public boolean isSelected(){
		return this.checkBox.getValue();
	}
	
	public void setSelected(Boolean selected){
		this.checkBox.setValue(selected);
	}

	public List<String> getSearchSelectedTags() {
		List<String> tags = new ArrayList<String>();
		if(isSelected()) {
			tags.add(category.getTag());
		}
		for(CategoryStackField subcategory : subcategories) {
			tags.addAll(subcategory.getSearchSelectedTags());
		}
		return tags;
	}

	@Override
	public void onClick(ClickEvent event) {
		boolean value = isSelected();
		for(CategoryStackField subcategory : subcategories) {
			subcategory.setSelected(value);
		}
	}
	
}
