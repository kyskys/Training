package util;

import java.util.ArrayList;

import sort.*;
import model.Course;

public class Helper {

	public static void sortCourse (String select, ArrayList<Course> courses)
	{
		switch(select)
		{
		case("start date"):{
			courses.sort(new SortCourseByStartDate());
		}
		case("students count"):{
			courses.sort(new SortCourseByStudentsCount());
		}
		
		}
	}
}
