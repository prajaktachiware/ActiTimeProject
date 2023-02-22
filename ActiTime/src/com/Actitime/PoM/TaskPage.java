package com.Actitime.PoM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
@FindBy(xpath="//div[.='Add New']")
private WebElement Addnewbtn;


@FindBy (xpath="//div[.='+ New Customer']")
private WebElement  newcustname;

@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
private WebElement custname;

@FindBy(xpath="(//textarea[@placeholder='Enter Customer Description'])")
private WebElement custdesp;

@FindBy (xpath="(//div[@class='dropdownButton'])[15]")
private WebElement dropbtn;

@FindBy(xpath="(//div[.='Our company'])[10]")
private WebElement ourcomp;

@FindBy(xpath="//div[.='Create Customer']")
private WebElement crtcustbtn;

public TaskPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getAddnewbtn() {
	return Addnewbtn;
}

public WebElement getNewcustname() {
	return newcustname;
}

public WebElement getCustname() {
	return custname;
}

public WebElement getCustdesp() {
	return custdesp;
}

public WebElement getDropbtn() {
	return dropbtn;
}

public WebElement getOurcomp() {
	return ourcomp;
}

public WebElement getCrtcustbtn() {
	return crtcustbtn;
}

//Business login or generic method
//create non static method.


public void completetask() {
	Addnewbtn.click();
	newcustname.click();
	custname.sendKeys("HDFC");
	custdesp.sendKeys("Banking");
	dropbtn.click();
	crtcustbtn.click();
	
}
}