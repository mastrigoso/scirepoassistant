package es.uned.scirepo.assistant.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

import es.uned.scirepo.assistant.client.resources.AppResources;

public class RegisterPanel extends Composite {

	private static RegisterPanelUiBinder uiBinder = GWT
			.create(RegisterPanelUiBinder.class);

	interface RegisterPanelUiBinder extends UiBinder<Widget, RegisterPanel> {
	}

	static{
		AppResources.RESOURCE.buttonCSS().ensureInjected();
	}
	
	public RegisterPanel() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
