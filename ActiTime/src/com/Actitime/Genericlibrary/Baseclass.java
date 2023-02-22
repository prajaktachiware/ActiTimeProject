package com.Actitime.Genericlibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Baseclass {
	FileLib f= new FileLib();
	public static WebDriver driver;
@BeforeSuite
public void databaseconnection() {            // non static method 
	Reporter.log("database connected",true);
	
}
@AfterSuite
public void databasedisconnection() {
	Reporter.log("database disconnected",true);
	
}
@BeforeClass
public void launchbrowser() throws IOException {
	 driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String Url = f.readDataFromProprtFile("url");
	driver.get(Url);
	Reporter.log("Launch the browser",true);
}
@AfterClass
public void closebrower() {
	driver.close();
	Reporter.log("Close the browser",true);
}
@BeforeMethod
public void loginToApplication() throws IOException {
	String UN = f.readDataFromProprtFile("username");
	String PWD = f.readDataFromProprtFile("password");
	driver.findElement(By.id("username")).sendKeys(UN);
	driver.findElement(By.name("pwd")).sendKeys(PWD);
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	Reporter.log("login tO actiTime",true);
}
@AfterMethod
public void logoutFromApllication() {
	driver.findElement(By.xpath("//a[.='Logout']")).click();
	//driver.findElement(By.id("logoutLink")).click();
	Reporter.log("logOut from ActiTime" ,true);
	
}
}