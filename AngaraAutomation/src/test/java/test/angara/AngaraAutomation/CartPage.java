package test.angara.AngaraAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CartPage extends Common {

	public String getProductDetails(String type) {
		WebElement details = driver
				.findElement(By.xpath("//span[contains(text(),'" + type + "')]/following-sibling::span"));
		return details.getText();

	}
}
