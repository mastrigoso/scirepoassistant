package es.uned.scirepo.assistant.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;

import es.uned.scirepo.assistant.client.resources.AppResources;

public class Footer extends Composite {

	private static FooterUiBinder uiBinder = GWT.create(FooterUiBinder.class);
	
	@UiField
	Anchor wcagLink;
	
	interface FooterUiBinder extends UiBinder<Widget, Footer> {
	}

	static{
		AppResources.RESOURCE.footerCSS().ensureInjected();
	}
	
	public Footer() {
		initWidget(uiBinder.createAndBindUi(this));
		Image wcagImage = new Image(AppResources.RESOURCE.wcag());
		wcagImage.setAltText("Level Double-A conformance icon, W3C-WAI Web Content Accessibility Guidelines 1.0");
		DOM.insertChild(wcagLink.getElement(), wcagImage.getElement(),0);
	}

}
