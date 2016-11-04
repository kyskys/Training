package task6;

public abstract class Worker {
private String fio;
private int cash;
public Worker(String fio, int cash){
	this.fio=fio;
	this.setCash(cash);
}
public int getCash() {
	return cash;
}
public void setCash(int cash) {
	this.cash = cash;
}
}
