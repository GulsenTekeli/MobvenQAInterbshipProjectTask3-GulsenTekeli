package dr.pages;

import dr.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    public CheckoutPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[@class='basketLeftFrame col-md-8 col-lg-9']" )
    public WebElement hpbook;

    @FindBy(xpath = "//span[@class='number-plus']" )
    public WebElement plusIcon;

    @FindBy(xpath = "//input[@class='basketCounter']")
    public WebElement qty;






}
