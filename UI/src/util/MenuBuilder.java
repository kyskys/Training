package util;
import menu.Menu;
import menu.MenuPoint;

public class MenuBuilder {
	public static Menu buildMenu() {
		Menu mainMenu = new Menu("glavnoe menu");
		Menu bd = new Menu("rabota s bd");
		Menu show = new Menu("vivod informacii");
		mainMenu.getList().add(new MenuPoint(bd, "menu 1"));
		mainMenu.getList().add(new MenuPoint(show, "menu 2"));
		bd.getList().add(new MenuPoint(mainMenu, "nazad"));
		show.getList().add(new MenuPoint(mainMenu, "nazad"));
		return mainMenu;
	}
	
}
