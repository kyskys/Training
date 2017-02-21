package action.lector;

import java.util.List;

import action.Action;
import annotation.Print;
import model.Lector;
import resourses.DependencyManager;
import service.LectorService;
import sort.SortParams;

public class SortLectorByName implements Action{

	@Override
	public void doAction() throws IllegalArgumentException, IllegalAccessException {
		LectorService ls = DependencyManager.getInstance(LectorService.class);
		List<Lector> list = ls.getAll(SortParams.NAME);
		Print.printList(list, Lector.class);
	}

}
