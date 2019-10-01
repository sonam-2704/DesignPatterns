package com.design.chainofresponsibility;

public class Rupee500Dispenser implements DispenseChain {

private DispenseChain chain;
	
	@Override
	public void setNextChain(DispenseChain nextChain) {	// nextChain is set to Rupee200Dispenser object
		this.chain=nextChain;
	}

	@Override
	public void dispense(Currency cur) {
		if(cur.getAmount() >= 500){
			int num = cur.getAmount()/500;
			System.out.println(num);
			int remainder = cur.getAmount() % 500;
			System.out.println(remainder);
			System.out.println("Dispensing "+num+" 500 Rs note");
			if(remainder !=0) 
				this.chain.dispense(new Currency(remainder));
		}else{
			this.chain.dispense(cur);
		}
	}
	
}
