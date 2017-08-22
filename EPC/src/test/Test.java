package test;

import java.util.ArrayList;
import java.util.List;

import annotation.Print;
import service.*;
import model.*;
import resourses.DependencyManager;

public class Test {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
	
	List<Course> list = new ArrayList<Course>();
	Course c = new Course();
	Course q = new Course();
	Course t = new Course();
	c.setName("kyrs1");
	c.setId((long) 2);
	q.setName("kyrs2");
	q.setId((long) 5);
	t.setName("kyrs3");
	t.setId((long) 12);
	list.add(c);
	list.add(q);
	list.add(t);
	Print.printList(list, Course.class);
	}
}
