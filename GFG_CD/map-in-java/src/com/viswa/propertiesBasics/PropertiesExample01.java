package com.viswa.propertiesBasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample01 {

	public static void main(String[] args) throws IOException {

		Properties p= new Properties();
		FileInputStream fis= new FileInputStream("abc.properties");
		p.load(fis);
		System.out.println(p);
	}

}
