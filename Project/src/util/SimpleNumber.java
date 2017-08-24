package util;

import java.util.ArrayList;
import java.util.List;

public class SimpleNumber {
	public static Object evaluate(Integer n) {
		List<Integer> l = new ArrayList<Integer>();
		for (int i = 3; i < n; i += 2) {
			l.add(i);
		}
		for (Integer i = 3; i * i < n; i += 2) {
			for (Integer j = i * i; j <= n; j += i) {
				if (l.contains(j)) {
					l.remove(j);
				}
			}
		}
		return l;
	}
}
