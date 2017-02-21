package util;

import action.TotalCount;
import action.course.AddLectionToCourse;
import action.course.AddLectorToCourse;
import action.course.AddStudentToCourse;
import action.course.CourseAfterDate;
import action.course.CourseBeforeDate;
import action.course.CreateCourse;
import action.course.DeleteCourse;
import action.course.DeleteLectionFromCourse;
import action.course.DeleteLectorFromCourse;
import action.course.DeleteStudentFromCourse;
import action.course.SortCourseByLector;
import action.course.SortCourseByName;
import action.course.SortCourseByStartDate;
import action.course.SortCourseByStudentCount;
import action.lection.AddCourseToLection;
import action.lection.CreateLection;
import action.lection.DeleteCourseFromLection;
import action.lection.DeleteLection;
import action.lection.LectionsOnDate;
import action.lection.SetDateForLection;
import action.lection.SortLectionByDate;
import action.lection.SortLectionByName;
import action.lector.AddCourseToLector;
import action.lector.CreateLector;
import action.lector.DeleteCourseFromLector;
import action.lector.DeleteLector;
import action.lector.SortLectorByCourseCount;
import action.lector.SortLectorByName;
import action.student.AddCourseToStudent;
import action.student.CreateStudent;
import action.student.DeleteCourseFromStudent;
import action.student.DeleteStudent;
import menu.Menu;
import menu.MenuPoint;

public class MenuBuilder {
	public static Menu buildMenu() {
		Menu mainMenu = new Menu("Main menu");
		Menu bd = new Menu("Work with database");
		Menu show = new Menu("Show information");
		mainMenu.Add(new MenuPoint(bd, "work with database"));
		mainMenu.Add(new MenuPoint(show, "show information"));
		mainMenu.Add(new MenuPoint(null, "exit"));
		Menu courseServ = new Menu("Course menu");
		courseServ.Add(new MenuPoint(bd, "create course", new CreateCourse()));
		courseServ.Add(new MenuPoint(bd, "delete course", new DeleteCourse()));
		courseServ.Add(new MenuPoint(bd, "add lector to course", new AddLectorToCourse()));
		courseServ.Add(new MenuPoint(bd, "delete lector from course", new DeleteLectorFromCourse()));
		courseServ.Add(new MenuPoint(bd, "add lection to course", new AddLectionToCourse()));
		courseServ.Add(new MenuPoint(bd, "delete lection from course", new DeleteLectionFromCourse()));
		courseServ.Add(new MenuPoint(bd, "add student to course", new AddStudentToCourse()));
		courseServ.Add(new MenuPoint(bd, "delete student from course", new DeleteStudentFromCourse()));
		courseServ.Add(new MenuPoint(bd, "back"));
		Menu lectorServ = new Menu("Lector menu");
		lectorServ.Add(new MenuPoint(bd, "create lector", new CreateLector()));
		lectorServ.Add(new MenuPoint(bd, "delete lector", new DeleteLector()));
		lectorServ.Add(new MenuPoint(bd, "add course to lector", new AddCourseToLector()));
		lectorServ.Add(new MenuPoint(bd, "delete course from lector", new DeleteCourseFromLector()));
		lectorServ.Add(new MenuPoint(bd, "back"));
		Menu lectionServ = new Menu("Lection Menu");
		lectionServ.Add(new MenuPoint(bd, "create lection", new CreateLection()));
		lectionServ.Add(new MenuPoint(bd, "delete lection", new DeleteLection()));
		lectionServ.Add(new MenuPoint(bd, "add course to lection", new AddCourseToLection()));
		lectionServ.Add(new MenuPoint(bd, "delete course from lection", new DeleteCourseFromLection()));
		lectionServ.Add(new MenuPoint(bd, "set date for lection", new SetDateForLection()));
		lectionServ.Add(new MenuPoint(bd, "back"));
		Menu studentServ = new Menu("Student menu");
		studentServ.Add(new MenuPoint(bd, "create student", new CreateStudent()));
		studentServ.Add(new MenuPoint(bd, "delete student", new DeleteStudent()));
		studentServ.Add(new MenuPoint(bd, "add course to student", new AddCourseToStudent()));
		studentServ.Add(new MenuPoint(bd, "delete course from student", new DeleteCourseFromStudent()));
		studentServ.Add(new MenuPoint(bd, "back"));
		bd.Add(new MenuPoint(courseServ, "course service"));
		bd.Add(new MenuPoint(lectorServ, "lector service"));
		bd.Add(new MenuPoint(lectionServ, "lection service"));
		bd.Add(new MenuPoint(studentServ, "student service"));
		bd.Add(new MenuPoint(mainMenu, "main menu"));
		Menu courseInfo = new Menu("Information about courses");
		courseInfo.Add(new MenuPoint(show, "sort by start date", new SortCourseByStartDate()));
		courseInfo.Add(new MenuPoint(show, "sort by students count", new SortCourseByStudentCount()));
		courseInfo.Add(new MenuPoint(show, "sort by lector", new SortCourseByLector()));
		courseInfo.Add(new MenuPoint(show, "sort by alphabet", new SortCourseByName()));
		courseInfo.Add(new MenuPoint(show, "list of course after date", new CourseAfterDate()));
		courseInfo.Add(new MenuPoint(show, "leis of course already go", new CourseBeforeDate()));
		Menu lectorInfo = new Menu("Information about lectors");
		lectorInfo.Add(new MenuPoint(show, "sort by alphabet", new SortLectorByName()));
		lectorInfo.Add(new MenuPoint(show, "sort by course count", new SortLectorByCourseCount()));
		Menu lectionInfo = new Menu("Information about lections");
		lectionInfo.Add(new MenuPoint(show, "sort by alphabet", new SortLectionByName()));
		lectionInfo.Add(new MenuPoint(show, "sort by date", new SortLectionByDate()));
		lectionInfo.Add(new MenuPoint(show, "list of lection on date", new LectionsOnDate()));
		show.Add(new MenuPoint(courseInfo, "show information about courses"));
		show.Add(new MenuPoint(lectorInfo, "show information about lectors"));
		show.Add(new MenuPoint(lectionInfo, "show information abount lections"));
		show.Add(new MenuPoint(mainMenu, "total count of courses, lectors, lections, students", new TotalCount()));
		show.Add(new MenuPoint(mainMenu, "main menu"));
		return mainMenu;
	}

}
