package main;

import util.Controller;
import util.MenuBuilder;
import menu.Menu;
import menu.MenuPoint;

public class Main {

	public static void main(String[] args) {
		Menu m = MenuBuilder.buildMenu();
		Controller.start(m);

	}

}
