package sauce.actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import sauce.components.LoginComponent;

public class InputCredentialsActionNS extends UIInteractionSteps {
	
	private String actor;

	@Step("#actor logs in with details - username '{0}' and password '{1}'")
	public void enterDetails(String username, String password) {

		$(LoginComponent.username).type(username);
		$(LoginComponent.password).type(password);
		$(LoginComponent.submit).submit();
	}

}
