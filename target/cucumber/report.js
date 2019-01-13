$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("module1/HomePage.feature");
formatter.feature({
  "line": 2,
  "name": "Add to Amazon check out basket",
  "description": "",
  "id": "add-to-amazon-check-out-basket",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@all"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "As a user I want to be able to add to basket",
  "description": "",
  "id": "add-to-amazon-check-out-basket;as-a-user-i-want-to-be-able-to-add-to-basket",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I Click on Full Shop Directory",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Read Number of links and print",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on Tools and Equipment",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Select First Product, Store the price",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Add to Basket",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Go to View my basket and Validate the price",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonHomePage.i_am_on_the_home_page()"
});
formatter.result({
  "duration": 19938981794,
  "status": "passed"
});
formatter.match({
  "location": "AmazonHomePage.i_Click_on_Full_Shop_Directory()"
});
formatter.result({
  "duration": 1766649493,
  "status": "passed"
});
formatter.match({
  "location": "AmazonHomePage.read_Number_of_links_and_print()"
});
formatter.result({
  "duration": 221909765,
  "status": "passed"
});
formatter.match({
  "location": "AmazonHomePage.click_on_Tools_and_Equipment()"
});
formatter.result({
  "duration": 3061092786,
  "status": "passed"
});
formatter.match({
  "location": "AmazonHomePage.select_First_Product_Store_the_price()"
});
formatter.result({
  "duration": 6842100167,
  "status": "passed"
});
formatter.match({
  "location": "AmazonHomePage.add_to_Basket()"
});
formatter.result({
  "duration": 1860219523,
  "status": "passed"
});
formatter.match({
  "location": "AmazonHomePage.go_to_View_my_basket_and_Validate_the_price()"
});
formatter.result({
  "duration": 3209060567,
  "status": "passed"
});
});