package test.angara.AngaraAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	
	
	@Test
	public void newTest()
	{
		WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	
    	driver.get("https://frontend.v2.qa.angara.com/");	
	}

}
