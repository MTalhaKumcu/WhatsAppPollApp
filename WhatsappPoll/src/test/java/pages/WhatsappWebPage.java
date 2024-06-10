package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WhatsappWebPage {

    public WhatsappWebPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[text()='Zaakceptuj wszystko']")
    public WebElement cookiesAccept;
    @FindBy(xpath = "//h3[text()='WhatsApp Web']")
    public WebElement WhatappLinkClick;
    @FindBy(xpath = "//span[@role='button']")
    public WebElement linkWithPhone;


}
