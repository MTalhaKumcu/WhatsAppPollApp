package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.WhatsappWebPage;
import utilities.ConfigReader;
import utilities.Driver;

public class WhatappSteps {
    WhatsappWebPage whatsappWebPage = new WhatsappWebPage();

    @Given("go to page")
    public void goToPage() {

        Driver.getDriver().get(ConfigReader.getProperty("whatappWebUrl"));
    }

    @When("click search button in whatsapp")
    public void clickSearchButtonInWhatsapp() {

    }


    @Then("write text in searchBox")
    public void writeTextInSearchBox() {
    }

    @Then("choose the group")
    public void chooseTheGroup() {
    }

    @Then("click additional button")
    public void clickAdditionalButton() {
    }

    @Then("choose the poll")
    public void chooseThePoll() {
    }

    @Then("write datas in poll")
    public void writeDatasInPoll() {
    }

    @Then("click send button")
    public void clickSendButton() {
    }

    @And("close page")
    public void closePage() {
    }

    @When("Accept google accept cookies")
    public void acceptGoogleAcceptCookies() {
        whatsappWebPage.cookiesAccept.click();
    }

    @When("Some buttons in WsWeb")
    public void someButtonsInWsWeb() {
        whatsappWebPage.WhatappLinkClick.click();
        whatsappWebPage.linkWithPhone.click();

        //2 tab kullanilacak + tam numara verilecek
        // 1 tab daha sonra next

    }
}
