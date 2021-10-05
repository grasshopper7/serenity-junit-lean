package sauce.queries;

import net.serenitybdd.core.steps.UIInteractionSteps;
import sauce.components.InventoryComponent;
import sauce.components.ProductDetailsComponent;

public class ProductDetailsQuery extends UIInteractionSteps {

	public String getProductName() {
		return $(ProductDetailsComponent.productName).getTextValue();
	}

	public String getProductPrice() {
		return $(ProductDetailsComponent.productPrice).getTextValue();
	}
}
