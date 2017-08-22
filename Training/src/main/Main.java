package main;

import java.util.Date;

import util.Helper;
import util.MonthEnum;

public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		System.out.println(MonthEnum.APRIL);
		Float f = Helper.strToFloat("152");
		Integer i = Helper.strToInt("112");
		Double d = Helper.strToDouble("11.11");
		Date dt = Helper.strToDate("12.12.12");
		System.out.println(dt);
		Boolean b = Helper.strToBoolean("true");
		int n=0;
	}

}
