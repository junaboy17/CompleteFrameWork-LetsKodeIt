package functions;

import driverResource.Util;
import xPath.PracticePageXpath;

public class PracticePageFunction extends Util{
	PracticePageXpath pp = new PracticePageXpath();
	
			
	
 
	public void clickBmwRadioButton(){
		
		clickElement(pp.bmwRadioButton);
	}
	
	public void clickBenzRadioButton() {
		clickElement(pp.benzRadioButton);
	}
	
	public void clickHondaRadioButton() {
		clickElement(pp.hondaARadioButton);
	}
	
	public String getBmwRadioText() {
		return getText(pp.bmwRadioText);
		
	}
	
	
	
	
	public void clickBenzDropDown() {
		
		clickElement(pp.benzDropDown);
	}
	public void clickPeachColor() {
		clickElement(pp.peachColor);
		
	}
	public void clickHondaCheckBOx() {
		clickElement(pp.hondaCheckBox);
	}
	
	public void clickNewWindow() {
		clickElement(pp.openWindow);
		
	}
}
