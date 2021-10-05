package sauce.steps;

import static org.assertj.core.api.Assertions.assertThat;

import net.thucydides.core.annotations.Step;
import sauce.actions.SelectProductAction;
import sauce.queries.InventoryQuery;

public class InventorySteps {

	private String actor;

	private SelectProductAction selectProductAction;

	private InventoryQuery inventoryQuery;

	@Step("#actor should see products displayed")
	public void verifyProductsDisplayed() {
		assertThat(inventoryQuery.getProductPageHeadingText()).isEqualTo("PRODUCTS");
	}

	@Step("#actor selects product named '{0}'")
	public void attemptToDisplayProductDetails(String productName) {
		selectProductAction.selectProduct(productName);
	}

}
