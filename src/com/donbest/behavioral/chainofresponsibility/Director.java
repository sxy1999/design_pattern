package com.donbest.behavioral.chainofresponsibility;

public class Director extends Handler {

	@Override
	public void handleRequest(Request request) {
		if (request.getRequestType() == RequestType.COBFERENCE) {
			System.out.println("Directors can approve conferences.");
		} else {
			successor.handleRequest(request);
		}
	}

}
