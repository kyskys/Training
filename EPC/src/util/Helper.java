package util;

import java.util.ArrayList;
import java.util.Date;

import sort.*;
import model.*;

public class Helper {

	public static void sortCourse (String select, ArrayList<Course> courses) {
		switch(select)
		{
		case("start date"):{
			courses.sort(new SortCourseByStartDate());
			Utilites.showCoursesAfterSort(courses);
		}
		case("students count"):{
			courses.sort(new SortCourseByStudentsCount());
			Utilites.showCoursesAfterSort(courses);
		}
		case("alphabet"):{
			courses.sort(new SortByName());
			Utilites.showCoursesAfterSort(courses);
		}
		}
	}
	public static void sortLector (String select, ArrayList<Lector> lectors) {
		switch(select)
		{
		case("alphabet"): {
			lectors.sort(new SortByName());
			Utilites.showLectorsAfterSort(lectors);
		}
		case("course count"): {
			lectors.sort(new SortLectorByCourseCount());
			Utilites.showLectorsAfterSort(lectors);
		}
		}		
	}
	public static void showDescriptionOfCourse(ArrayList<Course> courses, int num) {
		Course c = courses.get(num); //для того, чтобы каждый раз не вытаскивать из списка курсов 
		//(ходит миф, что так продуктивнее, если нет - поправь
		System.out.println("information:"+c.getInformationOfCourse()+"/n"+
		"lector:"+c.getLector().getName()+"/n"+"students:"+util.Utilites.showStudents(c));
	}
	public static void sortLectionsOfCourse (String select, ArrayList<Course> courses, int num) {
		ArrayList<Lection> lections = courses.get(num).getLections();
		switch(select)
		{
		case ("alphabet"): {
			lections.sort(new SortByName());
			Utilites.showLectionsAfterSort(lections);
		}
		case ("date"): {
			lections.sort(new SortLectionByDate());
			Utilites.showLectionsAfterSort(lections);
		}
		}
	}
	public static void sortCourseAfterDate (ArrayList<Course> courses, Date date, String select) {
		Helper.sortCourse(select, Utilites.weedCourseByDate(courses, date));
	}
}
