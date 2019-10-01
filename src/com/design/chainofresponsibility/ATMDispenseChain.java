package com.design.chainofresponsibility;

import java.util.Scanner;

public class ATMDispenseChain {

	private DispenseChain c1;

	public ATMDispenseChain() {
		// initialize the chain
		this.c1 = new Rupee500Dispenser();
		DispenseChain c2 = new Rupee200Dispenser();
		DispenseChain c3 = new Rupee100Dispenser();

		// set the chain of responsibility
		c1.setNextChain(c2);
		c2.setNextChain(c3);
	}

	public static void main(String[] args) {
		ATMDispenseChain atmDispenser = new ATMDispenseChain();
		int amount = 0;
		System.out.println("Enter amount to dispense");
		Scanner input = new Scanner(System.in);
		amount = input.nextInt();
		if (amount % 100 != 0) {
			System.out.println("Amount should be in multiple of 100s.");
			return;
		}
		// process the request
		atmDispenser.c1.dispense(new Currency(amount));

	}

}
