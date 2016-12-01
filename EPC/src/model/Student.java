package model;

public class Student extends Human{

	public Student(String fio) {
		super(fio);
		super.setRole(Role.LISTENER);
	}

}
