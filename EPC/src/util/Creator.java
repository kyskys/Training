package util;

import java.util.ArrayList;
import java.util.Date;

import model.Abstract;
import model.Course;
import model.Lection;
import model.Lector;
import model.Student;

public class Creator {
	

public static Course addCourse (String name, String info) {
	Course course = new Course(name,info);
	return course;
}

public static Lector addLector (String name) {
	Lector lector = new Lector(name);
	return lector;
}

public static Student addStudent (String name) {
	Student stud = new Student(name);
	return stud;
}

public static Lection addLection (String name, Date date) {
	Lection lect = new Lection(name, date);
	return lect;
}

public static void delete (ArrayList<Abstract> mas, Abstract abs)	{
	mas.remove(abs);
}

}
