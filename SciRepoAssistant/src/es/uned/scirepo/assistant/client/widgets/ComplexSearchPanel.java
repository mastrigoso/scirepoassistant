package es.uned.scirepo.assistant.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class ComplexSearchPanel extends Composite {

	private static ComplexSearchPanelUiBinder uiBinder = GWT
			.create(ComplexSearchPanelUiBinder.class);

	interface ComplexSearchPanelUiBinder extends
			UiBinder<Widget, ComplexSearchPanel> {
	}

	public ComplexSearchPanel() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
