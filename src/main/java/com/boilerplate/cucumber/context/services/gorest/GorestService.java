package com.boilerplate.cucumber.context.services.gorest;

import com.boilerplate.cucumber.context.services.RestService;
import io.cucumber.guice.ScenarioScoped;
import io.jtest.utils.clients.http.Method;

@ScenarioScoped
public class GorestService extends RestService {

    public static final String GOREST_USERS_PATH = "public/v2/users";

    public RestService buildGetGorestUsers() {
        this.client = getDefaultBuilder().path(GOREST_USERS_PATH).method(Method.GET).build();
    return this;
    }

    @Override
    protected String address() {
//        return scenarioVars.getAsString("mock.url");
        return "https://gorest.co.in/";
    }


}
