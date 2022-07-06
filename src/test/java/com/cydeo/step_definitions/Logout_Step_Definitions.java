package com.cydeo.step_definitions;

import com.cydeo.pages.LogoutPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logout_Step_Definitions {

    LogoutPage logoutPage = new LogoutPage();

    @When("user clicks in the upper right corner E button")
    public void userClicksInTheUpperRightCornerEButton() {

        Driver.getDriver().get("https://qa.seamlessly.net/index.php/login?clear=1");

        logoutPage.userName.sendKeys("Employee41");
        logoutPage.password.sendKeys("Employee123");

        logoutPage.loginButton.click();

        logoutPage.Ebutton.click();

    }

    @And("user clicks Log out link opened menu")
    public void userClicksLogOutLinkOpenedMenu() {
        logoutPage.logoutButton.click();
    }

    @Then("user can log out and seee homepage \\(seamlesly)")
    public void userCanLogOutAndSeeeHomepageSeamlesly() {
    }

    @When("user hovers over the step back button")
    public void userHoversOverTheStepBackButton() {
    }

    @And("user clicks on the step back button")
    public void userClicksOnTheStepBackButton() {
    }

    @Then("user can not go to home page again")
    public void userCanNotGoToHomePageAgain() {
    }
}
