package sort;

import java.util.Comparator;

import model.BaseModel;

public class SortByName implements Comparator<BaseModel> {

	@Override
	public int compare(BaseModel o1, BaseModel o2) {
		String str1 = o1.getName();
		String str2 = o2.getName();
		return str1.compareTo(str2);
	}

}