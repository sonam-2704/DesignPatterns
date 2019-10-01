package com.design.singleton;


/**
 * Lazy instantiation   (This approach is not thread safe)
 *
 */

class Abc2{
	
	private static Abc2 obj;
	
	private Abc2(){
		
		System.out.println("Instance created");
	}
	
	public static Abc2 getInstance(){
		
		if(obj==null){
			
			obj= new Abc2();	// lazy..
			
		}
		
		return obj;
	}
}


public class SingletonDemo2 {

	public static void main(String[] args) {

		/*Abc2 obj2 = Abc2.getInstance();
		System.out.println(obj2);*/
		
		
		Thread t1 = new Thread(new Runnable() {

			public void run() {

				Abc2 obj = Abc2.getInstance();
			}
		});

		Thread t2 = new Thread(new Runnable() {

			public void run() {

				Abc2 obj = Abc2.getInstance();
			}
		});

		t1.start();
		t2.start();
		
		
	}

}
