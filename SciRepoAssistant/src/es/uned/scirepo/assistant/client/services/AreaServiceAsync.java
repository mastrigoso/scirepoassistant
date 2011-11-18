package es.uned.scirepo.assistant.client.services;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;

import es.uned.scirepo.assistant.shared.domain.Area;

public interface AreaServiceAsync {

	void getAllAreas(AsyncCallback<List<Area>> callback);

}
