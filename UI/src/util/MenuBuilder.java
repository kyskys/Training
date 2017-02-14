package util;

import action.course.CreateCourse;
import action.course.DeleteCourse;
import action.lection.CreateLection;
import action.lection.DeleteLection;
import action.lector.CreateLector;
import action.lector.DeleteLector;
import action.student.CreateStudent;
import action.student.DeleteStudent;
import menu.Menu;
import menu.MenuPoint;

public class MenuBuilder {
	public static Menu buildMenu() {
		Menu mainMenu = new Menu("glavnoe menu");
		Menu bd = new Menu("rabota s bd");
		Menu show = new Menu("vivod informacii");
		mainMenu.Add(new MenuPoint(bd, "rabota s bd"));
		mainMenu.Add(new MenuPoint(show, "vivod informacii"));
		mainMenu.Add(new MenuPoint(null, "vihod"));
		Menu courseServ = new Menu("menu raboti s kyrsami");
		courseServ.Add(new MenuPoint(mainMenu, "sozdat kyrs", new CreateCourse()));
		courseServ.Add(new MenuPoint(mainMenu, "ydalit kyrs", new DeleteCourse()));
		courseServ.Add(new MenuPoint(mainMenu, "dobavit lektora k kyrsy", null));
		courseServ.Add(new MenuPoint(mainMenu, "ydalit lektora y kyrsa", null));
		courseServ.Add(new MenuPoint(mainMenu, "dobavit lekciu k kyrsy", null));
		courseServ.Add(new MenuPoint(mainMenu, "ydalit lekciu y kyrsa", null));
		courseServ.Add(new MenuPoint(mainMenu, "dobavit studenta k kyrsy", null));
		courseServ.Add(new MenuPoint(mainMenu, "ydalit studenta y kyrsa", null));
		Menu lectorServ = new Menu("menu raboti s lektorami");
		lectorServ.Add(new MenuPoint(mainMenu, "sozdat lektora", new CreateLector()));
		lectorServ.Add(new MenuPoint(mainMenu, "ydalit lektora", new DeleteLector()));
		lectorServ.Add(new MenuPoint(mainMenu, "dobavit kyrs k lektory", null));
		lectorServ.Add(new MenuPoint(mainMenu, "ydalit kyrs y lektora", null));
		Menu lectionServ = new Menu("menu raboti s lekciyami");
		lectionServ.Add(new MenuPoint(mainMenu, "sozdat lekciu", new CreateLection()));
		lectionServ.Add(new MenuPoint(mainMenu, "ydalit lekciu", new DeleteLection()));
		lectionServ.Add(new MenuPoint(mainMenu, "dobavit kyrs k lekcii", null));
		lectionServ.Add(new MenuPoint(mainMenu, "ydalit kyrs y lekcii", null));
		lectionServ.Add(new MenuPoint(mainMenu, "dobavit daty k lekcii", null));
		lectionServ.Add(new MenuPoint(mainMenu, "ydalit daty y lekcii", null));
		Menu studentServ = new Menu("menu raboti s studentami");
		lectionServ.Add(new MenuPoint(mainMenu, "sozdat stydenta", new CreateStudent()));
		lectionServ.Add(new MenuPoint(mainMenu, "ydalit stydenta", new DeleteStudent()));
		lectionServ.Add(new MenuPoint(mainMenu, "dobavit kyrs y stydenta", null));
		lectionServ.Add(new MenuPoint(mainMenu, "ydalit kyrs y stydenta", null));
		bd.Add(new MenuPoint(courseServ, "ypravlenie kyrsami"));
		bd.Add(new MenuPoint(lectorServ, "ypravlenie lektorami"));
		bd.Add(new MenuPoint(lectionServ, "ypravlenie lekciyami"));
		bd.Add(new MenuPoint(studentServ, "ypravlenie studentami"));
		bd.Add(new MenuPoint(mainMenu, "na glavnoe menu"));
		Menu courseInfo = new Menu("informaciya o kyrse");
		courseInfo.Add(new MenuPoint(mainMenu,"sortirovat po date nachala",null));
		courseInfo.Add(new MenuPoint(mainMenu,"sortirovat po kolichestvy stydentov",null));
		courseInfo.Add(new MenuPoint(mainMenu,"sortirovat po lektory",null));
		courseInfo.Add(new MenuPoint(mainMenu,"sortirovat po alfavity",null));
		courseInfo.Add(new MenuPoint(mainMenu,"spisok kyrsov posle dati",null));
		courseInfo.Add(new MenuPoint(mainMenu,"spisok kyrsov kotorie yje idyt",null));
		Menu lectorInfo = new Menu("informaciya o lektorah");
		lectorInfo.Add(new MenuPoint(mainMenu,"sortirovat po alfavity",null));
		lectorInfo.Add(new MenuPoint(mainMenu,"sortirovat po kolichestvy kyrsov",null));
		Menu lectionInfo = new Menu("informaciya o lekciyah");
		lectionInfo.Add(new MenuPoint(mainMenu,"sortirovat po alfavity",null));
		lectionInfo.Add(new MenuPoint(mainMenu,"sortirovat po date",null));
		lectionInfo.Add(new MenuPoint(mainMenu,"spisok lekcii na daty",null));
		show.Add(new MenuPoint(courseInfo, "pokazat infy o kyrse"));
		show.Add(new MenuPoint(lectorInfo, "pokazat infy o lektorah"));
		show.Add(new MenuPoint(lectionInfo, "pokazat infy o lekciyah"));
		show.Add(new MenuPoint(mainMenu, "obwee chislo kyrsov, studentov, lektorov",null));
		show.Add(new MenuPoint(mainMenu, "na glavnoe menu"));
		return mainMenu;
	}

}
