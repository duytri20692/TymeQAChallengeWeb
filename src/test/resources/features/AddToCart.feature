@TymeQAAutomationTest
Feature: Add to Cart an Item on T-shirts

  @AddToCartWithChromeBrowser
  Scenario: Add to Cart an Item on T-shirts
    Given As the EndUser, Given I can open Chrome
    And I access automation test store page
    Then I can see the home page of the Automation test Store
    And I can hover my mouse to APPAREL & ACCESSORIES menu
    Then I can see Shoes and T-shirts categories in APPAREL & ACCESSORIES menu
    And I can click on T-Shirts categories
    Then I can see T-Shirts page
    And I can select Sort by Price Low > High on T-Shirt page
    And I can verify that all items were sorted by Price Low > High
    Then I add to Cart an Item on T-shirts
    And I can see the item detailed information

  @AddToCartWithFirefoxBrowser
  Scenario: Add to Cart an Item on T-shirts
    Given As the EndUser, Given I can open Firefox
    And I access automation test store page
    Then I can see the home page of the Automation test Store
    And I can hover my mouse to APPAREL & ACCESSORIES menu
    Then I can see Shoes and T-shirts categories in APPAREL & ACCESSORIES menu
    And I can click on T-Shirts categories
    Then I can see T-Shirts page
    And I can select Sort by Price Low > High on T-Shirt page
    And I can verify that all items were sorted by Price Low > High
    Then I add to Cart an Item on T-shirts
    And I can see the item detailed information