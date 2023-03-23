package com.sophossolutions.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.sophossolutions.stepdefinitions",
        features = "src/test/resources/com/sophossolutions/features/the_number_game.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class TheNumberGame {

}
