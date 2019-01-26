package com.sapient.page.objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "nav-link-shopall")
	public WebElement shopByDepartment;

	public void hoverShopByDepartment() {
		Actions action = new Actions(driver);
		action.moveToElement(shopByDepartment).perform();

	}

	@FindBy(how = How.LINK_TEXT, using = "Full Shop Directory")
	public WebElement fullShopDirectory;

	public void fullShopDirectory() {
		Actions action = new Actions(driver);
		action.moveToElement(shopByDepartment).click(fullShopDirectory).build().perform();

	}

	public void printNumberOfLinkOnPage() {
		List<WebElement> pageLink = driver.findElements(By.xpath("//a[@class=\"nav_a\"]"));
		System.out.println(pageLink.size());
	}

	@FindBy(how = How.LINK_TEXT, using = "Tools & Equipment")
	public WebElement toolsEquipment;

	public void clickOnToolsEquipment() {
		toolsEquipment.click();
	}

	@FindBy(how = How.XPATH, using = "//div[@class=\"a-section octopus-pc-item-hue-shield\"]")
	public WebElement selectTheFirstProduct;

	public void clickOnTheFirstProduct() {
		selectTheFirstProduct.click();
	}

	@FindBy(how = How.ID, using = "priceblock_ourprice")
	public WebElement price;

	public String getPrice() {
		System.out.println(price.getText());
		return price.getText();
	}

	public void addProductToBasket() {
		selectTheFirstProduct.click();
	}

	@FindBy(how = How.ID, using = "submit.add-to-cart")
	public WebElement submitAddToCart;

	@FindBy(how = How.ID, using = "add-to-cart-button")
	public WebElement addToCartButton;

	public void addToCart() {
		addToCartButton.click();
	}

	@FindBy(how = How.XPATH, using = "//a[@id=\"nav-cart\"]")
	public WebElement viewCart;

	public void clickViewBasket() {
		viewCart.click();
	}

	@FindBy(how = How.XPATH, using = "//span[@class=\"a-size-medium a-color-price sc-price sc-white-space-nowrap  sc-price-sign\"]")
	public WebElement viewCartTotal;

	public String cartTotal() {
		System.out.println(viewCartTotal.getText());
		return viewCartTotal.getText();
	}

}
