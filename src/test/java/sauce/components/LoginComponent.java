package sauce.components;

import org.openqa.selenium.By;

public class LoginComponent {

	public static By username = By.id("user-name");

	public static By password = By.id("password");

	public static By submit = By.id("login-button");

	public static By errorMessage = By
			.xpath("//div[@id='login_button_container']//div[@class='error-message-container error']");
}
