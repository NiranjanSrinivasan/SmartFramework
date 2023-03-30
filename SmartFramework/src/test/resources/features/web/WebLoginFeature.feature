Feature: Login to Application

Scenario: Login using Valid Credentials
Given Open Browser and Navigate to URL "https://www.saucedemo.com/"
And Enter Username as "standard_user"
And Enter Password as "secret_sauce"
And Click Login 
And Close Browser