package functions;

import driverResource.Util;
import xPath.CoursesPageXpath;

public class CoursePageFunction extends Util {
	CoursesPageXpath cpx = new CoursesPageXpath();
	

	public void clickLogIn () {
		clickElement(cpx.loginButton);
		
	}
	
}
