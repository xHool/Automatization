package com.sophososolutions.runners.GoRest;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.sophososolutions.stepDefinions",
        features = {"src/test/resources/com/sophosolutions/features/GoRest/delete_go_rest.feature"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class DeleteGoRest {
}
