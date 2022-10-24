Feature: Hotel booking in Adactin Application

Scenario Outline: Login Functionality

Given user launch the Application

When user Enter The "<Username>" In Username Field

And user Enter The "<Password>" In Password Field

Then user Click The Login Button Which Navigate to "Adactin.com - Search Hotel"

Examples: 

|Username|Password|
|ABC|123|
|Xyz|1270|
|sirarahman20| Baby@0815|
	

Scenario: Search Hotel Functionality

When user Select the Location

And user Select Hotel 

And user Select Room Type

And user Select Number Of Rooms

And user Select Check In Date

And user Select Check Out Date

And user Select Adult Per Room

And user Select Children Per Room

Then user Click Search Button Which Navigate To Select Hotel Page

Scenario: Select Hotel Functionality

When user Select The Hotel

Then user Click Continue Button which Navigate To Book Hotel Page

Scenario: Book Hotel Functionality 

When user Enter The Firstname In Firstname Field

And user Enter The Lastname In Lastname Field

And user Enter Billing Address In Address Field

And user Enter Credit Card Number In Credid Card Field

And user Select The Credit Card Type From Dropdown

And user Select The Month From Expiry Date

And user Select The Year From Expiry Date

And user Enter CVV Number in Cvv field

Then user Click On Book Now Button

 

