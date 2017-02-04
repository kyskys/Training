package test;

import java.sql.Date;
import java.util.ArrayList;

import dao.impl.LectorDAOImpl;
import model.Course;
import model.Lection;
import model.Lector;
import model.Student;

public class Test {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		final String className = "model.Course";
		try {
			Class<?> c = Class.forName(className);
			Course cc = (Course) c.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
	}
}
