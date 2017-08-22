package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ConsoleReader {
	private static Scanner in = new Scanner(System.in);

	public static Long readLongByConsole() throws InputMismatchException,
			NoSuchElementException {
		Long i;
		try {
			i = Long.valueOf(in.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("neverniy vvod, povtorie vvod");
			return readLongByConsole();
		} catch (NoSuchElementException e) {
			System.out.println("pystaya stroka, povtorite vvod");
			return readLongByConsole();
		}
		return i;

	}

	public static String readStringByConsole() {
		try {
			return in.nextLine();
		} catch (NoSuchElementException e) {
			System.out.println("pystaya stroka, povtorite vvod");
			return readStringByConsole();
		}
	}

	public static Date readDateByConsole() {
		Date d = null;
		try {
			System.out.println("vvedite daty (dd.mm.yyyy:"); 
			String s = in.nextLine();
			SimpleDateFormat f = new SimpleDateFormat("dd.MM.yyyy");
			d = f.parse(s);

		} catch (InputMismatchException e) {
			System.out.println("neverniy vvod, povtorie vvod");
			return readDateByConsole();
		} catch (ParseException e) {
			System.out.println("owibka formata, povtorite vvod");
			return readDateByConsole();
		}
		return d;
	}
}
