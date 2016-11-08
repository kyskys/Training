package classes;
import java.util.ArrayList;
import util.Role;

public class Doctor extends Human{
	ArrayList<Patient> patients;
	public Doctor (String fio){
		super(fio);
		super.setRole(Role.DOCTOR);
	}
}
