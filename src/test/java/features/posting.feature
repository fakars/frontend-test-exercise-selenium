Feature: Verify posting view data

  @regression @posting
  Scenario Outline: As a user I want to access a posting and check its data
    Given I'm on the landing page and I select a country
    When I hover over the categories menu and select a <category> and a <sub category>
    And select <location> as location from the list and click on a random posting
    Then the product details should match those found in the listing

    Examples:
      | category         | sub category     | location        |
      | HOME_APPLIANCES  | AIR_CONDITIONING | CAPITAL_FEDERAL |