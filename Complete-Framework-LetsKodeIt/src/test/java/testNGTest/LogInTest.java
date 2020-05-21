package testNGTest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import driverResource.Util;
import functions.HomePageFunction;
import functions.LogInPageFunctions;
import xPath.HomePageXPath;
import xPath.LogInPageXPath;

public class LogInTest extends Util{

	HomePageXPath hpx = new HomePageXPath();
	LogInPageXPath lix = new LogInPageXPath();
	LogInPageFunctions lif = new LogInPageFunctions();
	HomePageFunction hpf = new HomePageFunction();
	
	@Test
	public void veryifyLogIn() {
		ExtentReports report;
		ExtentTest test;
		report = new ExtentReports("C:\\Users\\junab\\Documents\\Extent Report\\LongIn.html");
		test = report.startTest("Verify Log In Test");
		openBrowser("chrome", "https://learn.letskodeit.com/");
		clickElement(hpx.logInButton);
		lif.enterEmailPassAndLogIn();
		System.out.println(getText(hpx.practiceButtonC));
		assertEquals(verifyText("Practice", hpx.practiceButtonC), true);
		sleep(3000);
		tearDown();
	}
	
	
}
