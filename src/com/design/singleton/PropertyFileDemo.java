package com.design.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFileDemo {

	public static void main(String[] args) {

		
		TestDataProperties obj = TestDataProperties.getInstance();
		System.out.println(obj.getValue("url"));
	}

}


class TestDataProperties {

    private static TestDataProperties instance = null;
    private Properties properties;


    private TestDataProperties() throws IOException{

    	FileInputStream fin = null;
    	fin = new FileInputStream(new File(System.getProperty("user.dir")+ "/testing.properties"));
        properties = new Properties();
        properties.load(fin);

    }

    public static TestDataProperties getInstance() {
        if(instance == null) {
            try {
                instance = new TestDataProperties();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
        return instance;
    }

    public String getValue(String key) {
        return properties.getProperty(key);
    }

}