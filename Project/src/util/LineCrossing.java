package util;

public class LineCrossing {
	public static String evaluate(int x11, int y11, int x12, int y12, int x21, int y21, int x22, int y22) {
		if((x11==x21&&y11==y21)||(x11==x22&&y11==y22)||(x12==x21&&y12==y21)||(x12==x22&&y12==y22)) {
			return "crossing in edge";
		}
		return null;
	}
}
