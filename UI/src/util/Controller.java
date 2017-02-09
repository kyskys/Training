package util;

import menu.Menu;

public class Controller {
	public static void start(Menu menu) {
		while (true) {
			menu.showMenu();
			int n = ConsoleReader.readIntByConsole();
			menu = menu.getList().get(n).doWork();
			if (menu.getTitle().equals("glavnoe menu:") && n == 0) {
				break;
			}
		}
	}
}