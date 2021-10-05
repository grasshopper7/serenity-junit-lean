package sauce.actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import sauce.components.InventoryComponent;

public class SelectProductAction extends UIInteractionSteps {

	public void selectProduct(String name) {
		$(InventoryComponent.productName(name)).click();
	}
}
