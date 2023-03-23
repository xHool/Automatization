package com.sophossolutions.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class TextOf implements Question<String> {

	Target txtUser;

	public TextOf(Target txtUser) {
		this.txtUser = txtUser;
	}

	/*
	 * Trae el actor.
	 */
	@Override
	public String answeredBy(Actor actor) {
		actor.wasAbleTo(WaitUntil.the(txtUser, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds());
		return Text.of(txtUser).answeredBy(actor);
	}

	public static TextOf field(Target txtUser) {
		return new TextOf(txtUser);
	}

}
