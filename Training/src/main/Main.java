package main;

import util.MonthEnum;

public class Main {

	public static void main(String[] args) {
		MonthEnum me = MonthEnum.JANUARY;
		System.out.println(me.getNumber());
		System.out.println(me.getSeason());
	}

}
