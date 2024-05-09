package dr.pages;

import dr.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
 public HomePage(){

  PageFactory.initElements(Driver.getDriver(),this);
 }


@FindBy(id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll" )
 public WebElement acceptCookie;

 @FindBy(xpath = "//input[@class='search-input col-12 py-10 px-40 px-lg-50']" )
 public WebElement searchBar;

 @FindBy(xpath = "//h1[@class='facet__products-title']" )
 public WebElement searchResult;

 @FindBy(xpath = "//p[@class='js-facet-total-result facet__products-total-count mb-15 mb-lg-0']")
 public WebElement productList;

 @FindBy(xpath = "//div[@class='mobile-menu-opened']")
 public WebElement menu;











}
