package util;

import classes.Doctor;
import classes.Human;

public class Operations {

	public static Human addHuman(String fio){
		Human newHuman = new Human(fio);
		return newHuman;
	}
}
