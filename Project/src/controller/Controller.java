package controller;

import java.util.Scanner;

import util.DivisorMultipler;
import util.FibonacciNumber;
import util.LineCrossing;
import util.NumberRemoving;
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
				System.out.println("type x11");
				int x11=in.nextInt();
				System.out.println("type y11");
				int y11=in.nextInt();
				System.out.println("type x12");
				int x12=in.nextInt();
				System.out.println("type y12");
				int y12=in.nextInt();
				System.out.println("type x21");
				int x21=in.nextInt();
				System.out.println("type y21");
				int y21=in.nextInt();
				System.out.println("type x22");
				int x22=in.nextInt();
				System.out.println("type y22");
				int y22=in.nextInt();
				toPrint = LineCrossing.evaluate(x11,y11,x12,y12,x21,y21,x22,y22);
				break;
			}
			case (4): {
				System.out.println("type 1st number");
				int n1=in.nextInt();
				System.out.println("type 2nd number");
				int n2=in.nextInt();
				toPrint = DivisorMultipler.evaluate(n1,n2);
				break;
			}
			case (5): {
				System.out.println("type word to check");
				toPrint = Palindrome.evaluate(in.nextLine());
				break;
			}
			case (6): {
				System.out.println("type word to check");
				toPrint = NumberRemoving.evaluate(in.next());
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