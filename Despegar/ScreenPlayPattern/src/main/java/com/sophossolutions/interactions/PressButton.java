package com.sophossolutions.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class PressButton implements Interaction{
	private int intAmount;
	private Target btnPress;
	
	
	
	public PressButton(int intAmount, Target btnPress) {
		super();
		this.intAmount = intAmount;
		this.btnPress = btnPress;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		while(this.intAmount > 1) {
			actor.attemptsTo(Click.on(this.btnPress));
			this.intAmount--;
		}
	}
	public static PressButton press(int amount, Target target) {
		return Tasks.instrumented(PressButton.class, amount, target);
	}
}
