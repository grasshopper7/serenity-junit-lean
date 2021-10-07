package sauce.queries;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class CartQuery extends UIInteractionSteps {

	public boolean isProductAvailable(String name) {
		ListOfWebElementFacades products = $$(
				By.xpath(String.format("//div[@class='inventory_item_name' and text()='%s']", name)));
		return products.size() == 0 ? false : true;
	}
}
