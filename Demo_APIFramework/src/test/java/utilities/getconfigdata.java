package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class getconfigdata {

	
	public static String getPropertyValue(String key) throws IOException
	{
		Properties prop =new Properties();
		FileInputStream fis =new FileInputStream(System.getProperty("user.dir")+"/src/main/java/resources/config.properties");
		prop.load(fis);
		return prop.getProperty(key);		
	}
}
