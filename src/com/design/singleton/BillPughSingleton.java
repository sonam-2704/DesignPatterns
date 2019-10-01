package com.design.singleton;

public class BillPughSingleton {

	private BillPughSingleton(){
		
		System.out.println("Instance created");
	}
	
	public static BillPughSingleton getInstance(){
		
		return BillPughInner.INSTANCE;
		
	}
	
	private static class BillPughInner{
		
		private static BillPughSingleton INSTANCE = new BillPughSingleton();
	}
	
}
