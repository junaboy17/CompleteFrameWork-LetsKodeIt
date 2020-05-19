package functions;

import driverResource.Util;
import xPath.LogInPageXPath;

public class LogInPageFunctions extends Util{
	
	LogInPageXPath lix = new LogInPageXPath();
	
	public void enterEmailPassAndLogIn(){
		sendText(lix.enterEmail, "wolvesfield@mail.com");
		sendText(lix.enterPassword, "123456");
		clickElement(lix.clickLogIn);
	}

}
