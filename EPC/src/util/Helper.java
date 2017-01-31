package util;

import java.util.ArrayList;
import java.util.Date;
import sort.*;
import model.*;

public class Helper {

	
		
	public static void sortLectionsOfCourse (String select, ArrayList<Course> courses, int num) {
		ArrayList<Lection> lections = courses.get(num).getLections();
		switch(select)
		{
		case ("alphabet"): {
			lections.sort(new SortByName());
			Utilites.showAfterSort(lections);
		}
		case ("date"): {
			lections.sort(new SortLectionByDate());
			Utilites.showAfterSort(lections);
		}
		}
	}
	public static void sortCourseAfterDate (ArrayList<Course> courses, Date date, String select) {
		Helper.sortCourse(select, Utilites.weedCourseByDate(courses, "before"));
	}
	public static void sortCourseBeforeDate (ArrayList<Course> courses, String select) {
		Helper.sortCourse(select, Utilites.weedCourseByDate(courses, "after"));
	}
	public static void showAll (ArrayList<Course> c, ArrayList<Student> s, ArrayList<Lector> l) {
		System.out.println("courses:"+c.size()+"/n"+
				"lectors:"+l.size()+"/n"+"students:"+s.size());
	}
}
