package classes;
import util.Role;

public class Patient extends Man{
	
	public Patient (String fio){
	super(fio);
	super.setRole(Role.PATIENT);
}
}

