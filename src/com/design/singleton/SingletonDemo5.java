package com.design.singleton;

import java.lang.Runtime;
/**
 * ENUM
 *
 */

enum Abc5{
	
	INSTANCE;
	
	int i;
	public void show(){
		System.out.println(i);
	}
}
public class SingletonDemo5 {

	public static void main(String[] args) {

		Abc5 obj = Abc5.INSTANCE;
		obj.i=5;
		obj.show();
		
		Abc5 obj1 = Abc5.INSTANCE;
		obj1.i =10;
		obj.show();
		obj1.show();
		
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
		
		
	}

}
