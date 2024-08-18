package test.angara.AngaraAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Utility.Property;

public class HomePage extends Property 
{

	public void openGnb(String JewelryType) 
	{
		WebElement gnb = driver.findElement(By.xpath(gnb_Locator.replace("JewelryType", JewelryType)));
		gnb.click();
	}

}


