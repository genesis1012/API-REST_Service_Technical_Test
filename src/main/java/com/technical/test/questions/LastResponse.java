package com.technical.test.questions;

import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

public class LastResponse {

    public static Question<Boolean> is(int code) {
        lastResponse().prettyPrint();
        return a -> lastResponse().statusCode() == code;
    }
}