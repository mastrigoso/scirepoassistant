package es.uned.scirepo.assistant.client.widgets;

import com.gargoylesoftware.htmlunit.javascript.host.Event;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.SimplePanel;

import es.uned.scirepo.assistant.client.resources.AppResources;

public class ImageAnchor extends Anchor{

	static{
		AppResources.RESOURCE.buttonCSS().ensureInjected();
	}
	
	final Image img = new Image();
	final ImagePanel imagePanel = new ImagePanel();
	
	public ImageAnchor(){
		super();
		this.img.setAltText("");
		DOM.insertChild(getElement(), imagePanel.getElement(), 0);
		imagePanel.add(this.img);
		imagePanel.setWidth(this.img.getWidth()+"px");
		imagePanel.setHeight(this.img.getHeight()+"px");

	}
	
	public void setResource(ImageResource imageResource){
		this.img.setResource(imageResource);
		imagePanel.setWidth(this.img.getWidth()+"px");
		imagePanel.setHeight(this.img.getHeight()+"px");
	}
	
	public void setImageAlt(String text) {	
		this.img.setAltText(text);
	}
	
	private class ImagePanel extends SimplePanel implements MouseOverHandler, MouseOutHandler{
		
		public ImagePanel(){
			super();
			addMouseOverHandler(this);
			addMouseOutHandler(this);
			sinkEvents(Event.MOUSEOUT | Event.MOUSEOVER);
		}

		@Override
		public void onMouseOut(MouseOutEvent event) {
			setStyleName("");
		}

		@Override
		public void onMouseOver(MouseOverEvent event) {
			setStyleName(AppResources.RESOURCE.buttonCSS().imageAnchorHoveringBorder());
		}
		
	}
}
