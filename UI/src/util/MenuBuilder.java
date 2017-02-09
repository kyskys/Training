package util;

import menu.Menu;
import menu.MenuPoint;

public class MenuBuilder {
	public static Menu buildMenu() {
		Menu mainMenu = new Menu("glavnoe menu");
		Menu bd = new Menu("rabota s bd");
		Menu show = new Menu("vivod informacii");
		mainMenu.Add(new MenuPoint(bd, "menu 1"));
		mainMenu.Add(new MenuPoint(show, "menu 2"));
		mainMenu.Add(new MenuPoint(null, "vihod"));
		Menu courseServ = new Menu("menu raboti s kyrsami");
		courseServ.Add(new MenuPoint(mainMenu, "sozdat kyrs", null));
		courseServ.Add(new MenuPoint(mainMenu, "ydalit kyrs", null));
		courseServ.Add(new MenuPoint(mainMenu, "dobavit lektora k kyrsy", null));
		courseServ.Add(new MenuPoint(mainMenu, "ydalit lektora y kyrsa", null));
		courseServ.Add(new MenuPoint(mainMenu, "dobavit lekciu k kyrsy", null));
		courseServ.Add(new MenuPoint(mainMenu, "ydalit lekciu y kyrsa", null));
		courseServ.Add(new MenuPoint(mainMenu, "dobavit studenta k kyrsy", null));
		courseServ.Add(new MenuPoint(mainMenu, "ydalit studenta y kyrsa", null));
		Menu lectorServ = new Menu("menu raboti s lektorami");
		lectorServ.Add(new MenuPoint(mainMenu, "sozdat lektora", null));
		lectorServ.Add(new MenuPoint(mainMenu, "ydalit lektora", null));
		lectorServ.Add(new MenuPoint(mainMenu, "dobavit kyrs k lektory", null));
		lectorServ.Add(new MenuPoint(mainMenu, "ydalit kyrs y lektora", null));
		Menu lectionServ = new Menu("menu raboti s lekciyami");
		lectionServ.Add(new MenuPoint(mainMenu, "sozdat lekciu", null));
		lectionServ.Add(new MenuPoint(mainMenu, "ydalit lekciu", null));
		lectionServ.Add(new MenuPoint(mainMenu, "dobavit kyrs k lekcii", null));
		lectionServ.Add(new MenuPoint(mainMenu, "ydalit kyrs y lekcii", null));
		lectionServ.Add(new MenuPoint(mainMenu, "dobavit daty k lekcii", null));
		lectionServ.Add(new MenuPoint(mainMenu, "ydalit daty y lekcii", null));
		Menu studentServ = new Menu("menu raboti s studentami");
		bd.Add(new MenuPoint(courseServ, "ypravlenie kyrsami"));
		bd.Add(new MenuPoint(lectorServ, "ypravlenie lektorami"));
		bd.Add(new MenuPoint(lectionServ, "ypravlenie lekciyami"));
		bd.Add(new MenuPoint(studentServ, "ypravlenie studentami"));
		bd.Add(new MenuPoint(mainMenu, "na glavnoe menu"));
		
		show.Add(new MenuPoint(mainMenu, "nazad"));
		return mainMenu;
	}

}
