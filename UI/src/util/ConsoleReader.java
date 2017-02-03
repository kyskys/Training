package util;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ConsoleReader {
	private Scanner in = new Scanner(System.in);

	public Integer readIntByConsole() throws InputMismatchException,
			NoSuchElementException {
		Integer i;
		try {
			System.out.println("vvedite cifry:");
			i = Integer.valueOf(in.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("neverniy vvod, povtorie vvod");
			return readIntByConsole();
		} catch (NoSuchElementException e) {
			System.out.println("pystaya stroka, povtorite vvod");
			return readIntByConsole();
		}
		return i;

	}

	public StringBuilder readStringByConsole() {
		StringBuilder s = new StringBuilder();
		try {
			System.out.println("vvedite frazy:");
			s.append(in.nextLine());
		} catch (NoSuchElementException e) {
			System.out.println("pystaya stroka, povtorite vvod");
			return readStringByConsole();
		}
		return s;
	}

	public Date readDateByConsole() {
		Date d = null;
		try {
			System.out.println("vvedite daty (dd/mm/yy:"); //как сделать ввод строки я не знаю
			in.
			
		} catch (InputMismatchException e) {
			System.out.println("neverniy vvod, povtorie vvod");
			return readDateByConsole();
		} catch (NoSuchElementException e) {
			System.out.println("pystaya stroka, povtorite vvod");
			return readDateByConsole();
		}
		return d;
	}
}
