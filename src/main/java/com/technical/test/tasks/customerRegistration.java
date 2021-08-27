package com.technical.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.technical.test.utils.webServices.CONSULT;
import static com.technical.test.utils.constanst.*;

public class customerRegistration implements Task {

    private String consultUsers;

    public customerRegistration() {
        this.consultUsers = CONSULT.toString();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource(consultUsers)
                        .with(request -> request.header("Content-Type", "application/json")
                                .queryParam("formatted", FORMATTED)
                                .queryParam("username", USER_NAME)
                                .queryParam("style", STYLE)
                                .queryParam("lat", "10")
                                .queryParam("lng", "20")
                        )
        );
    }

    public static customerRegistration with() {
        return instrumented(customerRegistration.class);
    }
}
