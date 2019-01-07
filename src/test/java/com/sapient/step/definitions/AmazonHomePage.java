package com.sapient.step.definitions;

import org.openqa.selenium.WebDriver;

import com.sapient.WebdriverManager;
import com.sapient.page.objects.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AmazonHomePage extends WebdriverManager {
	
	String url="https://www.amazon.co.uk/";
	
	WebDriver driver=getWebDriver();
	HomePage hp=new HomePage(driver);
	
	
	@Given("^I am on the home page$")
	public void i_am_on_the_home_page() throws Throwable {
		driver.get(url);
	}

	@Given("^I Click on Full Shop Directory$")
	public void i_Click_on_Full_Shop_Directory() throws Throwable {
	  hp.fullhopDirectory();
	}

	@Given("^Read Number of links and print$")
	public void read_Number_of_links_and_print() throws Throwable {
	   hp.printNumberOfLinkOnPage();
	}

	@Then("^Click on Tools and Equipment$")
	public void click_on_Tools_and_Equipment() throws Throwable {
		hp.click_On_Tools_Equipment();
	}

	@Then("^Select First Product, Store the price$")
	public void select_First_Product_Store_the_price() throws Throwable {
	   hp.click_on__the_first_product();
	}

	@Then("^Add to Basket$")
	public void add_to_Basket() throws Throwable {
		hp.addToCart();
		
	}

	@Then("^Go to View my basket and Validate the price$")
	public void go_to_View_my_basket_and_Validate_the_price() throws Throwable {
	  	hp.click_view_basket();
	  	hp.verify_that_the_price_is_displayed();
	  	
	}
	

}
