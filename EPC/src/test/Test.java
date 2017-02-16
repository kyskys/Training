package test;

import annotation.Print;
import service.*;
import model.*;
import resourses.DependencyManager;

public class Test {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
	
	Print.printList(Course.class);
	}
}
