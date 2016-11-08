package test;

import util.Operations;
import classes.Doctor;
import classes.Patient;

public class Test {

	public static void main(String[] args) {
		Doctor[] doctorMas = new Doctor[1];
		Patient[] patientMas = new Patient[1];
		doctorMas[0] = Operations.addDoctor("slaik");
		doctorMas[1] = Operations.addDoctor("ches");
		patientMas[0] = Operations.addPatient("podopinaya mish 1");
		patientMas[0] = Operations.addPatient("podopinaya mish 2");
	}

}
