package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.TestNG_Demo;

public class PropertiesFile {

	static String projectPath = System.getProperty("user,dir");
	static Properties prop = new Properties();
	private static String browser = prop.getProperty("browser");
	public static void main(String[] args) {
		
		getProperties();
		setProperties();
		getProperties();

		
	}
	
	public static void getProperties() {
		try {		
		InputStream input = new FileInputStream("C://Users//santo//eclipse-workspace//SeleniumJavaFramework//src//test//java//config//config.properties");
		prop.load(input);
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		TestNG_Demo.browserName=browser;
		
	}catch(Exception exp) {
		System.out.println(exp.getMessage());
		System.out.println(exp.getCause());
		exp.printStackTrace();
		}
	}
	
	public static void setProperties() {
		try {
			OutputStream output = new FileOutputStream("C://Users//santo//eclipse-workspace//SeleniumJavaFramework//src//test//java//config//config.properties");
			prop.setProperty("browser", "chrome");
			prop.store(output, null);
			
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
}
	
	
		
	



	
