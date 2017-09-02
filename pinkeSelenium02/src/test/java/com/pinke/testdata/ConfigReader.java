package com.pinke.testdata;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
	private static Properties prop;
	public static final String BROWSER = "browser";
	public static final String WAITTIME = "waitTime";
	
	static {
		prop = new Properties();
		InputStream is = ConfigReader.class.getClassLoader().getResourceAsStream("config.properties");
		try {
			prop.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static String getConfig(String name) {
		return prop.getProperty(name);
	}
}
