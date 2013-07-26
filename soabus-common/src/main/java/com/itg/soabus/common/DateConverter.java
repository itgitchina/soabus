package com.itg.soabus.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.apache.commons.beanutils.Converter;

public class DateConverter implements Converter {

	
	public Object convert(Class type, Object value) {

		if (value instanceof String) {
			SimpleDateFormat sdf2 = new SimpleDateFormat(
					"yyyy-MM-dd HH:mm:ss.SSS", Locale.ENGLISH);

			SimpleDateFormat sdf = new SimpleDateFormat(
					"EEE MMM d HH:mm:ss z yyyy", Locale.ENGLISH);
			Date result = null;

			try {
				result = sdf.parse((String) value);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (result == null) {
				try {
					result = sdf2.parse((String) value);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			return result;
		}
		if (value == null) {
			return null;
		}
		if (value instanceof Date) {
			return value;
		}

		return null;
	}
}
