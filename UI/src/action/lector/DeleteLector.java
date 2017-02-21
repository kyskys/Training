package action.lector;

import java.util.List;

import model.Lector;
import resourses.DependencyManager;
import service.LectorService;
import util.ConsoleReader;
import action.Action;
import annotation.Print;

public class DeleteLector implements Action {

	@Override
	public void doAction() throws IllegalArgumentException, IllegalAccessException {
		LectorService ls = DependencyManager.getInstance(LectorService.class);
		List<Lector> list = ls.getAll(null);
		Print.printList(list, Lector.class);
		System.out.println("choose id for deleting:");
		long n = ConsoleReader.readLongByConsole();
		ls.delete(ls.get(n));

	}
}
