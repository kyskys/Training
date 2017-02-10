package action.lector;

import model.Lector;
import resourses.DependencyManager;
import service.LectorService;
import util.ConsoleReader;
import action.Action;

public class CreateLector implements Action {
	@Override
	public void doAction() {
		LectorService ls = DependencyManager.getInstance(LectorService.class);
		Lector l = new Lector();
		System.out.println("vvedite nazvanie lekcii:");
		String name = ConsoleReader.readStringByConsole();
		l.setName(name);
		ls.create(l);
	}
}
