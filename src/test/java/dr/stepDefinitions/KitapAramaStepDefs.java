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

public class KitapAramaStepDefs {

    HomePage homePage = new HomePage();
    SearchResultsPage searchResultsPage= new SearchResultsPage();
    CheckoutPage checkoutPage= new CheckoutPage();
    @Given("User goes to url")
    public void userGoesToUrl() {
        Driver.getDriver().get(ConfigReader.getProperty("Url"));
    }

    @When("Searches Harry Potter")
    public void searchesHarryPotter() {
        homePage.acceptCookie.click();
        ReusableMethods.wait(5);
        homePage.searchBar.click();
        ReusableMethods.wait(3);
        homePage.searchBar.sendKeys("Harry Potter", Keys.ENTER);
    }

    @Then("Asserts that if the results contain Harry Potter")
    public void assertsThatIfTheResultsContainHarryPotter() {
        Assert.assertTrue(homePage.searchResult.getText().contains("Harry Potter"));
    }


    @And("Assert that {string} product listed")
    public void assertThatProductListed(String numb) {
        Assert.assertTrue(homePage.productList.getText().contains(numb));
    }


    @And("Click Best Seller")
    public void clickBestSeller() {

        searchResultsPage.bestSeller.click();
    }

    @And("Add HArry Potter and Plisopher Stone to the chart")
    public void addHArryPotterAndPlisopherStoneToTheChart() {
       searchResultsPage.addToChart.click();
    }

    @And("Click chart icon")
    public void clickChartIcon() {

        searchResultsPage.chartIcon.click();
    }

    @Then("Assert that if the book is in the chart")
    public void assertThatIfTheBookIsInTheChart() {
      checkoutPage.hpbook.isDisplayed();

    }
}
