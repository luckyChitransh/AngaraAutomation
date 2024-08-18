package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import test.angara.AngaraAutomation.Common;

public class Property extends Common
{
	public static String addToCart_Locator;
	public static String productDetailsPDP_Locator;
	public static String productCard_Locator;
	public static String gnb_Locator;
	
	public static void readDataFromTextFile() throws Exception
	{
		FileInputStream input = new FileInputStream("C:\\Users\\Chitransh Shrivastav\\eclipse-workspace\\AngaraAutomation\\src\\test\\java\\testNGPackage\\config.properties");
		
		Properties prop = new Properties();
		
		prop.load(input);
		
		addToCart_Locator = prop.getProperty("addToCart_Locator");
		productDetailsPDP_Locator = prop.getProperty("productDetailsPDP_Locator");
		productCard_Locator = prop.getProperty("productCard_Locator");
		gnb_Locator = prop.getProperty("gnb_Locator");
		
		
	}
}
