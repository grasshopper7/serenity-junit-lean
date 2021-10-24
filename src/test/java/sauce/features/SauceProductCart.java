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
import sauce.steps.CartSteps;
import sauce.steps.InventorySteps;
import sauce.steps.LoginSteps;
import sauce.steps.ProductDetailsSteps;

@RunWith(SerenityRunner.class)
public class SauceProductCart {

	@Managed
	private WebDriver driver;

	@Steps(actor = "Mounish")
	private BeginAction beginAction;

	@Steps(actor = "Mounish")
	private LoginSteps loginSteps;

	@Steps(actor = "Mounish")
	private InventorySteps inventorySteps;

	@Steps(actor = "Mounish")
	private ProductDetailsSteps productDetailSteps;

	@Steps(actor = "Mounish")
	private CartSteps cart;

	@Before
	public void openSauceSite() {
		beginAction.navigateToStartPage();
		loginSteps.attemptToLogin("standard_user", "secret_sauce");
		loginSteps.verifyProductsDisplayed();
	}

	@Test
	@Title("Add to Cart from All Products Page")
	public void shouldAddToCartFromAllProductsSuccesfully() {
		String productName = "Sauce Labs Backpack";
		inventorySteps.attemptToAddProductToCart(productName);
		cart.verifyProductCountInCartIcon(1);
		cart.attemptToDisplayCartDetails();
		cart.verifyProductAvailableInCart(productName);
	}

	@Test
	@Title("Add to Cart from Product Details Page")
	public void shouldAddToCartFromProductDetailSuccesfully() {
		String productName = "Sauce Labs Bike Light";
		inventorySteps.attemptToDisplayProductDetails(productName);
		productDetailSteps.attemptToAddProductToCart(productName);
		cart.verifyProductCountInCartIcon(1);
		cart.attemptToDisplayCartDetails();
		cart.verifyProductAvailableInCart(productName);
	}
}
