package com.donbest.behavioral.chainofresponsibility;

public class ChainOfResponsibilityDemo {

	public static void main(String[] args) {
		Director bryan = new Director();
		VP crystal = new VP();
		CEO jeff = new CEO();

		bryan.setSuccessor(crystal);
		crystal.setSuccessor(jeff);

		Request request = new Request(RequestType.COBFERENCE, 500);
		bryan.handleRequest(request);
		
		request = new Request(RequestType.PURCHASE, 1000);
		bryan.handleRequest(request);
		
		request = new Request(RequestType.PURCHASE, 2000);
		bryan.handleRequest(request);
	}
}
