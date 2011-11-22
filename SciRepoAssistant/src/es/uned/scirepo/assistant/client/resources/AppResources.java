package es.uned.scirepo.assistant.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

import es.uned.scirepo.assistant.client.resources.css.ButtonStylesheet;
import es.uned.scirepo.assistant.client.resources.css.FooterStylesheet;
import es.uned.scirepo.assistant.client.resources.css.HeaderStylesheet;
import es.uned.scirepo.assistant.client.resources.css.PanelStylesheet;

public interface AppResources extends ClientBundle {

	public static final AppResources RESOURCE = GWT.create(AppResources.class);	
	
	@Source(value="es/uned/scirepo/assistant/client/resources/images/logo.gif")
	ImageResource logo();
	
	@Source(value="es/uned/scirepo/assistant/client/resources/images/loading-icon.gif")
	ImageResource loadingIcon();
	
	@Source(value="es/uned/scirepo/assistant/client/resources/images/login-icon.png")
	ImageResource loginIcon();
	
	@Source(value="es/uned/scirepo/assistant/client/resources/images/search-icon.png")
	ImageResource searchIcon();
	
	@Source(value="es/uned/scirepo/assistant/client/resources/images/wcag1AA.png")
	ImageResource wcagIcon();
	
	@Source(value="es/uned/scirepo/assistant/client/resources/images/xhtml-icon.gif")
	ImageResource xhtmlIcon();
	
	@Source(value="es/uned/scirepo/assistant/client/resources/images/css-icon.jpg")
	ImageResource cssIcon();
	
	@Source(value="es/uned/scirepo/assistant/client/resources/images/facebook.jpeg")
	ImageResource facebookLogo();
	
	@Source(value="es/uned/scirepo/assistant/client/resources/images/twitter.gif")
	ImageResource twitterLogo();
	
	@Source(value="es/uned/scirepo/assistant/client/resources/images/google.gif")
	ImageResource googleLogo();
	
	@Source(value="es/uned/scirepo/assistant/client/resources/images/linkedin.png")
	ImageResource linkedinLogo();
	
	@Source(value="es/uned/scirepo/assistant/client/resources/css/HeaderStylesheet.css")
	HeaderStylesheet headerCSS();
	
	@Source(value="es/uned/scirepo/assistant/client/resources/css/FooterStylesheet.css")
	FooterStylesheet footerCSS();

	@Source("es/uned/scirepo/assistant/client/resources/css/ButtonStylesheet.css")
	ButtonStylesheet buttonCSS();

	@Source("es/uned/scirepo/assistant/client/resources/css/ButtonStylesheet.css")
	ButtonStylesheet buttonStylesheet();

	@Source("es/uned/scirepo/assistant/client/resources/css/PanelStylesheet.css")
	PanelStylesheet panelCSS();
	
}
