package util;

import java.util.ArrayList;

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
		oldDoctor.setPatients();//che to bydet s ydaleniem pacienta
		patientToChange.setDoctor(newDoctor);
		newDoctor.setPatients();//toje che to nado s pacientom sdelat
		return patientToChange;
	}
	public static void showPatientsOfDoctor(Doctor doctor){
		ArrayList<Patient> list = doctor.getPatients();
		System.out.println("kolichestvo pacientov" + list.size());
	}
}
