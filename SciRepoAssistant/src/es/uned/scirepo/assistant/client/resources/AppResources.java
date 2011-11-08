package es.uned.scirepo.assistant.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

import es.uned.scirepo.assistant.client.resources.css.HeaderStylesheet;

public interface AppResources extends ClientBundle {

	public static final AppResources RESOURCE = GWT.create(AppResources.class);
	
	@Source(value="es/uned/scirepo/assistant/client/resources/images/logo.gif")
	ImageResource logo();
	
	@Source(value="es/uned/scirepo/assistant/client/resources/images/wcag1AA.png")
	ImageResource wcag();
	
	@Source(value="es/uned/scirepo/assistant/client/resources/css/HeaderStylesheet.css")
	HeaderStylesheet headerStylesheet();
	
}
