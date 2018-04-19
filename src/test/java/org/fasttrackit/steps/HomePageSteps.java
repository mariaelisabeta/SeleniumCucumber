package org.fasttrackit.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import org.fasttrackit.AppConfig;
import org.fasttrackit.TestBase;

public class HomePageSteps extends TestBase{




    //s-a generat o metoda automat ; throws, comment, si o sectiune: throw new care va arunca o pending exception care sa ne anunte ca avem o metoda care nu genereaza nimic
    @Given("^I open the homepage$")
    public void iOpenTheHomepage()  {
        driver.get(AppConfig.getSiteUrl());

    }
}
