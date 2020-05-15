package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import config.DriverManager;

public class Hooks {

    private WebDriver driver = DriverManager.getInstance().getDriver();

	@After
	public void embedImgReport(Scenario scenario) {
		if (scenario.isFailed()) {
			scenario.write("Error found at: " + driver.getCurrentUrl() + " Page title: " + driver.getTitle());
			scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
		}
	}
}
