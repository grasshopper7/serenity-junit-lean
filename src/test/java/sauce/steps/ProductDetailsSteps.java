package sauce.steps;

import static org.assertj.core.api.Assertions.assertThat;

import net.thucydides.core.annotations.Step;
import sauce.actions.AddToCartFromProductDetailAction;
import sauce.queries.ProductDetailsQuery;

public class ProductDetailsSteps {

	private String actor;

	private ProductDetailsQuery productDetailsQuery;
	
	private AddToCartFromProductDetailAction addToCartFromProductDetailAction;

	@Step("#actor should see name - '{0}' name and price - '{1}' displayed")
	public void verifyProductDetails(String name, String price) {
		assertThat(productDetailsQuery.getProductName()).isEqualTo(name);
		assertThat(productDetailsQuery.getProductPrice()).isEqualTo(price);
	}
	
	@Step("#actor adds product named '{0}' to cart")
	public void attemptToAddProductToCart(String productName) {
		addToCartFromProductDetailAction.addProductToCart(productName);
	}
}
