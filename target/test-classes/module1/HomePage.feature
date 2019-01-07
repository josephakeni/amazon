@all
Feature: Add to Amazon check out basket
	Scenario: As a user I want to be able to add to basket
		Given I am on the home page 
		And I Click on Full Shop Directory
		And Read Number of links and print 
		Then Click on Tools and Equipment
		And Select First Product, Store the price
		Then Add to Basket
		And Go to View my basket and Validate the price

