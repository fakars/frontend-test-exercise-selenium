$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/categories.feature");
formatter.feature({
  "name": "Verify categories list functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "As a user I want to search for products using the categories list",
  "description": "",
  "keyword": "Scenario Outline"
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
  "name": "the subcategory title should match the selected \u003csub category\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "the results counter should be visible",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "category",
        "sub category"
      ]
    },
    {
      "cells": [
        "HOME_APPLIANCES",
        "AIR_CONDITIONING"
      ]
    },
    {
      "cells": [
        "TECHNOLOGY",
        "CELLPHONES"
      ]
    },
    {
      "cells": [
        "TOOLS_INDUSTRIAL",
        "TEXTILE"
      ]
    },
    {
      "cells": [
        "TOYS_BABIES",
        "BABY_ROOM"
      ]
    }
  ]
});
formatter.scenario({
  "name": "As a user I want to search for products using the categories list",
  "description": "",
  "keyword": "Scenario Outline"
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
  "name": "the subcategory title should match the selected AIR_CONDITIONING",
  "keyword": "Then "
});
formatter.match({
  "location": "ListingsPageSteps.java:12"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the results counter should be visible",
  "keyword": "And "
});
formatter.match({
  "location": "ListingsPageSteps.java:16"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "As a user I want to search for products using the categories list",
  "description": "",
  "keyword": "Scenario Outline"
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
  "name": "I hover over the categories menu and select a TECHNOLOGY and a CELLPHONES",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps.java:11"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the subcategory title should match the selected CELLPHONES",
  "keyword": "Then "
});
formatter.match({
  "location": "ListingsPageSteps.java:12"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the results counter should be visible",
  "keyword": "And "
});
formatter.match({
  "location": "ListingsPageSteps.java:16"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "As a user I want to search for products using the categories list",
  "description": "",
  "keyword": "Scenario Outline"
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
  "name": "I hover over the categories menu and select a TOOLS_INDUSTRIAL and a TEXTILE",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps.java:11"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the subcategory title should match the selected TEXTILE",
  "keyword": "Then "
});
formatter.match({
  "location": "ListingsPageSteps.java:12"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the results counter should be visible",
  "keyword": "And "
});
formatter.match({
  "location": "ListingsPageSteps.java:16"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "As a user I want to search for products using the categories list",
  "description": "",
  "keyword": "Scenario Outline"
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
  "name": "I hover over the categories menu and select a TOYS_BABIES and a BABY_ROOM",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps.java:11"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the subcategory title should match the selected BABY_ROOM",
  "keyword": "Then "
});
formatter.match({
  "location": "ListingsPageSteps.java:12"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the results counter should be visible",
  "keyword": "And "
});
formatter.match({
  "location": "ListingsPageSteps.java:16"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/posting.feature");
formatter.feature({
  "name": "Verify posting view data",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "As a user I want to access a posting and check its data",
  "description": "",
  "keyword": "Scenario Outline"
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
  "keyword": "Scenario Outline"
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