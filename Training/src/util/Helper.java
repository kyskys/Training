package util;

public class Helper {
	@SuppressWarnings("unchecked")
	public static <T extends Object> T stringParse(String str, Class<?> clazz) throws InstantiationException, IllegalAccessException {
		//T result = (T) clazz.newInstance();
		T result = (T) str;
		return result;
	}

}
