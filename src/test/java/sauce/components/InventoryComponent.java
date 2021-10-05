package sauce.components;

import org.openqa.selenium.By;

public class InventoryComponent {

	public static By heading = By.xpath("//div[@id='header_container']//span[@class='title']");

	private static String productName = "//div[@class='inventory_item_description']//div[@class='inventory_item_name' and text()='%s']";

	public static By productName(String name) {
		return By.xpath(String.format(productName, name));
	}
}
