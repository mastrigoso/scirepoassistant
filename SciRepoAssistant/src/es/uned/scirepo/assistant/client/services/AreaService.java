package es.uned.scirepo.assistant.client.services;

import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import es.uned.scirepo.assistant.shared.domain.Area;

@RemoteServiceRelativePath("AreaService")
public interface AreaService extends RemoteService {

	public List<Area> getAllAreas();

	/**
	 * Utility class for simplifying access to the instance of async service.
	 */
	public static class Util {
		private static AreaServiceAsync instance;
		public static AreaServiceAsync getInstance(){
			if (instance == null) {
				instance = GWT.create(AreaService.class);
			}
			return instance;
		}
	}
	
}
