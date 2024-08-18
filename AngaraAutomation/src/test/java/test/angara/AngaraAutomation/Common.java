package test.angara.AngaraAutomation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

import com.Utility.Property;

public class Common {
	public static WebDriver driver;

	public void openBrowser() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://frontend.v2.qa.angara.com/");
		Property.readDataFromTextFile();
	}

	public void switchWindow() {
		Set<String> set = driver.getWindowHandles();
		Iterator<String> iterator = set.iterator();

		String FirstWindow = iterator.next();
		String SecondWindow = iterator.next();

		driver.switchTo().window(SecondWindow);
	}

	public void wait(int Sec) throws Exception {
		Thread.sleep(Sec);
	}

	public void quitBrowser() {
		driver.quit();
	}
	
	@DataProvider
	public Object getData()
	{
		Object[] data = new Object[2];
		
		data[0] = "Solitaire Round Diamond Infinity Promise Ring";
		data[1] = "Lab-Grown Princess Diana Inspired Blue Sapphire Ring with Lab Diamond Halo";
//		data[2] = "3";
//		data[3] = "4";
//		data[4] = "5";
		
		return data;
	}
	
	
	
}
