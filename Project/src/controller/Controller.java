package controller;

import java.util.Scanner;

public class Controller {
	private static Scanner in = new Scanner(System.in);
	private static boolean isEnd = false;

	public static void start() {
		while (true) {
			if (isEnd) {
				break;
			}
			System.out.println("1. simple number\n2. fibonacci number\n3. line crossing"
					+ "\n4. least common multipler / greatest common divisor\n5. palindrome"
					+ "\n6. number removing\n7. exit");
			int n = in.nextInt();
			switch (n) {
			case (1): {
				break;
			}
			case (2): {
				break;
			}
			case (3): {
				break;
			}
			case (4): {
				break;
			}
			case (5): {
				break;
			}
			case (6): {
				break;
			}
			case (7): {
				isEnd=true;
				break;
			}
			}
		}
	}
}
