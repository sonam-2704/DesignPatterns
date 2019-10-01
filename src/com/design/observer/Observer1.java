package com.design.observer;

public class Observer1 extends Observer {

	  public Observer1(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }
	  
	@Override
	public void update() {

		System.out.println("Observer1 notified");
		
		
	}

	
	
}
