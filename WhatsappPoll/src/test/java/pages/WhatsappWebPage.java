package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WhatsappWebPage {

    public WhatsappWebPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Link with phone number']")
    public WebElement linkWithPhone;

    @FindBy(xpath = "//*[@type='text']")
    public WebElement numberBox;


}
