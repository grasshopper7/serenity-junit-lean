package sauce.queries;

import net.serenitybdd.core.steps.UIInteractionSteps;
import sauce.components.LoginComponent;

public class LoginQuery extends UIInteractionSteps {

	public String loginInformationMessage() {
		return $(LoginComponent.errorMessage).getTextValue();
	}
}
