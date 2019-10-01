package com.design.singleton;


public class BillPughSingletonDemo {

	public static void main(String[] args) {
		
		//Object obj = BillPughInner.INSTANCE;
		
		
		Thread t1 = new Thread(new Runnable() {

			public void run() {

				BillPughSingleton obj1 = BillPughSingleton.getInstance();
			}
		});

		Thread t2 = new Thread(new Runnable() {

			public void run() {

				BillPughSingleton obj1 = BillPughSingleton.getInstance();
			}
		});

		t1.start();
		t2.start();
		
	}
}
