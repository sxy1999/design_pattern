package com.donbest.behavioral.mediator;

public class TurnOnAllLightsCommand implements Command {

	private Mediator mediator;

	public TurnOnAllLightsCommand(Mediator med) {
		this.mediator = med;
	}

	@Override
	public void execute() {
		mediator.turnOnAllLights();
	}

}
