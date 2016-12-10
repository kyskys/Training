package util;

import java.io.Console;

import model.Course;
import model.Lector;
import util.Helper;

public class Creator {
	

public void addCourse (String name, String info) {
	Course course = new Course(name,info);
	course.setLector(addLector());
	
}

public Lector addLector () {
	Lector[] lectors = new Lector[5];//еще не придумал как брать ссылку на всех, будет пока так
	try {
		if (lectors[0]==null) {
			lectors[0] = new Lector("name");//создает новый, если список лекторов пуст
		}
		else return (Lector) Helper.selectSmtng(lectors); //че то ошибка, слаик, подскажи
	}
	catch { //не хочет, пишет add finally, подскажи
		System.out.println("oshibka, povtorite");
		addLector();
	}
}
}
