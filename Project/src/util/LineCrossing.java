package util;

public class LineCrossing {
	public static boolean evaluate(double x1, double y1, double x2, double y2, double x3, double y3, double x4,
			double y4) {
		try {
			double t1 = ((x2 - x1) * (y1 - y3) + (y2 - y1) * (x3 - x1))
					/ ((y4 - y3) * (x2 - x1) - (x4 - x3) * (y2 - y1));
			if (0 < t1 && t1 < 1) {
				double t2 = ((x3 - x1) + t1 * (x4 - x3)) / (x2 - x1);
				if (0 < t2 && t2 < 1) {
					return true;
				} else
					return false;
			} else
				return false;
		} catch (Exception e) {
			return false;
		}
	}
}
