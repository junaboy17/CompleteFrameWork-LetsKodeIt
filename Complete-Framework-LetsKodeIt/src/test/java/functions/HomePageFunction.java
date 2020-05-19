package functions;

import driverResource.Util;
import xPath.HomePageXPath;

public class HomePageFunction extends Util {
	HomePageXPath hp = new HomePageXPath();
	

	public void clickPracticeaButton() {
		clickElement(hp.practiceButton);
		
	}
	
	public void clickLogIn() {
		clickElement(hp.logInButton);
		
	}
	
	public void clickSignUpButton() {
		clickElement(hp.signUpButton);
		
	}
	
	public boolean verifyEditProfile () {
		return verifyText("Edit Profile", hp.editProfile );
		
		
		
		
	}
	public void clickUserAvatar() {
		clickElement(hp.userAvatar);
		
	}
	
	public void clickLogOut() {
		clickElement(hp.userAvatar);
		clickElement(hp.logOutButton);
	}
	
	public String topHeaderText() {
		return getText(hp.topHeader);
	}
}
