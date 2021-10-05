package sauce.features;

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
import sauce.steps.InventorySteps;
import sauce.steps.LoginSteps;

@RunWith(SerenityRunner.class)
@Ignore
public class SauceLogin {

	@Managed
	private WebDriver driver;

	@Steps(actor = "Mounish")
	private BeginAction begin;

	@Steps(actor = "Mounish")
	private LoginSteps loginSteps;

	@Steps(actor = "Mounish")
	private InventorySteps inventorySteps;

	@Before
	public void openSauceSite() {
		begin.navigateToStartPage();
	}

	@Test
	@Title("Successful Login Test")
	public void shouldLoginSuccesfully() {
		loginSteps.attemptToLogin("standard_user", "secret_sauce");
		inventorySteps.verifyProductsDisplayed();
	}

	@Test
	@Title("Failed Login Test")
	public void shouldFailLogin() {
		loginSteps.attemptToLogin("wrong_user", "open_sauce");
		loginSteps.verifyLoginFailureMessage();
	}
}
