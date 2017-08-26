package util;

public class NumberRemoving {
	public static String evaluate(String s) {
		return s.replaceAll("[0-9]", "");
	}
}
