package com.virgingames.cucumber.steps;

import com.virgingames.gamesinfo.GamesInfo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Steps;

import static org.hamcrest.Matchers.equalTo;

public class MyStepdefs {

    static ValidatableResponse response;

    @Steps
    GamesInfo gamesInfo;

    @When("User sends a GET request to games endpoint using currency {string}")
    public void userSendsAGETRequestToGamesEndpointUsingCurrency(String Currency) {
        response = gamesInfo.getAllData(Currency);
    }

    @Then("User must get  a valid status code {int}")
    public void userMustGetAValidStatusCode(int statusCode) {
        response.statusCode(statusCode);
    }

    @And("User must get the response  {string}")
    public void userMustGetTheResponse(String currencySymb) {
        response.body("data.pots[0].currency",equalTo(currencySymb));
    }
}
