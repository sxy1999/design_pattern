package com.donbest.behavioral.template;

public class TemplateDemo {

	public static void main(String[] args) {
		System.out.println("Web order:");
		
		OrderTemplate webOrder=new WebOrder();
		webOrder.processOrder();
		
		System.out.println("Store order:");
		
		OrderTemplate storeOrder=new StoreOrder();
		storeOrder.processOrder();
	}

}
