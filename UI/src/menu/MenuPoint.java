package menu;

public class MenuPoint implements Action {
	private Action act;

	public MenuPoint() {
	}

	public MenuPoint(Action act) {
		this.act = act;
	}

	public Menu doWork(){
		if(act!=null) {
			//esli est deistvie - dergaem
		}
		return null;
		//ne znau kak vernut drygoe menu, bk ssilky gde to prinimat?
	}

	@Override
	public void doAction() {
		//act=chety libo, zapolnyaem pole, sozdaem deistvie
	}
}
