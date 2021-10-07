package sauce.actions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class DisplayCartFromIconAction extends UIInteractionSteps {

	public void displayProductsInCart() {
		$(By.id("shopping_cart_container")).click();
	}
}
