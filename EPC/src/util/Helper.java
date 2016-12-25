package util;

import java.util.ArrayList;

import sort.*;
import model.*;

public class Helper {

	public static void sortCourse (String select, ArrayList<Course> courses) {
		switch(select)
		{
		case("start date"):{
			courses.sort(new SortCourseByStartDate());
		}
		case("students count"):{
			courses.sort(new SortCourseByStudentsCount());
		}
		case("alphabet"):{
			courses.sort(new SortByName());
		}
		}
	}
	public static void sortLector (String select, ArrayList<Lector> lectors) {
		switch(select)
		{
		case("alphabet"): {
			lectors.sort(new SortByName());
		}
		case("course count"): {
			lectors.sort(new SortLectorByCourseCount());
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
		}
		case ("date"): {
			lections.sort(new SortLectionByDate());
		}
		}
	}
}
