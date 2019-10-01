package com.design.observer;

public class ObserverPatternDemo {

	public static void main(String[] args) {

		Subject objSubject = new Subject();

		Observer1 observer1 = new Observer1(objSubject);

		Observer2 observer2 = new Observer2(objSubject);
		
		objSubject.setState(10);

	}

}
