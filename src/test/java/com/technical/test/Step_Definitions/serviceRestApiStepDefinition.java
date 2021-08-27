package com.technical.test.Step_Definitions;

import com.technical.test.questions.LastResponse;

import com.technical.test.tasks.customerRegistration;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class serviceRestApiStepDefinition {

    @When("^consume the CustomerRegistrationMobileServices service with personal customer information$")
    public void consumeTheCustomerRegistrationMobileServicesServiceWithPersonalCustomerInformation() {
        theActorInTheSpotlight().attemptsTo(customerRegistration.with());
    }

    @Then("^the client must be registered successfully by returning the personid$")
    public void theClientMustBeRegisteredSuccessfullyByReturningThePersonid() {
        theActorInTheSpotlight().should(seeThat("last response status code is 200" , LastResponse.is(200)));
        //theActorInTheSpotlight().should(seeThat(TheUsersOnTheWeb.correspondToThoseOfTheService()));
    }

}
