package action.lection;

import java.util.List;

import model.Lection;
import resourses.DependencyManager;
import service.LectionService;
import util.ConsoleReader;
import action.Action;

public class DeleteLection implements Action {

	@Override
	public void doAction() {
		LectionService ls = DependencyManager.getInstance(LectionService.class);
		List<Lection> list = ls.getAll(null);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ". " + list.get(i) + ", id = " + list.get(i).getId()
					+ "\n");
		}
		System.out.println("\nviberite id dlya ydaleniya");
		int n = ConsoleReader.readIntByConsole();
		ls.delete(ls.get((long)n));

	}
}
