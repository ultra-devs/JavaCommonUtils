package com.dev.util.file;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.io.IOUtils;

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
	
	public static String loadClassFile(String fileNameStr) throws IOException {
		
		String content=null;
		InputStream inputsteam=null;
		try {
			 inputsteam=ClassLoader.getSystemResourceAsStream(fileNameStr);
			
		} 
		catch (Exception e) {
			System.err.println(" property file loading failed :" + fileNameStr+" e");
		}
		return IOUtils.toString(inputsteam);
	}
	
	public static void main (String [] args) throws IOException
	{
		String source= com.dev.util.file.ClassFileLoder.loadClassFile("ACRequest.json");
		//String schema= com.dev.util.file.ClassFileLoder.loadClassFile("ACSchema.json");
		
	}
}
	


