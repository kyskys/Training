package action.student;

import java.util.List;

import model.Student;
import resourses.DependencyManager;
import service.StudentService;
import util.ConsoleReader;
import action.Action;

public class DeleteStudent implements Action {

	@Override
	public void doAction() {
		StudentService ls = DependencyManager.getInstance(StudentService.class);
		List<Student> list = ls.getAll(null);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ". " + list.get(i) + ", id = " + list.get(i).getId()
					+ "\n");
		}
		System.out.println("\nviberite id dlya ydaleniya");
		int n = ConsoleReader.readIntByConsole();
		ls.delete(ls.get((long)n));

	}
}
