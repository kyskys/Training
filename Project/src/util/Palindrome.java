package util;

public class Palindrome {

	public static Object evaluate(String s) {
		boolean result = true;
		char[] str = s.toCharArray();
		int l = str.length;
		for (int i = 0; i < l / 2; i++) {
			if (str[i] != str[l - 1 - i]) {
				result = false;
				break;
			}
		}
		return result;
	}
}
