package com.boilerplate.cucumber.context.steps.gorest;

import com.boilerplate.cucumber.context.BaseScenario;
import com.boilerplate.cucumber.context.services.gorest.GorestService;
import io.cucumber.java.en.When;

import javax.inject.Inject;

public class GorestSteps extends BaseScenario {

    @Inject
    private GorestService gorestService;

    @When("[Gorest] Get all users and compare response with {}")
    public void getAllUsersFromGorest(String expected) {
        gorestService.buildGetGorestUsers().executeAndMatch(expected);
    }
}
