package sauce.components;

import org.openqa.selenium.By;

public class ProductDetailsComponent {

	public static By productName = By
			.xpath("//div[@id='inventory_item_container']//div[@class='inventory_details_name large_size']");

	public static By productPrice = By
			.xpath("//div[@id='inventory_item_container']//div[@class='inventory_details_price']");
}
