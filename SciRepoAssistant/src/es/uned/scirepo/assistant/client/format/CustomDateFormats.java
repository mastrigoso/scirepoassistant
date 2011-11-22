package es.uned.scirepo.assistant.client.format;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.shared.CustomDateTimeFormat;
import com.google.gwt.user.datepicker.client.DateBox.Format;
import com.google.gwt.user.datepicker.client.DateBox.DefaultFormat;

public enum CustomDateFormats {

	SHORT_WITH_CENTURY(Formats.Util.getInstance().shortWithCentury());
	
	private DateTimeFormat format;
	private Format dateBoxFormat;
	
	CustomDateFormats(DateTimeFormat format){
		this.format = format;
		this.dateBoxFormat = 
			new DefaultFormat(format);
	}
	
	public DateTimeFormat getFormat(){
		return this.format;
	}
	
	public Format getDateBoxFormat(){
		return this.dateBoxFormat;
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
