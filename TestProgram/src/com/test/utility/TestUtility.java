package com.test.utility;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;

public class TestUtility {
	
	static Xls_Reader reader;
	public static ArrayList<Object[]> getDataFromExcel() {
		
		  ArrayList<Object[]> mydata = new ArrayList<Object[]>();
		  try {
		  reader = new Xls_Reader("C:\\Users\\sowja\\eclipse-workspace\\TestProgram\\src\\com\\TestData\\Regallogins.xlsx");
		  }catch (Exception e) {
			  e.printStackTrace();
		  }
		  
		  
		  for(int rownum=2; rownum<=reader.getRowCount("Sheet1");rownum++) {
			  
			 String UserName = reader.getCellData("Sheet1", "Username", rownum);	
			 String PassWord = reader.getCellData("Sheet1", "Password", rownum);
			 
			 Object ob[] = {UserName,PassWord};
			 
			 mydata.add(ob);
		  }
		  return mydata;
	}

}
