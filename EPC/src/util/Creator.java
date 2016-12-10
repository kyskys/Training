package util;

import java.io.Console;

import model.Course;
import model.Lector;

public class Creator {
	
public void addCourse () {
	Course course = new Course(name,info);
	course.setLector(addLector());
}

public void addLector () {
	try {
		
	}
	catch {
		System.out.println("oshibka! povtorite");
		addLector();
	}
}
}
