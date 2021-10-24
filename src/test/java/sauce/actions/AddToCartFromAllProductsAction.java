package sauce.actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import sauce.components.InventoryComponent;

public class AddToCartFromAllProductsAction extends UIInteractionSteps {

	public void addProductToCart(String productName) {
		$(InventoryComponent.addToCartButton(productName)).click();
	}
}
