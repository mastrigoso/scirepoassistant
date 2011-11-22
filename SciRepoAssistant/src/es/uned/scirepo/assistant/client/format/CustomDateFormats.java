package es.uned.scirepo.assistant.client.format;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.shared.CustomDateTimeFormat;

public enum CustomDateFormats {

	SHORT_WITH_CENTURY(Formats.Util.getInstance().shortWithCentury());
	
	private DateTimeFormat format;
	
	CustomDateFormats(DateTimeFormat format){
		this.format = format;
	}
	
	public DateTimeFormat getFormat(){
		return this.format;
	}
	
	public interface Formats extends CustomDateTimeFormat{
		
		public static class Util {
		
			private static Formats instance;
			public static Formats getInstance(){
				if (instance == null) {
					instance = GWT.create(Formats.class);
				}
				return instance;
			}
		}
		
		@Pattern("MMddyyyy")
		DateTimeFormat shortWithCentury();
		
	}
	
}
