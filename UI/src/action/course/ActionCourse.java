package action.course;

import action.Action;

public class ActionCourse implements Action{
	
	@Override
	public boolean doAction() {
		System.out.println("1. dobavit\n2. ydalit3. izmenit\nviberite pynkt:");
		switch(util.ConsoleReader.readIntByConsole()) {
		case(1): {
			return true;
		}
		case(2): {
			return true;
		}
		case(3): {
			return true;
		}
		}
		return false;//v slychae srabativaniya vernet false
		
		
	}
	

}
