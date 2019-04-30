package com.retra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.retra.base.TestBase;

public class Stage2 extends TestBase {
	
	boolean status;
	/*<--------------------------------Stage 2 Page Elements------------------------------------------>*/
	/*--------------------------------------------------------------------------------------------------*/
	
	/*<--------------------------------Personal section Page Elements---------------------------------->*/
	@FindBy(xpath="")
	WebElement personalswitch;
	
	@FindBy(xpath="")
	WebElement Residentalswitch;
	
	@FindBy(xpath="")
	WebElement Financialswitch;
	
	//datepickericon
	@FindBy(xpath="")
	WebElement datepickericon;
	
	//date dropdown
	@FindBy(xpath="")
	WebElement date;
	
	//Year dropdown
	@FindBy(xpath="")
	WebElement years;
	
	//Month dropdown
	@FindBy(xpath="")
	WebElement months;
	
	//Gender dropdown
	@FindBy(xpath="")
	WebElement genderselect;
	
	//Gender dropdown
	@FindBy(xpath="")
	WebElement maritalselect;
		
	//Gender Citizenship
	@FindBy(xpath="")
	WebElement citizenshipselect;
	
	//submit button
	@FindBy(xpath="")
	WebElement submitbutton;
	
	//go back button
	@FindBy(xpath="")
	WebElement gobackbutton;
	
	
	
	
	/*<--------------------------------Stage 2 Page Error message------------------------------------------>*/
	
	//DOB error message
	@FindBy(xpath="")
	WebElement doberrormsg;
	
	//Gender selection error message
	@FindBy(xpath="")
	WebElement gendermsg;
	
	//marital selection field error message
	@FindBy(xpath="")
	WebElement maritalfielderrormsg;
	
	//citizenship selection error message
	@FindBy(xpath="")
	WebElement citizenshiperrormsg;
	
	
	/*<--------------------------------Residential section Page Elements---------------------------------->*/
	//Adress one field 
	@FindBy(xpath="")
	WebElement addressonefield;
	
	//Adress two field 
	@FindBy(xpath="")
	WebElement addresstwofield;
	
	//pincode field
	@FindBy(xpath="")
	WebElement pincodefield;
	
	//city field 
	@FindBy(xpath="")
	WebElement cityfield;
	
	//state field
	@FindBy(xpath="")
	WebElement statefield;
	
	//resident button
	@FindBy(xpath="")
	WebElement residentbutton;
	
	//Is a communication adress check box
	@FindBy(xpath="")
	WebElement adresschkbox;
	
	//constructor
	public Stage2() {
		PageFactory.initElements(driver,this);
	}
	
	/*<--------------------------Resident Section error message------------------------------------>*/
	//Adress one field errormsg 
	@FindBy(xpath="")
	WebElement addressonefielderrormsg;
	
	//Adress two field errormsg
	@FindBy(xpath="")
	WebElement addresstwofielderrormsg;
	
	//pincode field errormsg
	@FindBy(xpath="")
	WebElement pincodefielderrormsg;
	
	//city field errormsg
	@FindBy(xpath="")
	WebElement cityfielderrormsg;
	
	//state field errormsg
	@FindBy(xpath="")
	WebElement statefielderrormsg;
	
	//resident button errormsg
	@FindBy(xpath="")
	WebElement residentbuttonerrormsg;
	
	
	
	/*<--------------------------Personal section fields-------------------------------------------->*/
	public void pickdate(String day,String month,String year) throws InterruptedException {
		datepickericon.click();
		Select drpyear=new Select(years);
		drpyear.selectByVisibleText(year);
		Thread.sleep(1000);
		Select drpmnth=new Select(months);
		drpmnth.selectByVisibleText(month);
		Thread.sleep(2000);
		driver.findElement(By.linkText(day)).click();
		Thread.sleep(1000);
		
	}
	
	public void pickgender(String input) {
		Select gender=new Select(genderselect);
		gender.selectByVisibleText(input);
	}
	
	
	public void pickmariataltstatus(String input) {
		Select gender=new Select(maritalselect);
		gender.selectByVisibleText(input);
	}
	
	public void pickcitizenship(String input) {
		Select gender=new Select(citizenshipselect);
		gender.selectByVisibleText(input);
	}
	
	public void submit() {
		submitbutton.click();
	}
	
	public void goback() {
		gobackbutton.click();
	}
	
	/*<------------------boolean value for personal section boolean message------------------------------->*/
	
	public boolean dobmsg() {
		
		try {
			status=doberrormsg.isDisplayed();
			
		}
		catch(NoSuchElementException Exception) {
			status=false;
		}
		return status;
	}

	
	public boolean genderfieldmsg() {
	
		try {
			status=gendermsg.isDisplayed();
			
		}
		catch(NoSuchElementException Exception) {
			status=false;
		}
		return status;
		}

	public boolean mariatalstatusmsg() {
	
		try {
			status=maritalfielderrormsg.isDisplayed();
			
		}
		catch(NoSuchElementException Exception) {
			status=false;
		}
	return status;
	}

	
	public boolean citizenshipfieldmsg() {
	
		try {
			status=citizenshiperrormsg.isDisplayed();
			
		}
		catch(NoSuchElementException Exception) {
			status=false;
		}
	return status;
	}

	/*<--------------------------Residential section fields-------------------------------------------->*/
	public void enteradressone(String input) {
		addressonefield.sendKeys(input);
	}
	
	public void enteradresstwo(String input) {
		addresstwofield.sendKeys(input);
	}
	
	public void enterpincode(String input) {
		pincodefield.sendKeys(input);
	}
	
	public void pickcity(String input) {
		Select city=new Select(cityfield);
		city.selectByVisibleText(input);
	}
	
}
