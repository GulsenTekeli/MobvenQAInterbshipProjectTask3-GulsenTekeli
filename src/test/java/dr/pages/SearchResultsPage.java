package dr.pages;

import dr.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {
    public SearchResultsPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//button[@class='btn add-cart-btn js-add-basket'])[1]" )
    public WebElement addToBasket; ;

    @FindBy(xpath = "(//div[@class='facet__selectbox-container'])[1]" )
    public WebElement filter;

    @FindBy(xpath = "(//select[@class='facet__selectbox js-facet-arrangement']" )
    public WebElement bestSeller;

    @FindBy( xpath = "//a[@href='/sepetim']")
    public WebElement chartIcon;

    @FindBy( xpath = "//select[@class='facet__selectbox js-facet-arrangement']")
    public WebElement suggested;

    @FindBy( xpath = "//h1[@class='facet__products-title js-category-page-title']")
    public WebElement titleCphone;

    @FindBy( xpath = "(//img[@class=' ls-is-cached lazyloaded'])[1]")
    public WebElement pruduct;

    @FindBy( xpath = "//a[@href='/login?callback=product%2Fwishlist%2F1683630']")
    public WebElement heartIcon;










    ;


}
