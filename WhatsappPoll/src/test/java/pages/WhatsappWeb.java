package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WhatsappWeb {

    public WhatsappWeb(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
