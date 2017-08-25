package controller;

import java.util.Scanner;

import util.FibonacciNumber;
import util.LineCrossing;
import util.Palindrome;
import util.SimpleNumber;

public class Controller {
	private static Scanner in = new Scanner(System.in);
	private static boolean isEnd = false;
	private static Object toPrint;
	public static void start() {
		while (!isEnd) {
			System.out.println("1. simple number\n2. fibonacci number\n3. line crossing"
					+ "\n4. least common multipler / greatest common divisor\n5. palindrome"
					+ "\n6. number removing\n7. exit");
			int n = in.nextInt();
			switch (n) {
			case (1): {
				System.out.println("type number");
				toPrint = SimpleNumber.evaluate(in.nextInt());
				
				break;
			}
			case (2): {
				System.out.println("type number");
				toPrint = FibonacciNumber.evaluate(in.nextInt());
				break;
			}
			case (3): {
				System.out.println("type x1");
				int x1=in.nextInt();
				System.out.println("type y1");
				int y1=in.nextInt();
				System.out.println("type x2");
				int x2=in.nextInt();
				System.out.println("type y2");
				int y2=in.nextInt();
				toPrint = LineCrossing.evaluate(x1,y1,x2,y2);
				break;
			}
			case (4): {
				break;
			}
			case (5): {
				System.out.println("type word to check");
				toPrint = Palindrome.evaluate(in.next());
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
			System.out.println(toPrint);
		}
	}
}