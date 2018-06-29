package com.dev.util.file;

import java.util.Properties;

public class ClassFileLoder {
	
	public static Properties loadClasspathConfigFiles(String fileNameStr) {
		Properties properties = new Properties();
		try {
			properties.load(ClassLoader.getSystemResourceAsStream(fileNameStr));
		} 
		catch (Exception e) {
			System.err.println(" property file loading failed :" + fileNameStr+" e");
		}
		return properties;
	}
	
	

}
