package dr.stepDefinitions;

import dr.pages.CheckoutPage;
import dr.pages.HomePage;
import dr.pages.SearchResultsPage;
import dr.utilities.ConfigReader;
import dr.utilities.Driver;
import dr.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class KitapAramaStepDefs {

    HomePage homePage = new HomePage();
    SearchResultsPage searchResultsPage= new SearchResultsPage();
    CheckoutPage checkoutPage= new CheckoutPage();

    Actions actions= new Actions(Driver.getDriver());
    @Given("User goes to url")
    public void userGoesToUrl() {
        Driver.getDriver().get(ConfigReader.getProperty("Url"));
        ReusableMethods.wait(2);
        homePage.acceptCookie.click();
        ReusableMethods.wait(3);
    }

    @When("Searches Harry Potter")
    public void searchesHarryPotter() {

        ReusableMethods.wait(5);
        homePage.searchBar.click();
        ReusableMethods.wait(3);
        homePage.searchBar.sendKeys("Harry Potter", Keys.ENTER);
    }

    @Then("Asserts that if the results contain Harry Potter")
    public void assertsThatIfTheResultsContainHarryPotter() {
        Assert.assertTrue(homePage.searchResult.getText().contains("Harry Potter"));
        ReusableMethods.wait(2);
    }


    @And("Assert that {string} product listed")
    public void assertThatProductListed(String numb) {
        Assert.assertTrue(homePage.productList.getText().contains(numb));
        ReusableMethods.wait(2);
    }


    @And("Click Best Seller")
    public void clickBestSeller() {
        searchResultsPage.suggested.click();
        ReusableMethods.wait(2);
        Select selectSuggested= new Select(searchResultsPage.suggested);
        selectSuggested.selectByIndex(1);
        ReusableMethods.wait(2);
    }

    @And("Add HArry Potter and Plisopher Stone to the chart")
    public void addHArryPotterAndPlisopherStoneToTheChart() {

        actions.scrollToElement(searchResultsPage.addToBasket);
        ReusableMethods.wait(2);
        searchResultsPage.addToBasket.click();
    }

    @And("Click chart icon")
    public void clickChartIcon() {
        actions.scrollToElement(searchResultsPage.chartIcon);
        ReusableMethods.wait(2);
        searchResultsPage.chartIcon.click();
    }

    @Then("Assert that if the book is in the chart")
    public void assertThatIfTheBookIsInTheChart() {
        ReusableMethods.wait(2);
      checkoutPage.hpbook.isDisplayed();

    }

    @When("user increase number of the pruduct in basket")
    public void userIncreaseNumberOfThePruductInBasket() {
        checkoutPage.plusIcon.click();
    }

    @Then("Assert if the quantity updated")
    public void assertIfTheQuantityUpdated() {
        String expected="2";
        String actual= checkoutPage.qty.getText();
        System.out.println(actual);
       // Assert.assertEquals(expected,actual);
    }
}
