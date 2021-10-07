package sauce.actions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class AddToCartFromProductDetailAction extends UIInteractionSteps {

	public void addProductToCart(String productName) {
		$(By.id("add-to-cart-sauce-labs-bike-light")).click();
	}

}
