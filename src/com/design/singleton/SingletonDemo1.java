package com.design.singleton;

/**
 * Eager instantiation
 *
 */

class Abc{
	
	private static Abc obj = new Abc();     // Eagerly instance creation
	// even though the instance is not required it is there in memory
	
	private Abc(){
		
		
	}
	
	public static Abc getInstance(){
		
		return obj;
	}
	
}


public class SingletonDemo1 {

	public static void main(String[] args) {

		Abc obj1 = Abc.getInstance();
		System.out.println(obj1);
	}

}

