package dr.pages;

import dr.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShowCasePage {
    public ShowCasePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@data-model='ShowNotForSale']" )
    public WebElement notForSale;

    @FindBy(xpath = "//input[@data-model='ShowNotForSale']" )
    public WebElement instock;

    @FindBy(xpath = "//p[@class='js-facet-total-result facet__products-total-count mb-15 mb-lg-0']")
    public WebElement productList;

//    @FindBy(xpath = "(//div[@class='prd-infos'])[1]")
//    public WebElement dcbook;

    @FindBy(xpath = "//div[@class='prd-rate-title-wrapper mt-5 dr-flex-start js-scroll-comment scroll-trigger-comment']")
    public WebElement rateStars;

    @FindBy(xpath = "//div[@class='product-reviews__product-rating-count']")
    public WebElement numOfComments;

    @FindBy(xpath = "//div[@class='product-reviews__product-rating-count']")
    public WebElement firstComment;

    @FindBy(xpath = "(//div[@class='product-img'])[1]")
    public WebElement bookDc;

    @FindBy(xpath = "//span[@class='d-block w-100 mb-10 font-weight-600']")
    public WebElement oneCikan;








}
