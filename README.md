# Primary front end automation tests exercises

 Automated front end tests for [MercadoLibre Argentina](https://www.mercadolibre.com.ar/)
 created as part of Primary's interview exercises 
## Technologies used:

* [Java v1.8.0_221](https://www.oracle.com/technetwork/java/javase/8u221-relnotes-5480116.html)
* [Gradle v6.0.1](https://docs.gradle.org/current/userguide/userguide.html)
* [Selenium-Java v3.141.59](https://www.selenium.dev/documentation/en/)
* [Cucumber-Java v4.3.1](https://cucumber.io/docs/installation/java/)
* [Cucumber-Junit v4.3.1](https://cucumber.io/docs/installation/java/#junit-integration)
* [Picocontainer v1.2.5](http://picocontainer.com/introduction.html)



## Install and usage:

1. Clone the project using the command `git clone https://github.com/fakars/frontend-test-exercise-selenium.git`.
2. At the project's root folder run the command `./gradlew clean test` (`gradlew` if running on Windows), 
some optional parameters are available using the project flag `-D{parameterName}={argument}`.
3. Optional parameters that can be passed:

| ParamName          | Description                                                                                                            | Available values                                   |
| ------------------ | ---------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------- |
| `site-id`          | Sets the country page link selector to select the country in which the tests will be run                               | AR, BR, etc, *Default: 'AR'*                       |                             
| `browser`          | Sets the browser used to execute the tests                                                                             | chrome, firefox *Default: 'chrome'*                |             
| `mode`             | It permits running tests in headless mode                                                                              | headless                                           |
| `cucumber.options` | Cucumber default CLI parameter, it can be used to pass tags to selectively run tests using the value "--tags *@{tag}*" | @regression, @categories, @posting                 |