package es.uned.scirepo.assistant.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class Layout extends Composite {

	private static IndexUiBinder uiBinder = GWT.create(IndexUiBinder.class);

	interface IndexUiBinder extends UiBinder<Widget, Layout> {
	}

	public Layout() {
		initWidget(uiBinder.createAndBindUi(this));
		
	}

}
