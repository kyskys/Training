package util;

import classes.Doctor;
import classes.Patient;

public class Operations {

	public static Doctor addDoctor(String fio){
		Doctor newDoctor = new Doctor(fio);
		return newDoctor;
	}
	public static Patient addPatient(String fio){
		Patient newPatient = new Patient(fio);
		return newPatient;
	}
	public static Patient changeDoctorOfPatient(Patient patientToChange, Doctor newDoctor){
		patientToChange.setDoctor(newDoctor);
		return patientToChange;
	}
}
