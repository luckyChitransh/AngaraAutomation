package test.angara.AngaraAutomation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AppTest {
	
	Common common = new Common();
	HomePage homePage = new HomePage();
	PDP pdp = new PDP();
	RingsCatalog ringsCatalog = new RingsCatalog();
	SoftAssert SA = new SoftAssert();
	CartPage cartPage = new CartPage();
	
	@Test(dataProvider = "getData", dataProviderClass = Common.class)
	public void test1(String data) throws Exception 
	{
		common.openBrowser();
		homePage.openGnb("Necklaces");
		common.wait(10000);
		ringsCatalog.clickOnProductCard(data);

		common.switchWindow();

		pdp.selectRingSize();
		common.wait(2000);
		String caratWeightonPdp = pdp.getProductDetailsPDP("Total Carat Weight").substring(0, 3);
		String GemstoneQualityonPDP = pdp.getProductDetailsPDP("Gemstone Quality");
		String MetalTypeOnPdp = pdp.getProductDetailsPDP("Metal Type");

		pdp.clickOnAddToCart();
		
		String GemstoneQualityOnCatalog = cartPage.getProductDetails("Gemstone Quality");
		String CaratWeightOnCatalog = cartPage.getProductDetails("Total Carat Weight").substring(0, 3);
		String MetalTypeOnCatalog = cartPage.getProductDetails("Metal Type");

		SA.assertEquals(CaratWeightOnCatalog, caratWeightonPdp );
		SA.assertEquals(GemstoneQualityOnCatalog, GemstoneQualityonPDP);
		SA.assertEquals(MetalTypeOnCatalog, MetalTypeOnPdp);

		SA.assertAll();

		common.quitBrowser();
	}
	
	public void test2() throws Exception
	{
		common.openBrowser();
		homePage.openGnb("Rings");
		common.wait(10000);
		
	}

	
	
}
