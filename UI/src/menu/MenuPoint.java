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
			//���� ���� �������� - �� �� �������
		}
		return null;
		//�� ���� ��� ������� ������ ����, �� �� ������?
	}

	@Override
	public void doAction() {
		//act=���� ����, ����� ��������� ����, ������ ������� ��������
	}
}
