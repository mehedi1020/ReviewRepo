Feature: Amazon Shoping

Scenario: Buy First Toy
Given open chrome browser
And nevigate to url

When user search toy in search text box
And user click search button
And user click on first product
And user click on add to cart button
And user click on proceed to checkout button
Then user should see sign in page

