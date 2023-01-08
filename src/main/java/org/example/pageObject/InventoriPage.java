package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InventoriPage {

    public static WebDriver driver;

    public InventoriPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement basketItem1;

    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement basketItem2;
    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement selectContainer;

    @FindBy(xpath = "//span[.='Products']")
    private WebElement displayLandingPage;

    @FindBy(xpath = "//div[@id='shopping_cart_container']/a[1]")
    private WebElement cartButton;

    @FindBy(xpath = "//div[@class='cart_item']")
    private WebElement displayCartPage;

    @FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    private WebElement removeItem;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkoutButton;

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement fn;

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement ln;

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement pc;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueButton;

    @FindBy(xpath = "//div[.='Test.allTheThings() T-Shirt (Red)']")
    private WebElement displayItem1;

    @FindBy(xpath = "//div[.='Sauce Labs Onesie']")
    private WebElement displayItem2;

    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    private WebElement displayitemTotal;

    @FindBy(xpath = "//div[@class='summary_tax_label']")
    private WebElement displayitemTax;

    @FindBy(xpath = "//div[@class='summary_total_label']")
    private WebElement displayTotalPayment;

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finishButton;

    @FindBy(xpath = "//h2[@class='complete-header']")
    private WebElement thankYou;


    public void clickBasket1() {
        basketItem1.click();
    }

    public void clickBasket2() {
        basketItem2.click();
    }

    public void selectProductContainer(String sortProductList) {
        Select b = new Select(selectContainer);
        b.selectByVisibleText(sortProductList);
    }

    public void clickCart() {
        cartButton.click();
    }

    public boolean displayCartPage() {
        return displayCartPage.isDisplayed();
    }

    public void removeItemCart() {
        removeItem.click();
    }

    public void checkoutProduct() {
        checkoutButton.click();
    }

    public void setfirstName(String firstName) {
        fn.sendKeys(firstName);
    }

    public void setlastName(String lastName) {
        ln.sendKeys(lastName);

    }

    public void setpostalCode(String zipCode) {
        pc.sendKeys(zipCode);
    }

    public void continueButton() {
        continueButton.click();
    }

    public boolean displayItem1() {
        return displayItem1.isDisplayed();
    }

    public boolean displayItem2() {
        return displayItem2.isDisplayed();
    }

    public boolean displayItemTotal () {
        return displayitemTotal.isDisplayed();
    }

    public boolean displayItemTax () {
        return displayitemTax.isDisplayed();
    }

    public boolean displayTotalPayment () {
        return displayTotalPayment.isDisplayed();
    }

    public void finishPaymentButton () {
        finishButton.click();
    }

    public String thankYouOrderText(){
        return thankYou.getText();
    }

}