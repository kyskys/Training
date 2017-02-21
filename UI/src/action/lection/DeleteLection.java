package action.lection;

import java.util.List;

import model.Lection;
import resourses.DependencyManager;
import service.LectionService;
import util.ConsoleReader;
import action.Action;
import annotation.Print;

public class DeleteLection implements Action {

	@Override
	public void doAction() throws IllegalArgumentException, IllegalAccessException {
		LectionService ls = DependencyManager.getInstance(LectionService.class);
		List<Lection> list = ls.getAll(null);
		Print.printList(list, Lection.class);
		System.out.println("choose id for deleting:");
		long n = ConsoleReader.readLongByConsole();
		ls.delete(ls.get(n));

	}
}
