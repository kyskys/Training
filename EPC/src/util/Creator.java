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
	Lector[] lectors = new Lector[5];//��� �� �������� ��� ����� ������ �� ����, ����� ���� ���
	try {
		if (lectors[0]==null) {
			lectors[0] = new Lector("name");//������� �����, ���� ������ �������� ����
		}
		else return (Lector) Helper.selectSmtng(lectors); //�� �� ������, �����, ��������
	}
	catch { //�� �����, ����� add finally, ��������
		System.out.println("oshibka, povtorite");
		addLector();
	}
}
}
