package test.angara.AngaraAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utility.Property;

public class PDP extends Property {

	public void selectRingSize() {
		WebElement RingSize = driver.findElement(By.xpath("//div[@id='rs_6']"));
		RingSize.click();

	}

	public void clickOnAddToCart() 
	{
		System.out.println(addToCart_Locator);
		WebElement AddToCArtButton = driver.findElement(By.xpath(addToCart_Locator));
		AddToCArtButton.click();

	}
		
	public String getProductDetailsPDP(String type) 
	{
		
//		WebElement detail = driver.findElement(By.xpath("//span[@class='option-title' and contains(text(),'" + type + "')]/following-sibling::span"));
//		return detail.getText();
		
		WebElement detail = driver.findElement(By.xpath(productDetailsPDP_Locator.replace("type", type)));
		return detail.getText();
		

	}


}
