package main;

import util.Helper;
import util.MonthEnum;

public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		MonthEnum me = MonthEnum.JANUARY;
		System.out.println(me.getNumber());
		System.out.println(me.getSeason());
		Integer i = Helper.stringParse("12", Integer.class);
		System.out.println(i);
	}

}
