package com.retra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.retra.base.TestBase;

public class Otpform extends TestBase {
	
	@FindBy(xpath="")
	WebElement firstdigit;
	
	@FindBy(xpath="")
	WebElement seconddigit;
	
	@FindBy(xpath="")
	WebElement thirddigit;
	
	@FindBy(xpath="")
	WebElement fourthdigit;
	
	@FindBy(xpath="")
	WebElement fifthdigit;
	
	@FindBy(xpath="")
	WebElement sixthdigit;
	
	@FindBy(xpath="")
	WebElement otpbutton;
	
	
	public void enterotp(String input) {
		firstdigit.sendKeys(Character.toString(input.charAt(0))); //1stdigit
		seconddigit.sendKeys(Character.toString(input.charAt(1))); //2nddigit
		thirddigit.sendKeys(Character.toString(input.charAt(2))); //3rddigit
		fourthdigit.sendKeys(Character.toString(input.charAt(3))); //4thdigit
		fifthdigit.sendKeys(Character.toString(input.charAt(4))); //5thdigit
		sixthdigit.sendKeys(Character.toString(input.charAt(5))); //6thdigit
	}
	
	public void submitotp() {
		otpbutton.click();
	}
	
	

}
