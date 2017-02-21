package action.lection;

import java.util.Date;
import java.util.List;

import action.Action;
import annotation.Print;
import model.Lection;
import resourses.DependencyManager;
import service.LectionService;
import sort.SortParams;
import util.ConsoleReader;

public class LectionsOnDate implements Action{

	@Override
	public void doAction() throws IllegalArgumentException, IllegalAccessException {
		LectionService ls = DependencyManager.getInstance(LectionService.class);
		Date date = ConsoleReader.readDateByConsole();
		List<Lection> list = ls.ListOfLectionsOnDate(date);
		Print.printList(list, Lection.class);
	}

}
