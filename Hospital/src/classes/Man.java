package classes;
import util.Role;

public abstract class Man {
private String fio;
private Role role;
public Man (String fio, Role role){
	this.setFio(fio);
	this.setRole(role);
}
public String getFio() {
	return fio;
}
public void setFio(String fio) {
	this.fio = fio;
}
public Role getRole() {
	return role;
}
public void setRole(Role role) {
	this.role = role;
}

}
