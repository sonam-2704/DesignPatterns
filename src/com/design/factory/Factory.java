package com.design.factory;

// Factory Client Code

public class Factory {

	public static void main(String[] args) {

		/*Currency obj = new USDollar();
		System.out.println(obj.getSymbol());*/
		
		Currency obj = CurrencyFactory.createCurrency("India");
		//obj.getSymbol();
		
		System.out.println(obj.getSymbol());
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*String country = "India";
		Currency rupee = CurrencyFactory.createCurrency(country);
        System.out.println(rupee.getSymbol());*/
	

}
