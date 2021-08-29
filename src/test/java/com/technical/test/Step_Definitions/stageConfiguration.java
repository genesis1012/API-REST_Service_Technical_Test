package com.technical.test.Step_Definitions;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static com.technical.test.utils.webServices.BASE_URL;

public class stageConfiguration {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("user").whoCan(CallAnApi.at(BASE_URL.toString()));
    }
}
