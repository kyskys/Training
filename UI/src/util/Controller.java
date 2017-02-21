package util;

import menu.Menu;

public class Controller {
	public static void start(Menu menu) throws IllegalArgumentException, IllegalAccessException {
		while (menu != null) {
			menu.showMenu();
			int n = ConsoleReader.readIntByConsole();
			menu = menu.getList().get(n - 1).doWork();
		}
	}
}