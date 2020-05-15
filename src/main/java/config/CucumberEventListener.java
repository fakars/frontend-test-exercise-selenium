package config;

import cucumber.api.event.*;

public class CucumberEventListener implements EventListener {

	public CucumberEventListener() {
	}

	@Override
	public void setEventPublisher(EventPublisher publisher) {

		publisher.registerHandlerFor(TestRunFinished.class, testRun -> {
			DriverManager.getInstance().quitBrowser();
		});
	}
}
