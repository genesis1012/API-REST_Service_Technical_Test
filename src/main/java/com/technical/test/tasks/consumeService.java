package com.technical.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.technical.test.utils.webServices.CONSULT;
import static com.technical.test.utils.constanst.*;

public class consumeService implements Task {

    private String consultUsers;
    private int Lng;
    private int Lat;

    public consumeService(Integer Lng, Integer Lat) {
        this.Lng = Lng;
        this.Lat = Lat;
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
                                .queryParam("lat", Lat)
                                .queryParam("lng", Lng)
                        )
        );
    }

    public static consumeService with(Integer Lng, Integer Lat) {
        return instrumented(consumeService.class, Lng, Lat);
    }
}
