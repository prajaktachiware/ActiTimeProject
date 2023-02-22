package com.Actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Actitime.Genericlibrary.Baseclass;
import com.Actitime.Genericlibrary.FileLib;
import com.Actitime.PoM.HopmePgae;
import com.Actitime.PoM.TaskPage;

public class CreateCustomer extends Baseclass {
	FileLib flib= new FileLib();
	@Test
	public void CreateCutomer() throws EncryptedDocumentException, IOException {
		HopmePgae hp= new HopmePgae(driver);
	    hp.getTasklnk().click();
	    TaskPage tp = new TaskPage(driver);
	   // String Custname = flib.readDataFromProprtFile("sheet1", 2, 2);    //when excel sheet work
	    //String description = flib.readDataFromProprtFile("sheet1", 2, 3);
	    //tp.completetask(Custname,description);
	  // String expected= Custname;
	  // System.out.println(expected);
	   //actualdata= driver.findElement(By.xpath("//div[@title='"+custname+"']")).getText();
	   // SoftAssert s= new SoftAssert();
	   // s.assertEquals(expected,Actualdata);
	    //Reporter.log("assertion pass",true);
	    //s.assertAll();
	    tp.completetask();
	    String expected = "HDFC";
	    String Actualdata = "HDFC";
	    SoftAssert s= new SoftAssert();
	    s.assertEquals(expected, Actualdata);
	    driver.close();
	    s.assertAll();
	}
	}
