package dr.stepDefinitions;

import com.github.javafaker.Faker;
import dr.pages.HomePage;
import dr.pages.MenuPage;
import dr.pages.RegistrationPage;
import dr.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RegistrationStepDefs {
    RegistrationPage registrationPage= new RegistrationPage();
    HomePage homePage= new HomePage();
    Faker faker = new Faker();
    MenuPage menuPage= new MenuPage();


    @When("Clicks menu button")
    public void clicksMenuButton() {
        homePage.menu.click();
        ReusableMethods.wait(3);
        homePage.acceptCookie.click();

    }


    @And("Writes valid Name in namebox")
    public void writesValidNameInNamebox() {
       // ReusableMethods.wait(4);
       // homePage.acceptCookie.click();
        ReusableMethods.wait(3);
        registrationPage.nameBox.click();
        homePage.acceptCookie.click();
        registrationPage.nameBox.sendKeys(faker.name().firstName());

    }
    @And("Writes valid Surname in Surnamebox")
    public void writesValidSurnameInSurnamebox() {
        registrationPage.SurnameBox.sendKeys(faker.name().lastName());


    }

    @And("writes email address in mailbox")
    public void writesEmailAddressInMailbox() {
        registrationPage.emailBox.sendKeys(faker.internet().emailAddress());
    }

    @And("writes password")
    public void writesPassword() {
        registrationPage.passwordBox.click();
        ReusableMethods.wait(2);
        registrationPage.passwordBox.sendKeys(faker.internet().password(8,10,true,false,true));

    }

    @And("Clicks membership agreement Checkbox")
    public void clicksMembershipAgreementCheckbox() {
        registrationPage.membershipCheckbox.click();
    }

    @And("Clicks clarification checkbox")
    public void clicksClarificationCheckbox() {
        registrationPage.clarificationCheckbox.click();
    }

    @And("Clicks Register button")
    public void clicksRegisterButton() {
        registrationPage.registerSubmitButton.click();
    }


    @And("Clicks registeritation button")
    public void clicksRegisteritationButton() {
        ReusableMethods.wait(2);
        menuPage.registerButton.click();
        ReusableMethods.wait(3);
        Assert.assertTrue(registrationPage.verificationText.isDisplayed()); ;

    }
}
