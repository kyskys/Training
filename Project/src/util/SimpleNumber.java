package util;

import java.util.ArrayList;
import java.util.List;

public class SimpleNumber {
	public static List<?> evaluate(Integer n) {
		List<Long> l = new ArrayList<Long>();
		l.add((long) 2);
		for (long i = 3; i < n; i += 2) {
			l.add(i);
		}
		for (long i = 3; i * i < n; i += 2) {
			for (long j = i * i; j <= n; j += i) {
				if (l.contains(j)) {
					l.remove(j);
				}
			}
		}
		return l;
	}
}
