package com.sophossolutions.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ComponentOf implements Question<Boolean>{
	
	private Target btnTargetl;
	
	
	public ComponentOf(Target btnTargetl) {
		super();
		this.btnTargetl = btnTargetl;
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		actor.wasAbleTo(WaitUntil.the(btnTargetl, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds());
		return Visibility.of(btnTargetl).answeredBy(actor);
	}
	
	public static ComponentOf field(Target btnComponent) {
		return new ComponentOf(btnComponent);
	}

}
