package util;

public enum MonthEnum {
	JANUARY(1, Season.WINTER), FEBRUARY(2, Season.WINTER), MARCH(3, Season.SPRING), APRIL(4, Season.SPRING), MAY(5,
			Season.SPRING), JUNE(6, Season.SUMMER), JULY(7, Season.SUMMER), AUGUST(8, Season.SUMMER), SEPTEMBER(9,
					Season.AUTUMN), OCTOBER(10,
							Season.AUTUMN), NOVEMBER(11, Season.AUTUMN), DECEMBER(12, Season.WINTER);

	MonthEnum(int n, Season s) {
		this.s = s;
		this.n = n;
	}

	Season s;
	int n;

	public String toString() {
		return ("number: " + n + " season: " + s);
	}
}

enum Season {
	SPRING, SUMMER, AUTUMN, WINTER;
}
