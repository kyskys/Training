package classes;

import util.Role;

public class Doctor extends Man{
	
	public Doctor (String fio,Role role){
		super(fio);
		super.setRole(Role.DOCTOR);
	}
}
