package es.uned.scirepo.assistant.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.Widget;

import es.uned.scirepo.assistant.client.resources.AppResources;

public class Index extends Composite {

	private static IndexUiBinder uiBinder = GWT.create(IndexUiBinder.class);

	interface IndexUiBinder extends UiBinder<Widget, Index> {
	}

	static{
		AppResources.RESOURCE.panelCSS().ensureInjected();
	}
	
	@UiField
	TabPanel searchTab;
	
	public Index() {
		initWidget(uiBinder.createAndBindUi(this));
		searchTab.selectTab(0);
	}

}
