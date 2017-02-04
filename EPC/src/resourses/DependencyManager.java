package resourses;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class DependencyManager {
	static Map<Object, Object> m = new HashMap<Object, Object>();
	static {initMap();}
	private static void initMap(){
		Properties p = new Properties();
		try {
			FileInputStream fis = new FileInputStream(
					"src/resourses/config.properties");
			p.load(fis);
			for (String key : p.stringPropertyNames()) {
				try {
					m.put(Class.forName(key), Class.forName(p.getProperty(key)).newInstance());
				} catch (ClassNotFoundException | InstantiationException
						| IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			System.out.println("missing config file");
			e.printStackTrace();
		}
		}
	
	@SuppressWarnings("unchecked")
	public static <T> T getInstance(Class<T> c) {
		return (T) m.get(c);
	}
}
