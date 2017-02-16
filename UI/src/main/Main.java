package main;

import java.io.IOException;
import storage.StorageDAO;
import util.Controller;
import util.MenuBuilder;
import menu.Menu;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		StorageDAO.load("file.txt");
		Menu m = MenuBuilder.buildMenu();
		Controller.start(m);
		StorageDAO.save("file.txt");
		
	}

}
