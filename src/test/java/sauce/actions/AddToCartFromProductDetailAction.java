package sauce.actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import sauce.components.ProductDetailsComponent;

public class AddToCartFromProductDetailAction extends UIInteractionSteps {

	public void addProductToCart(String productName) {
		$(ProductDetailsComponent.addToCartButton).click();
	}

}
