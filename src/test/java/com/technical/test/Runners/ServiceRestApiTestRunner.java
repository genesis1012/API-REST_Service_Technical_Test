package com.technical.test.Runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

import static cucumber.api.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions( features="src/test/resources/feature/serviceRESTAPI.feature",
        glue = { "com.technical.test.Step_Definitions"},
        snippets = CAMELCASE)
public class ServiceRestApiTestRunner {
}
