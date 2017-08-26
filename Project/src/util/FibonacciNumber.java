package util;

import java.util.ArrayList;
import java.util.List;

public class FibonacciNumber {
	public static List<Long> evaluate(int n) {
		List<Long> l = new ArrayList<Long>();
		long a = 1;
		long b = 1;
		l.add(a);
		l.add(b);
		for (long f = a + b; f < n; f = a + b) {
			a = b;
			b = f;
			l.add(f);
		}
		return l;
	}
}
