package es.uned.scirepo.assistant.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

import es.uned.scirepo.assistant.client.resources.AppResources;

public class Footer extends Composite {

	private static FooterUiBinder uiBinder = GWT.create(FooterUiBinder.class);
	
	interface FooterUiBinder extends UiBinder<Widget, Footer> {
	}

	static{
		AppResources.RESOURCE.footerCSS().ensureInjected();
	}
	
	public Footer() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
