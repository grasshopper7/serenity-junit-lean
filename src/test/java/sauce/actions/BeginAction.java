package sauce.actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class BeginAction extends UIInteractionSteps {

	private String actor;

	@Step("#actor navigates to sauce demo site")
	public void navigateToStartPage() {
		// Use environment setting logic from conf file
		openAt("https://www.saucedemo.com/");
	}
}
