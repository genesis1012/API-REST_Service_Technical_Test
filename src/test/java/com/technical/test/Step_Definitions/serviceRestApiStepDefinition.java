package com.technical.test.Step_Definitions;

import com.technical.test.questions.LastResponse;

import com.technical.test.tasks.consumeService;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.CoreMatchers.equalTo;

public class serviceRestApiStepDefinition {

    @When("^consume the service with (\\d+) and (\\d+)$")
    public void consumeTheServiceWithAnd(Integer Lat, Integer Lng) {
        theActorInTheSpotlight().attemptsTo(consumeService.with(Lng, Lat));
    }

    @Then("the service must answer the geographic information of the country (.*) (.*) (.*)$")
    public void theServiceMustAnswerTheGeographicInformationOfTheCountry(String code, String time, String country) {
        theActorInTheSpotlight().should(seeThat("last response status code is 200" , LastResponse.is(200)));
        theActorInTheSpotlight().should(seeThatResponse( "country information of the geographic location",
                response -> response
                        .body("countryCode", equalTo(code))
                        .body("timezoneId", equalTo(time))
                        .body("countryName", equalTo(country))
        ));
    }

    @Then("^the service must respond to invalid parameters (.*)$")
    public void theServiceMustRespondToInvalidParametersInvalidLatLng(String Message) {
        theActorInTheSpotlight().should(seeThat("last response status code is 200" , LastResponse.is(200)));
        theActorInTheSpotlight().should(seeThatResponse( "country information of the geographic location",
                response -> response
                        .body("status.message", equalTo(Message))
        ));
    }
}
