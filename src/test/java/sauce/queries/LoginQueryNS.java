package sauce.queries;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import sauce.components.LoginComponent;

public class LoginQueryNS extends UIInteractionSteps {

	private String actor;

	@Step("#actor should see login failure message")
	public String loginInformationMessage() {
		return $(LoginComponent.errorMessage).getTextValue();
	}
}
