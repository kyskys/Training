package model;

public abstract class Human extends BaseModel{
public Human (String name){
	setName(name);
}
public abstract Role getRole();

public enum Role {
LECTOR, LISTENER;
}

}
