package es.uned.scirepo.assistant.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class LoadingPanel extends Composite {

	private static LoadingPanelUiBinder uiBinder = GWT
			.create(LoadingPanelUiBinder.class);

	interface LoadingPanelUiBinder extends UiBinder<Widget, LoadingPanel> {
	}

	@UiField Image image;
	
	@UiField Label logo;
	
	public LoadingPanel() {
		initWidget(uiBinder.createAndBindUi(this));
		logo.setText("");
		image.setTitle("");
	}
	
	public void setText(String text){
		logo.setText(text);
		image.setTitle(text);
	}

}
