package test;

import service.*;
import model.*;
import resourses.DependencyManager;

public class Test {

	public static void main(String[] args) {
	CourseService cs = DependencyManager.getInstance(CourseService.class);
	cs.create(new Course());
	cs.get((long) 1).setName("slaik");
	System.out.println(cs.get((long) 1).getName());
	System.out.println("los/nlos\nasd");
	}
}
