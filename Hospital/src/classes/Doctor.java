package classes;
import java.util.ArrayList;
import util.Role;

public class Doctor extends Man{
	ArrayList<Patient> patients;
	public Doctor (String fio,Role role){
		super(fio);
		super.setRole(Role.DOCTOR);
	}
}
