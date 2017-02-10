package model;

public abstract class Human extends BaseModel {

	public abstract Role getRole();

	public enum Role {
		LECTOR, LISTENER;
	}

}
