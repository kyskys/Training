package util;
import menu.Menu;
import menu.MenuPoint;

public class MenuBuilder {
	public static Menu buildMenu() {
		Menu mainMenu = new Menu("glavnoe menu");
		Menu menu_1 = new Menu("pervoe menu");
		Menu menu_2 = new Menu("vtoroe menu");
		mainMenu.getList().add(new MenuPoint(menu_1, "menu 1"));
		mainMenu.getList().add(new MenuPoint(menu_2, "menu 2"));
		menu_1.getList().add(new MenuPoint(mainMenu, "nazad"));
		menu_2.getList().add(new MenuPoint(mainMenu, "nazad"));
		return mainMenu;
	}
	
}
