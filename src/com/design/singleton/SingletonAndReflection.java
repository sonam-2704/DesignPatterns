package com.design.singleton;

import java.lang.reflect.Constructor;

public class SingletonAndReflection {

	public static void main(String[] args) {
	    MySingleton singletonInstance = MySingleton.getInstance();
        MySingleton reflectionInstance = null;
        
        try {
            Constructor[] constructors = MySingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
            	
            	// private constructor can be accessed by setting setAccessible method true
                constructor.setAccessible(true);
                
                //new instance of the Singleton using constructor.newInstance()
                //Hence destroying the property of Singleton
                reflectionInstance = (MySingleton) constructor.newInstance(); 
                
                
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

        System.out.println("singletonInstance hashCode: " + singletonInstance.hashCode());
        System.out.println("reflectionInstance hashCode: " + reflectionInstance.hashCode());
    }

}
