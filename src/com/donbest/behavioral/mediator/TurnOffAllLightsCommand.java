package com.donbest.behavioral.mediator;

public class TurnOffAllLightsCommand implements Command {

	private Mediator mediator;

	public TurnOffAllLightsCommand(Mediator med) {
		this.mediator = med;
	}

	@Override
	public void execute() {
		mediator.turnOffAllLights();
	}

}
