Feature: Verify categories list functionality

  Scenario Outline: As a user I want to search for products using the categories list
    Given I'm on the landing page and I select a country
    When I hover over the categories menu and select a <category> and a <sub category>
    Then the subcategory title should match the selected <sub category>
    And the results counter should be visible

    Examples:
      | category         | sub category     |
      | HOME_APPLIANCES  | AIR_CONDITIONING |
      | TECHNOLOGY       | CELLPHONES       |
      | TOOLS_INDUSTRIAL | TEXTILE          |
      | TOYS_BABIES      | BABY_ROOM        |