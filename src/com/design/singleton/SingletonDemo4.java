package com.design.singleton;


/**
 * Double Checked Locking
 *
 */

class Abc4 {

	private static Abc4 obj;

	private Abc4() {

		System.out.println("Instance created");
	}

	public static Abc4 getInstance() {

		//double checked locking
		if (obj == null) {
			
			//synchronized block to remove overhead 
			synchronized (Abc4.class) {

				if (obj == null) {
					
					 // if instance is null, initialize 
					obj = new Abc4();
				}
			}

		}

		return obj;
	}
}

public class SingletonDemo4 {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {

			public void run() {

				Abc4 obj1 = Abc4.getInstance();
			}
		});

		Thread t2 = new Thread(new Runnable() {

			public void run() {

				Abc4 obj1 = Abc4.getInstance();
			}
		});

		t1.start();
		t2.start();
	}

}
