package model;
import java.util.Date;

public class Lection extends Abstract{
private Date date;
public Lection (String name, Date date){
	super.setName(name);
	setDate(date);
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
}
