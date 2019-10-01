package com.design.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	List<Observer> observers = new ArrayList<Observer>();
	int state;

	public void setState(int state) {

		this.state = state;
		notifyAllObservers();
	}

	public void notifyAllObservers() {

		for (Observer observer : observers) {

			observer.update();
		}

	}
	

	public void attach(Observer observer) {

		observers.add(observer);
	}

}
