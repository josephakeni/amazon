package com.sapient.page.objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class HomePage {
	
WebDriver driver;

public HomePage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
	
	@FindBy(how=How.ID, using="nav-link-shopall")
			public WebElement shopByDepartment;
	
	public void Hover_Shop_By_Department() {
		Actions action=new Actions(driver);
		action.moveToElement(shopByDepartment).perform();
	
}
	@FindBy(how=How.LINK_TEXT, using="Full Shop Directory")
	public WebElement fullShopDirectory;
	
	public void fullhopDirectory() {
		Actions action=new Actions(driver);
		action.moveToElement(shopByDepartment).click(fullShopDirectory).build().perform();
		
	}
	
	public void printNumberOfLinkOnPage() {
		 List<WebElement> pageLink=driver.findElements(By.tagName("a"));
		    System.out.println(pageLink.size());
	}
	
	@FindBy(how=How.LINK_TEXT, using="Tools & Equipment")
	public WebElement tools_Equipment;
	
	public void click_On_Tools_Equipment(){
		tools_Equipment.click();
	}
	
	@FindBy(how=How.XPATH, using="/html/body/div[2]/div[4]/div/div[1]/div/div[1]/div[4]/div[2]/div[2]/ul/li[1]/span/div/a/div[1]/div[1]")
	public WebElement select_the_first_product;
	
	public void click_on__the_first_product(){
		select_the_first_product.click();
	}
	
	@FindBy(how=How.XPATH, using="/html/body/div[2]/div[4]/div/div[1]/div/div[1]/div[4]/div[2]/div[2]/ul/li[1]/span/div/a/div[1]/div[1]")
	public WebElement select_product_to_basket;
	
	public void add_product_to_basket(){
		select_product_to_basket.click();
	}
	
	@FindBy(how=How.ID, using="submit.add-to-cart")
	public WebElement submit_add_to_cart;
	
	@FindBy(how=How.ID, using="add-to-cart-button")
	public WebElement add_to_cart_button;	
	
	public void addToCart() {
		add_to_cart_button.click();
	}
	
	@FindBy(how=How.XPATH, using="/html/body/div[1]/div/header/div/div[2]/div[2]/div/a[4]/span[1]")
	public WebElement view_cart;	
	
	public void click_view_basket() {
		view_cart.click();
	}
	
	public void verify_that_the_price_is_displayed() {
		String price=driver.findElement(By.tagName("body")).getText();
		Assert.assertTrue("Text Not Visible", price.contains("£13.60"));
}
	
	
	

}
