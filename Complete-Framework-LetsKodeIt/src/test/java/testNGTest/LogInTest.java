package testNGTest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

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
		openBrowser("chrome", "https://learn.letskodeit.com/");
		clickElement(hpx.logInButton);
		lif.enterEmailPassAndLogIn();
		System.out.println(getText(hpx.practiceButtonC));
		assertEquals(verifyText("Practice", hpx.practiceButtonC), true);
		sleep(3000);
		tearDown();
	}
	
	
}
