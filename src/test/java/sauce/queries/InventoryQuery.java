package sauce.queries;

import net.serenitybdd.core.steps.UIInteractionSteps;
import sauce.components.InventoryComponent;

public class InventoryQuery extends UIInteractionSteps {

	public String getProductPageHeadingText() {
		return $(InventoryComponent.heading).getTextValue();
	}
}
