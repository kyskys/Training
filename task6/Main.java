package task6;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Worker> list = new ArrayList<Worker>();
		list.add(new Director("livak",228));
		list.add(new FinanceManager("slaik",1488));
		list.add(new CommercialManager("ches",322));
		int total = 0;
		for(int i=0;i<list.size();++i){
			total+=list.get(i).getCash();
		}
		System.out.println(total);
	}

}
