package es.uned.scirepo.assistant.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

import es.uned.scirepo.assistant.client.resources.AppResources;


public class Header extends Composite {

	private static HeaderUiBinder uiBinder = GWT.create(HeaderUiBinder.class);
	
	interface HeaderUiBinder extends UiBinder<Widget, Header> {
	}
	
	static{
		AppResources.RESOURCE.headerCSS().ensureInjected();
	}
	
	public Header() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
