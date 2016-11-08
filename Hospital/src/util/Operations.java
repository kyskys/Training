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
		Doctor oldDoctor = patientToChange.getDoctor();
		oldDoctor.patients.remove(patientToChange);
		patientToChange.setDoctor(newDoctor);
		newDoctor.patients.add(patientToChange);
		return patientToChange;
	}
	public static void showPatientsOfDoctor(Doctor doctor){
		System.out.println("kolichestvo pacientov vracha" + doctor.patients.size());
	}
	public static void showAllPatients(Patient[] mas){
		System.out.println("kolichestvo pacientov" + mas.length);
	}
	public static void showAllDoctors(Doctor[] mas){
		System.out.println("kolichestvo doctorov" + mas.length);
	}
}
