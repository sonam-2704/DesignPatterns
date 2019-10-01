package com.design.singleton;

public class SingletonDemo {

	public static void main(String[] args) {
		
		MySingleton obj = MySingleton.getInstance();
		
		System.out.println(obj.hashCode());
		
		MySingleton obj1 = MySingleton.getInstance();
		System.out.println(obj1.hashCode());
		
		
		
	}

}
