package dr.pages;

import dr.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
    public RegistrationPage(){

    PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (id = "firstName")
    public WebElement nameBox;

    @FindBy (id = "lastName")
    public WebElement SurnameBox;

    @FindBy (id = "email")
    public WebElement emailBox;

    @FindBy (id = "passwordNew")
    public WebElement passwordBox;
    @FindBy (id = "password")
    public WebElement password;

    @FindBy (xpath = "(//span[@class='check_v2'])[2]")
    public WebElement membershipCheckbox;

    @FindBy (xpath = "(//span[@class='check_v2'])[3]")
    public WebElement clarificationCheckbox;

    @FindBy (xpath = "//button[@class='button text-center py-10 bg-c1 text-c255 fs-4 my-5']")
    public WebElement registerSubmitButton;

    @FindBy (xpath = "//p[@class='email-verification__popup-text']]")
    public WebElement verificationText;






}
