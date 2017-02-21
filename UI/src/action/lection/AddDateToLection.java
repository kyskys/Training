package action.lection;

import java.util.Date;
import java.util.List;

import action.Action;
import annotation.Print;
import model.Course;
import model.Lection;
import model.Lector;
import resourses.DependencyManager;
import service.CourseService;
import service.LectionService;
import service.LectorService;
import util.ConsoleReader;

public class AddDateToLection implements Action{

	@Override
	public void doAction() throws IllegalArgumentException, IllegalAccessException {
		LectionService ls = DependencyManager.getInstance(LectionService.class);
		List<Lection> list = ls.getAll(null);
		Print.printList(list, Lection.class);
		System.out.println("\nChoose lection:");
		long n = ConsoleReader.readIntByConsole();
		Lection l = ls.get(n);
		Date d = ConsoleReader.readDateByConsole();
		l.setDate(d);
	}

}
