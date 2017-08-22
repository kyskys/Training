package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Helper {
	public static Integer strToInt (String str) {
		return new Integer(str);
	}
	public static Double strToDouble (String str) {
		return new Double(str);
	}
	public static Float strToFloat (String str) {
		return new Float(str);
	}
	public static Date strToDate (String str) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yy");
		try {
			return sdf.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null; 
	}
	public static Boolean strToBoolean (String str) {
		return new Boolean(str);
	}
	}

