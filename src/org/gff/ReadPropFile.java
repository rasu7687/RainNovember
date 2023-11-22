package org.gff;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("C:\\Users\\GP Ramu\\eclipse-workspace\\PrioriTization\\Resource\\Login.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println("browser Name is ::::::"+ browserName);
		
		String applicationUrl = prop.getProperty("appUrl");
		System.out.println("applicationUrl is ::::::"+ applicationUrl);
		

	}

}
