package classes;
import java.util.ArrayList;
import util.Role;

public class Doctor extends Human{
	private ArrayList<Patient> patients;
	public Doctor (String fio){
		super(fio);
		super.setRole(Role.DOCTOR);
	}
	public ArrayList<Patient> getPatients() {
		return patients;
	}
	public void setPatients(ArrayList<Patient> patients) {
		this.patients = patients;
	}
}
