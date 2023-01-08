package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.InventoriPage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// menampung setup final method dan konfigurasi testcase cucumber
// super = constructor

public class PurchaseSteps {
    private WebDriver webDriver;

    public PurchaseSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User pick item Sauce Labs Onesie")
    public void clickItemBasket1() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.clickBasket1();
        Thread.sleep(2000);
    }

    @And("User pick item Test.allTheThings T-Shirt Red")
    public void clickItemBasket2() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.clickBasket2();
        Thread.sleep(2000);
    }

    @And("User sort product list by name z to a")
    public void selectProductContainer() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        String a = "Name (Z to A)";
        inventoriPage.selectProductContainer(a);
        Thread.sleep(2000);
    }

    @And("User click cart")
    public void clickCart() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.clickCart();
        Thread.sleep(2000);
    }

    @When("User on cart page")
    public void verifyCartPage() {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.displayCartPage();
        Assert.assertTrue(inventoriPage.displayCartPage());
    }

    @And("User remove test allthethings tshirt")
    public void removeItem() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.removeItemCart();
        Thread.sleep(5000);
    }

    @And("User click checkout")
    public void checkoutProduct() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.checkoutProduct();
        Thread.sleep(2000);
    }

    @Then ("User input \"(.*)\" as firstName and \"(.*)\" as lastName and \"(.*)\" as postalCode")
    public void inputCredential(String firstName, String lastName, String postalCode) throws InterruptedException {
        InventoriPage inventoripage = new InventoriPage(webDriver);
        inventoripage.setfirstName(firstName);
        inventoripage.setlastName(lastName);
        inventoripage.setpostalCode(postalCode);
        Thread.sleep(5000);
    }

    @And("User click continue button")
    public void continueButton() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.continueButton();
        Thread.sleep(2000);
    }

    @Then("Verify item1")
    public void verifyItem1() {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        Assert.assertTrue(inventoriPage.displayItem1());
    }

    @Then("Verify item2")
    public void verifyItem2() {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        Assert.assertTrue(inventoriPage.displayItem2());
    }

    @Then("Verify item Total")
    public void verifyItemTotal() {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        Assert.assertTrue(inventoriPage.displayItemTotal());
    }

    @Then("Verify item Tax")
    public void verifyItemTax() {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        Assert.assertTrue(inventoriPage.displayItemTax());
    }

    @Then("Verify total payment")
    public void verifyTotalPayment() {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        Assert.assertTrue(inventoriPage.displayTotalPayment());
    }

    @And("User click button finish")
    public void finishPaymentButton() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.finishPaymentButton();
        Thread.sleep(2000);
    }

    @Then("Verify value text \"(.*)\"")
    public void thankYouOrderText(String thankYouOrderText) throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        Assert.assertEquals(thankYouOrderText, inventoriPage.thankYouOrderText());
        System.out.println(thankYouOrderText);
        Thread.sleep(5000);
    }
}
