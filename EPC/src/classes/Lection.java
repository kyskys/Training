package classes;

import java.time.LocalDate;

public class Lection {

private LocalDate date;
private Lector lector;
public Lection (){
	
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
public Lector getLector() {
	return lector;
}
public void setLector(Lector lector) {
	this.lector = lector;
}

}
