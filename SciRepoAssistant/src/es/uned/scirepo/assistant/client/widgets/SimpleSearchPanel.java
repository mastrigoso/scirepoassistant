package es.uned.scirepo.assistant.client.widgets;

import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.StackPanel;
import com.google.gwt.user.client.ui.Widget;

import es.uned.scirepo.assistant.client.services.AreaService;
import es.uned.scirepo.assistant.client.services.AreaServiceAsync;
import es.uned.scirepo.assistant.shared.domain.Area;

public class SimpleSearchPanel extends Composite {

	private static SimpleSearchPanelUiBinder uiBinder = GWT
			.create(SimpleSearchPanelUiBinder.class);

	private static AreaServiceAsync areaService = AreaService.Util.getInstance();
	
	interface SimpleSearchPanelUiBinder extends
			UiBinder<Widget, SimpleSearchPanel> {
	}

	@UiField 
	StackPanel areasStack;
	
	public SimpleSearchPanel() {
		initWidget(uiBinder.createAndBindUi(this));
		areaService.getAllAreas(new AsyncCallback<List<Area>>() {
			
			@Override
			public void onSuccess(List<Area> result) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}

}
