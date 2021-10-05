package sauce.steps;

import static org.assertj.core.api.Assertions.assertThat;

import net.thucydides.core.annotations.Step;
import sauce.actions.InputCredentialsAction;
import sauce.queries.LoginQuery;

public class LoginSteps {

	private String actor;

	private InputCredentialsAction inputCredentialsAction;

	private LoginQuery loginQuery;

	@Step("#actor logs in with details - username '{0}' and password '{1}'")
	public void attemptToLogin(String username, String password) {
		inputCredentialsAction.enterDetails(username, password);
	}

	@Step("#actor should see login failure message")
	public void verifyLoginFailureMessage() {
		assertThat(loginQuery.loginInformationMessage())
				.isEqualTo("Epic sadface: Username and password do not match any user in this service");
	}
}
