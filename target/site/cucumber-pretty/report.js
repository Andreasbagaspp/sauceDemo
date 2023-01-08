$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Checkout.feature");
formatter.feature({
  "line": 3,
  "name": "Feature check out",
  "description": "",
  "id": "feature-check-out",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Checkout"
    }
  ]
});
formatter.before({
  "duration": 5043992699,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Add to Cart",
  "description": "",
  "id": "feature-check-out;add-to-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User open the website sauce demo",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User input \"standard_user\" as userName and input \"secret_sauce\" as password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User sort product list by name z to a",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User pick item Sauce Labs Onesie",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User pick item Test.allTheThings T-Shirt Red",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User click cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Verify item1",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Verify item2",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User remove test allthethings tshirt",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User click checkout",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User input \"Andreas\" as firstName and \"Bagas\" as lastName and \"12345\" as postalCode",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User click continue button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Verify item Total",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Verify item Tax",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Verify total payment",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "User click button finish",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Verify value text \"THANK YOU FOR YOUR ORDER\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyDisplay()"
});
formatter.result({
  "duration": 237380600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 12
    },
    {
      "val": "secret_sauce",
      "offset": 50
    }
  ],
  "location": "LoginSteps.inputCredential(String,String)"
});
formatter.result({
  "duration": 5291071399,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.selectProductContainer()"
});
formatter.result({
  "duration": 2104428999,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.clickItemBasket1()"
});
formatter.result({
  "duration": 2049760300,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.clickItemBasket2()"
});
formatter.result({
  "duration": 2045335600,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.clickCart()"
});
formatter.result({
  "duration": 2051115801,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.verifyItem1()"
});
formatter.result({
  "duration": 36381201,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.verifyItem2()"
});
formatter.result({
  "duration": 26526901,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.removeItem()"
});
formatter.result({
  "duration": 5053301000,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.checkoutProduct()"
});
formatter.result({
  "duration": 2041692900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Andreas",
      "offset": 12
    },
    {
      "val": "Bagas",
      "offset": 39
    },
    {
      "val": "12345",
      "offset": 63
    }
  ],
  "location": "PurchaseSteps.inputCredential(String,String,String)"
});
formatter.result({
  "duration": 5165273699,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.continueButton()"
});
formatter.result({
  "duration": 2049471900,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.verifyItemTotal()"
});
formatter.result({
  "duration": 39007400,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.verifyItemTax()"
});
formatter.result({
  "duration": 18535800,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.verifyTotalPayment()"
});
formatter.result({
  "duration": 21445500,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.finishPaymentButton()"
});
formatter.result({
  "duration": 2043728499,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "THANK YOU FOR YOUR ORDER",
      "offset": 19
    }
  ],
  "location": "PurchaseSteps.thankYouOrderText(String)"
});
formatter.result({
  "duration": 5034195000,
  "status": "passed"
});
formatter.after({
  "duration": 1876084501,
  "status": "passed"
});
});