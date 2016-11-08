package util;

import classes.Doctor;
import classes.Human;

public class Operations {

	public static Human addHuman(String fio){
		Doctor newDoctor = new Doctor(fio);
		return newDoctor;
	}
}
