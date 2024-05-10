package dr.stepDefinitions;

import dr.pages.HomePage;
import dr.pages.SearchResultsPage;
import dr.pages.ShowCasePage;
import dr.utilities.Driver;
import dr.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ShowCaseProductComments {
    HomePage homePage = new HomePage();
    SearchResultsPage searchResultsPage= new SearchResultsPage();
    ShowCasePage showCasePage= new ShowCasePage();
    Actions actions = new Actions(Driver.getDriver());
    @When("Scroll Down to Showcase Products")
    public void scrollDownToShowcaseProducts() {
        ReusableMethods.wait(3);
        ReusableMethods.scroll(homePage.headerButtons);
        ReusableMethods.wait(3);
    }

    @And("Clicks Show All button")
    public void clicksShowAllButton() {
        ReusableMethods.click(homePage.showAll);
        ReusableMethods.wait(3);
    }

    @Then("Assert that {string} pruducts listed")
    public void assertThatPruductsListed(String num) {
        Assert.assertTrue(showCasePage.productList.getText().contains(num));
        ReusableMethods.wait(2);
    }

    @And("Clicks out of stock")
    public void clicksOutOfStock() {
        showCasePage.notForSale.click();
        ReusableMethods.wait(3);
    }

    @Then("Asserts that {string} pruducts listed")
    public void assertsThatPruductsListed(String num2) {
        Assert.assertTrue(showCasePage.productList.getText().contains(num2));
        ReusableMethods.wait(2);
    }

    @When("Clicks Most Commented products")
    public void clicksMostCommentedProducts() {
        searchResultsPage.suggested.click();
        ReusableMethods.wait(2);
        Select selectSuggested= new Select(searchResultsPage.suggested);
        selectSuggested.selectByIndex(5);
        ReusableMethods.wait(3);
    }

    @And("Clicks Dogan Cuceloglu's Book Var Misin")
    public void clicksDoganCucelogluSBookVarMisin() {
        ReusableMethods.click(showCasePage.bookDc);
        ReusableMethods.wait(4);
    }

    @And("Clicks stars icon")
    public void clicksStarsIcon() {
        ReusableMethods.scroll(showCasePage.oneCikan);
        ReusableMethods.wait(2);
        ReusableMethods.click(showCasePage.rateStars);
        ReusableMethods.wait(2);

    }
    @Then("Asserts there are {string} comments")
    public void assertsThereAreComments(String numb) {
        Assert.assertTrue(showCasePage.numOfComments.getText().contains(numb));
        ReusableMethods.wait(2);
    }



    @And("Asserts if Cok guzel kitap rahat akici kesinlikle okuyun")
    public void assertsIfCokGuzelKitapRahatAkiciKesinlikleOkuyun() {
        //Assert.assertTrue(showCasePage.firstComment.getText().contains("Çok güzel bir kitap"));
    }


}
