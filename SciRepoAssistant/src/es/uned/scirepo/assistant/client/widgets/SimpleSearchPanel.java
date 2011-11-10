package es.uned.scirepo.assistant.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class SimpleSearchPanel extends Composite {

	private static SimpleSearchPanelUiBinder uiBinder = GWT
			.create(SimpleSearchPanelUiBinder.class);

	interface SimpleSearchPanelUiBinder extends
			UiBinder<Widget, SimpleSearchPanel> {
	}

	public SimpleSearchPanel() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
