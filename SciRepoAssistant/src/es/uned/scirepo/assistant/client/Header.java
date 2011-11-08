package es.uned.scirepo.assistant.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.Image;

import es.uned.scirepo.assistant.client.resources.AppResources;


public class Header extends Composite {

	private static HeaderUiBinder uiBinder = GWT.create(HeaderUiBinder.class);
	
	@UiField HTMLPanel logoDiv;
	
	interface HeaderUiBinder extends UiBinder<Widget, Header> {
	}
	
	public Header() {
		initWidget(uiBinder.createAndBindUi(this));
		logoDiv.add(new Image(AppResources.RESOURCE.logo()));
	}

}
