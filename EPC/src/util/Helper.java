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
		Course c = courses.get(num); //��� ����, ����� ������ ��� �� ����������� �� ������ ������ 
		//(����� ���, ��� ��� ������������, ���� ��� - �������
		System.out.println("information:"+c.getInformationOfCourse()+"/n"+
		"lector:"+c.getLector().getName()+"/n"+"students:"+util.Utilites.showStudents(c));
	}
}
