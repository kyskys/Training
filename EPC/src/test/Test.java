package test;

import dao.*;
import service.*;
import model.*;
import resourses.DependencyManager;

public class Test {

	public static void main(String[] args) {
	CourseService cs = DependencyManager.getInstance(CourseService.class);
	cs.create(new Course());
	System.out.println(cs.get((long)0).getName());
	}
}
