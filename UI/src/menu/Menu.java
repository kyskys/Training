package menu;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	private List<MenuPoint> list = new ArrayList<MenuPoint>();
	private String title;

	public Menu(String title) {
		this.title = title;
	}

	public List<MenuPoint> getList() {
		return list;
	}

	public void setList(List<MenuPoint> list) {
		this.list = list;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void Add(MenuPoint mp) {
		list.add(mp);
	}

	public void showMenu() {
		System.out.println(getTitle());
		for (int i = 0; i < getList().size(); i++) {
			MenuPoint m = getList().get(i);
			System.out.println(i + 1 + "." + m.getTitle());
		}
		System.out.println("chto jelaete, gospodin?");
	}
}
