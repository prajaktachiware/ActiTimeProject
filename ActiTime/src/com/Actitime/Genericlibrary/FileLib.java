package com.Actitime.Genericlibrary;
// write one time use it multipal times.
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
 String path="./Testdata/commondata.proprty";
public String readDataFromProprtFile(String key) throws IOException {
	FileInputStream fis= new FileInputStream(path);
	Properties p= new Properties();
	p.load(fis);
	String value =p.getProperty(key);
	return value;
	
}
String path1="/Testdata/Testdata.xlsx";
public String readDataFromProprtFile(String sheetname,int row, int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis= new FileInputStream(path);
	Workbook wb = WorkbookFactory.create(fis);
 String value = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
 return value;
}}

