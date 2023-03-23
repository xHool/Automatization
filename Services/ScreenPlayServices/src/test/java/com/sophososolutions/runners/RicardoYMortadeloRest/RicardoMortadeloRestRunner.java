package com.sophososolutions.runners.RicardoYMortadeloRest;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		glue = "com.sophososolutions.stepDefinions", 
		features = "src/test/resources/com/sophosolutions/features/ricardo_y_mortadelo.feature", 
		snippets = SnippetType.CAMELCASE
		)
public class RicardoMortadeloRestRunner {

}
