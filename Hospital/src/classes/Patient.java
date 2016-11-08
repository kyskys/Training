package classes;
import util.Role;

public class Patient extends Man{
	private Doctor doctor;
	public Patient (String fio){
	super(fio);
	super.setRole(Role.PATIENT);
}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
}

