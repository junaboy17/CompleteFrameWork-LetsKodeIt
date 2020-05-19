package testNGTest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import driverResource.Util;
import functions.HomePageFunction;
import functions.LogInPageFunctions;
import xPath.HomePageXPath;
import xPath.LogInPageXPath;

public class LogOutTest extends Util{
	HomePageXPath hpx = new HomePageXPath();
	LogInPageXPath lix = new LogInPageXPath();
	LogInPageFunctions lif = new LogInPageFunctions();
	HomePageFunction hpf = new HomePageFunction();
	
	@Test
	public void veryifyLogOut() {
		openBrowser("chrome", "https://learn.letskodeit.com/");
		clickElement(hpx.logInButton);
		lif.enterEmailPassAndLogIn();
		hpf.clickLogOut();
		System.out.println(hpf.topHeaderText());
		assertEquals(verifyText("Welcome to Let's Kode It", hpx.topHeader), true);
		sleep(3000);
		tearDown();
	}

}
