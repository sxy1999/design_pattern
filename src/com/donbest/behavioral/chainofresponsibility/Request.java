package com.donbest.behavioral.chainofresponsibility;

public class Request {
	private RequestType requestType;
	private int amount;

	public Request(RequestType requestType, int amount) {
		this.requestType = requestType;
		this.amount = amount;
	}

	public RequestType getRequestType() {
		return requestType;
	}

	public void setRequestType(RequestType requestType) {
		this.requestType = requestType;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
