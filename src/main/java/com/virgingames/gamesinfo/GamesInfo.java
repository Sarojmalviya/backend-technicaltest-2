package com.virgingames.gamesinfo;

import com.virgingames.constants.EndPoints;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

public class GamesInfo {

    @Step("Getting all info of jackpot bingo when currency is {0}")
    public ValidatableResponse getAllData(String currencySymbol) {
        return SerenityRest.given().log().all()
                .queryParam("currency", currencySymbol)
                .when()
                .get(EndPoints.GET_ALL_JACKPOT_BINGO_POTS)
                .then();
    }
}