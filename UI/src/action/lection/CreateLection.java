package action.lection;

import java.util.Date;

import model.Lection;
import resourses.DependencyManager;
import service.LectionService;
import util.ConsoleReader;
import action.Action;

public class CreateLection implements Action {
	@Override
	public void doAction() {
		LectionService ls = DependencyManager.getInstance(LectionService.class);
		Lection l = new Lection();
		System.out.println("vvedite nazvanie lekcii:");
		String name = ConsoleReader.readStringByConsole();
		System.out.println("vvedite daty lekcii:");
		Date date = ConsoleReader.readDateByConsole();
		l.setName(name);
		l.setDate(date);
		ls.create(l);
	}
}
