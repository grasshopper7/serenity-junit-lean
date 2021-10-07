package sauce.steps;

import net.thucydides.core.annotations.Step;
import sauce.actions.AddToCartFromAllProductsAction;
import sauce.actions.SelectProductAction;

public class InventorySteps {

	private String actor;

	private SelectProductAction selectProductAction;

	private AddToCartFromAllProductsAction addToCartFromAllProductsAction;

	@Step("#actor selects product named '{0}'")
	public void attemptToDisplayProductDetails(String productName) {
		selectProductAction.selectProduct(productName);
	}

	@Step("#actor adds product named '{0} to cart")
	public void attemptToAddProductToCart(String productName) {
		addToCartFromAllProductsAction.addProductToCart(productName);
	}

}
