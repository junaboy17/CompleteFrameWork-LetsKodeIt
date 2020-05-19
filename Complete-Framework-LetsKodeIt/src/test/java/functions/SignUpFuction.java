package functions;

import driverResource.Util;
import xPath.SignUpXpath;

public class SignUpFuction extends Util {
	SignUpXpath spx = new SignUpXpath();
			

	public void completeSignUp(String fullName, String email, String password, String conPassword) {
		sendText(spx.fullName, fullName);
		sendText(spx.emailAddress, email);
		sendText(spx.password, password);
		sendText(spx.confirmationPassword, conPassword);
		clickElement(spx.iAgreePromo);
		clickElement(spx.iAgreeTerms);
		clickElement(spx.clickSignUp);
		
		
		
	}

}
