package action.lector;

import java.util.List;

import model.Lector;
import resourses.DependencyManager;
import service.LectorService;
import util.ConsoleReader;
import action.Action;

public class DeleteLector implements Action {

	@Override
	public void doAction() {
		LectorService ls = DependencyManager.getInstance(LectorService.class);
		List<Lector> list = ls.getAll(null);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ". " + list.get(i) + ", id = " + list.get(i).getId()
					+ "\n");
		}
		System.out.println("\nviberite id dlya ydaleniya");
		int n = ConsoleReader.readIntByConsole();
		ls.delete(ls.get((long)n));

	}
}
