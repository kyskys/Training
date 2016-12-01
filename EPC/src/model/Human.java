package model;

public abstract class Human extends Abstract{
private Role role;
public Human (String name){
	super.setName(name);
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
