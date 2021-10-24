package sauce.features;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import sauce.actions.BeginAction;
import sauce.actions.InputCredentialsActionNS;
import sauce.queries.LoginQueryNS;

@RunWith(SerenityRunner.class)
@Ignore
public class SauceLoginNS {

	@Managed
	private WebDriver driver;

	@Steps(actor = "Mounish")
	private BeginAction beginAction;

	@Steps(actor = "Mounish")
	private InputCredentialsActionNS inputCredentialsActionNS;

	@Steps(actor = "Mounish")
	private LoginQueryNS loginQueryNS;

	@Before
	public void openSauceSite() {
		beginAction.navigateToStartPage();
	}

	@Test
	@Title("Failed Login Test")
	public void shouldFailLogin() {

		inputCredentialsActionNS.enterDetails("wrong_user", "open_sauce");
		assertThat(loginQueryNS.loginInformationMessage())
				.isEqualTo("Epic11 sadface: Username and password do not match any user in this service");
	}
}
