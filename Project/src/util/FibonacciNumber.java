package util;

import java.util.ArrayList;
import java.util.List;

public class FibonacciNumber {
	public static Object evaluate(int n) {
		List<Integer> l = new ArrayList<Integer>();
		int a = 1;
		int b = 1;
		l.add(a);
		l.add(b);
		for (int f = a + b; f < n; f = a + b) {
			a = b;
			b = f;
			l.add(f);
			l.add(b);
		}
		return l;
	}
}
