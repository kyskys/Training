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
			//если есть действие - че то дергаем
		}
		return null;
		//не знаю как вернуть другое меню, мб по ссылке?
	}

	@Override
	public void doAction() {
		//act=чему либо, чтобы заполнить поле, заодно создаем действие
	}
}
