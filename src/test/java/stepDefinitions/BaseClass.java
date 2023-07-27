package stepDefinitions;

import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pageObjects.AddcustomerPage;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;

public class BaseClass {

	public WebDriver driver;
	public LoginPage lp;
	public AddcustomerPage addCust;
	public SearchCustomerPage searchCust;
	public static Logger logger;
	public Properties configProp;

	// Created for generating random string for Unique email
	public static String randomestring(int count) {

		// asdaHGvgghQ
		String generatedString1 = RandomStringUtils.randomAlphabetic(count);
		return (generatedString1);

	}

	public static String randomestring() {

		// asdaHGvgghQ
		String generatedString1 = RandomStringUtils.randomAlphabetic(11);
		return (generatedString1);

	}

}
