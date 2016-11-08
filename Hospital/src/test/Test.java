package test;

import classes.Doctor;
import classes.Patient;

public class Test {

	public static void main(String[] args) {
		Doctor[] doctorMas = new Doctor[1];
		Patient[] patientMas = new Patient[1];
		doctorMas[0] = new Doctor("slaik");
		doctorMas[0] = new Doctor("ches");
		patientMas[0] = new Patient("podopinaya mish 1");
		patientMas[1] = new Patient("podopintaya mish 2");
	}

}
