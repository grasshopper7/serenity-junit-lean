package sauce.actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import sauce.components.LoginComponent;

public class InputCredentialsAction extends UIInteractionSteps {

	public void enterDetails(String username, String password) {

		$(LoginComponent.username).type(username);
		$(LoginComponent.password).type(password);
		$(LoginComponent.submit).submit();
	}

}
