package resourses;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import dao.BaseDAO;
import model.BaseModel;

public class ConfigReader {

	private static Properties getConfig() {
		Properties p = new Properties();
		try {
			FileInputStream fis = new FileInputStream(
					"src/resourses/config.properties");
			p.load(fis);
		} catch (IOException e) {
			System.out.println("missing config file");
			e.printStackTrace();
		}
		return p;
	}

	@SuppressWarnings("unchecked")
	public static <T extends BaseModel> BaseDAO<T> getDAO (String className) throws InstantiationException, IllegalAccessException {
		Properties p = getConfig();
		String bd = p.getProperty(className);
		try {
			Class<?> c = Class.forName(bd);
			return (BaseDAO<T>) c.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
