package test.angara.AngaraAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Utility.Property;

public class RingsCatalog extends Property
{
	
	public void clickOnProductCard(String productName)
	{
	WebElement ProductCard = driver.findElement(By.xpath(productCard_Locator.replace("productName", productName)));
	ProductCard.click();
	}
	
	

}
