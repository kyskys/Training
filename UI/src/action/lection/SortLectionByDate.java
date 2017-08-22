package action.lection;

import java.util.List;

import action.Action;
import annotation.Print;
import model.Lection;
import resourses.DependencyManager;
import service.LectionService;
import sort.SortParams;

public class SortLectionByDate implements Action{

	@Override
	public void doAction() throws IllegalArgumentException, IllegalAccessException {
		LectionService ls = DependencyManager.getInstance(LectionService.class);
		List<Lection> list = ls.getAll(SortParams.DATE);
		Print.printList(list, Lection.class);
	}

}
