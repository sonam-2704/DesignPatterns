package com.design.singleton;


/**
 * Thread safe
 *
 */

class Abc3 {

	private static Abc3 obj;

	private Abc3() {

		System.out.println("Instance created");
	}

	// Only one thread can execute this at a time 
	public static synchronized Abc3 getInstance() {

		if (obj == null) {

			obj = new Abc3(); // lazy..

		}

		return obj;
	}
}

public class SingletonDemo3 {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {

			public void run() {

				Abc3 obj1 = Abc3.getInstance();
			}
		});

		Thread t2 = new Thread(new Runnable() {

			public void run() {

				Abc3 obj1 = Abc3.getInstance();
			}
		});

		t1.start();
		t2.start();
	}

}
