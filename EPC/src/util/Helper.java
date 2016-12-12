package util;

import model.Abstract;
import model.Lector;

public class Helper {

	public static Abstract selectSmtng (Abstract[] abs) {
	System.out.println("выберите из списка:");
	return abs[0];//типа возвращает выбранный вариант, но я буду создавать только один,
				  //и если не вернет - вылетит ошибка, т.к. свежий список содержит наллы
}

	public void deleteSmtng(Abstract abs) {
		
	}
}
