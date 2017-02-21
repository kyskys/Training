package action.student;

import java.util.List;

import model.Student;
import resourses.DependencyManager;
import service.StudentService;
import util.ConsoleReader;
import action.Action;
import annotation.Print;

public class DeleteStudent implements Action {

	@Override
	public void doAction() throws IllegalArgumentException, IllegalAccessException {
		StudentService ls = DependencyManager.getInstance(StudentService.class);
		List<Student> list = ls.getAll(null);
		Print.printList(list, Student.class);
		System.out.println("\nchoose id for deleting:");
		long n = ConsoleReader.readLongByConsole();
		ls.delete(ls.get(n));

	}
}
