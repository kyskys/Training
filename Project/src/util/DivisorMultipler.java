package util;

public class DivisorMultipler {

	public static String evaluate(int n1, int n2) {
		double divisor = gcd(n1, n2);
		double multipler = lcm(n1,n2,divisor);
		return("gcd: "+divisor+"/nlcm: "+multipler);
	}

	private static double gcd(int n1, int n2) {
		if (n2 == 0) {
			return n1;
		} else
			return gcd(n2, n1 % n2);
	}

	private static double lcm(int n1, int n2, double divisor) {
		return n1 / divisor * n2;
	}
}
