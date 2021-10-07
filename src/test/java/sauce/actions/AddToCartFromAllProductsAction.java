package sauce.actions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class AddToCartFromAllProductsAction extends UIInteractionSteps {

	public void addProductToCart(String productName) {
		$(By.xpath("//div[@class='inventory_item_name' and text()='" + productName
				+ "']//ancestor::div[@class='inventory_item_label']//following-sibling::div[@class='pricebar']/button[@id='add-to-cart-sauce-labs-backpack']"))
						.click();
	}

}
