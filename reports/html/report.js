$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/posting.feature");
formatter.feature({
  "name": "Verify posting view data",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "As a user I want to access a posting and check its data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@posting"
    }
  ]
});
formatter.step({
  "name": "I\u0027m on the landing page and I select a country",
  "keyword": "Given "
});
formatter.step({
  "name": "I hover over the categories menu and select a \u003ccategory\u003e and a \u003csub category\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "select \u003clocation\u003e as location from the list and click on a random posting",
  "keyword": "And "
});
formatter.step({
  "name": "the product details should match those found in the listing",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "category",
        "sub category",
        "location"
      ]
    },
    {
      "cells": [
        "HOME_APPLIANCES",
        "AIR_CONDITIONING",
        "CAPITAL_FEDERAL"
      ]
    }
  ]
});
formatter.scenario({
  "name": "As a user I want to access a posting and check its data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@posting"
    }
  ]
});
formatter.step({
  "name": "I\u0027m on the landing page and I select a country",
  "keyword": "Given "
});
formatter.match({
  "location": "LandingPageSteps.java:11"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I hover over the categories menu and select a HOME_APPLIANCES and a AIR_CONDITIONING",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps.java:11"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select CAPITAL_FEDERAL as location from the list and click on a random posting",
  "keyword": "And "
});
formatter.match({
  "location": "ListingsPageSteps.java:18"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the product details should match those found in the listing",
  "keyword": "Then "
});
formatter.match({
  "location": "PostingPageSteps.java:10"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});