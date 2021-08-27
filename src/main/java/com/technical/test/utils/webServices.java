package com.technical.test.utils;

public enum webServices {

    BASE_URL("http://api.geonames.org"),
    CONSULT("/timezoneJSON");

    private String uri;

    webServices(String uri) {
        this.uri = uri;
    }

    @Override
    public String toString() {
        return uri;
    }
}
