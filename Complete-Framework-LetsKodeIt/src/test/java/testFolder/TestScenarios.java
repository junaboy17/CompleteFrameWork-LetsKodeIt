package testFolder;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import driverResource.Util;
import functions.LogInPageFunctions;
import xPath.HomePageXPath;
import xPath.LogInPageXPath;

public class TestScenarios extends Util{
	
	HomePageXPath hpx = new HomePageXPath();
	LogInPageXPath lix = new LogInPageXPath();
	LogInPageFunctions lif = new LogInPageFunctions();
	
	//@Test
	public void testing() {
		openBrowser("chrome", "https://learn.letskodeit.com/");
		clickElement(hpx.logInButton);
		lif.enterEmailPassAndLogIn();
		System.out.println(getText(hpx.practiceButtonC));
		assertEquals(verifyText("Practice", hpx.practiceButtonC), true);
		sleep(3000);
		tearDown();
	}
	
}
