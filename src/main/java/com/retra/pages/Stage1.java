package com.retra.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.retra.base.TestBase;

public class Stage1 extends TestBase {
	boolean status;
	
	/*---------------------------------->Stage 1 Field elements<---------------------------------------*/ 
	
	//fullname field
	@FindBy(xpath="")
	WebElement fullnamefield;
	
	//company name field
	@FindBy(xpath="")
	WebElement companyfield;
	
	//mobilenumber field
	@FindBy(xpath="")
	WebElement mobilenumberfield;
	
	//email id field
	@FindBy(xpath="")
	WebElement emailidfield;
	
	//purpose of Loan dropdown
	@FindBy(xpath="")
	WebElement loandropdown;
	
	//moneyslider
	@FindBy(xpath="")
	WebElement slider;
	
	//submitbutton
	@FindBy(xpath="")
	WebElement submitbutton ;
	
	//otherfield
	@FindBy(xpath="")
	WebElement otherfield;
	
	//otherfield
	@FindBy(xpath="")
	WebElement otherfielderrormsg;
	
	
	/*------------------------------->Stage 1 Field error message<---------------------------------------*/ 
	
	//fullname fielderrormsg
	@FindBy(xpath="")
	WebElement fullnamefielderrormsg;
	
	//company name field errormsg
	@FindBy(xpath="")
	WebElement companyfielderrormsg;
		
	//mobilenumber field error msg
	@FindBy(xpath="")
	WebElement mobilenumberfielderrormsg;
		
	//email id field error msg
	@FindBy(xpath="")
	WebElement emailidfielderrormsg;
		
	//purpose of Loan dropdown error msg
	@FindBy(xpath="")
	WebElement loandropdownerrormsg;
	
	/*------------------------------->Stage 1 Field browser methods<-----------------------------------*/ 
	
	public Stage1(){
		PageFactory.initElements(driver,this);
	}
	
	public void enterfullname(String input) {
		fullnamefield.sendKeys(input);
	}
	
	public void entercompanyname(String input) {
		companyfield.sendKeys(input);
	}
	
	public void entermobilenumber(String input) {
		mobilenumberfield.sendKeys(input);
	}
	
	public void selectloan(String input) {
		Select dropdown=new Select(loandropdown);
		dropdown.selectByVisibleText(input);
	}
	
	
	public void selectmoney(String input) {
		Actions act=new Actions(driver);
		act.dragAndDropBy(slider,20,328);
		Action action=(Action)act.dragAndDropBy(slider,0,328).build();
		action.perform();
	}
	
	public void submit() {
		submitbutton.click();
	}
	
	public void deletefullname() {
		fullnamefield.clear();
	}
	
	public void deletecompanyname() {
		companyfield.clear();
	}
	
	public void deleteemailid() {
		emailidfield.clear();
	}
	
	public void mobnofield() {
		mobilenumberfield.clear();	
	}
	
	public void Otherfield(String input) {
		otherfield.sendKeys(input);
	}
	
	public void clrOtherfield() {
		otherfield.clear();
	}
	
	
	
	public boolean fullnamemsg() {
		
		try {
			status=fullnamefielderrormsg.isDisplayed();
			
		}
		catch(NoSuchElementException Exception) {
			status=false;
		}
		return status;
	}
	
	/*<----------------------------boolean value for error message-------------------------------------->*/
	
	public boolean companyfieldmsg() {
		
		try {
			status=companyfielderrormsg.isDisplayed();
			
		}
		catch(NoSuchElementException Exception) {
			status=false;
		}
		return status;
	}

	public boolean mobnumfieldmsg() {
		
		try {
			status=mobilenumberfielderrormsg.isDisplayed();
			
		}
		catch(NoSuchElementException Exception) {
			status=false;
		}
		return status;
	}
	
	
	public boolean emailfieldmsg() {
		
		try {
			status=emailidfielderrormsg.isDisplayed();
			
		}
		catch(NoSuchElementException Exception) {
			status=false;
		}
		return status;
	}
	
	public boolean loandrpdwnmsg() {
		
		try {
			status=loandropdownerrormsg.isDisplayed();
			
		}
		catch(NoSuchElementException Exception) {
			status=false;
		}
		return status;
	}


	
	
	
	

}
