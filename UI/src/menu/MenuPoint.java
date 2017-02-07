package menu;

import action.Action;

public class MenuPoint {
	private Action act;

	public MenuPoint() {
	}

	public MenuPoint(Action act) {
		this.act = act;
	}

	public Menu doWork() {
		if (!act.doAction()) {
			// esli est deistvie - dergaem
		}
		return null;
		// ne znau kak vernut drygoe menu, bk ssilky gde to prinimat?
	}

}
