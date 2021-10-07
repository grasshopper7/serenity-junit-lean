package sauce.steps;

import static org.assertj.core.api.Assertions.assertThat;

import net.thucydides.core.annotations.Step;
import sauce.actions.DisplayCartFromIconAction;
import sauce.queries.CartIconQuery;
import sauce.queries.CartQuery;

public class CartSteps {

	private String actor;

	private CartIconQuery cartIconQuery;

	private CartQuery cartQuery;

	private DisplayCartFromIconAction displayCartFromIconAction;

	@Step("#actor should see '{0}' products count in cart icon")
	public void verifyProductCountInCartIcon(int count) {
		assertThat(cartIconQuery.productCountInCart()).isEqualTo(count);
	}

	@Step("#actor should see product '{0}' available in cart")
	public void verifyProductAvailableInCart(String name) {
		assertThat(cartQuery.isProductAvailable(name)).isEqualTo(true);
	}

	@Step("#actor attempts to see products in cart")
	public void attemptToDisplayCartDetails() {
		displayCartFromIconAction.displayProductsInCart();
	}
}
