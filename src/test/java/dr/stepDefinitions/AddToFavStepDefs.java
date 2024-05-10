package dr.stepDefinitions;

import dr.pages.*;
import dr.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class AddToFavStepDefs {
    MenuPage menuPage= new MenuPage();
    HomePage homePage= new HomePage();
    SignInPage signInPage= new SignInPage();
    SearchResultsPage resultsPage= new SearchResultsPage();
    RegistrationPage registrationPage = new RegistrationPage();

    @And("Clicks electronic button")
    public void clicksElectronicButton() {
        ReusableMethods.wait(2);
       ReusableMethods.click(menuPage.electronic);
    }

    @And("Click cellphones")
    public void clickCellphones() {
        ReusableMethods.wait(2);
        ReusableMethods.click(menuPage.cellPhones);
    }

    @And("Asserts that page title contains CellPhones")
    public void assertsThatPageTitleContainsCellPhones() {
      ReusableMethods.wait(2);
        Assert.assertTrue(resultsPage.titleCphone.getText().contains("Telefon Aksesuarları"));
    }

    @And("Filter the newest products")
    public void filterTheNewestProducts() {

        ReusableMethods.wait(2);
        Select selectSuggested= new Select(resultsPage.suggested);
        selectSuggested.selectByIndex(2);
        ReusableMethods.wait(3);

    }

    @And("Click the product")
    public void Clicktheproduct() {
       ReusableMethods.click( resultsPage.pruduct);
        ReusableMethods.wait(3);

    }

    @And("Clicks heart icon")
    public void clicksHeartIcon() {
        ReusableMethods.click(resultsPage.heartIcon);
        ReusableMethods.wait(3);
    }

}
