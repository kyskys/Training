package model;

public abstract class Human {
private String fio;
private Role role;
public Human (String fio){
	this.setFio(fio);
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
public enum Role {
LECTOR, LISTENER;
}
}
