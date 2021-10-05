package sauce.features;

import org.junit.Before;
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
import sauce.steps.ProductDetailsSteps;

@RunWith(SerenityRunner.class)
public class SauceViewProduct {

	@Managed
	private WebDriver driver;

	@Steps(actor = "Mounish")
	private BeginAction begin;

	@Steps(actor = "Mounish")
	private LoginSteps loginSteps;

	@Steps(actor = "Mounish")
	private InventorySteps inventorySteps;

	@Steps(actor = "Mounish")
	private ProductDetailsSteps productDetailsSteps;

	@Before
	public void openSauceSite() {
		begin.navigateToStartPage();
		loginSteps.attemptToLogin("standard_user", "secret_sauce");
	}

	@Test
	@Title("Select Product Details")
	public void shouldViewProductSuccesfully() {
		String productName = "Test.allTheThings() T-Shirt (Red)";
		String productPrice = "$15.99";

		inventorySteps.attemptToDisplayProductDetails(productName);
		productDetailsSteps.verifyProductDetails(productName, productPrice);
	}
}
