package action.student;

import model.Student;
import resourses.DependencyManager;
import service.StudentService;
import util.ConsoleReader;
import action.Action;

public class CreateStudent implements Action {
	@Override
	public void doAction() {
		StudentService ss = DependencyManager.getInstance(StudentService.class);
		Student s = new Student();
		System.out.println("vvedite nazvanie lekcii:");
		String name = ConsoleReader.readStringByConsole();
		s.setName(name);
		ss.create(s);
	}
}
