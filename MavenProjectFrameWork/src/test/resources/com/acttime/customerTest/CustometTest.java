package com.acttime.customerTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.acttime.objectrepositoryLib.CreateNewCustomer;
import com.acttime.objectrepositoryLib.Home;
import com.acttime.objectrepositoryLib.TAskList;
import com.acttimetime.genericlib.BaseClass;

@Listeners(com.acttimetime.genericlib.ListenerImpClass.class)

public class CustometTest extends BaseClass{
		
		@Test
		public void createCustomerTest() throws Throwable{
			//read the test Data from Excel
			String customerName = fLib.getExcelData("Sheet1", 1, 2);
			//step2 : navigate to Task Page
			Home hp = PageFactory.initElements(driver, Home.class);
			hp.clickOnTask();
			//step3 : navigate To CreateNewCustomer Page
			TAskList tl = PageFactory.initElements(driver, TAskList.class);
			tl.navigateToCreateNewCustomerPage();
			//step 4 : create Customer
			CreateNewCustomer cnc = PageFactory.initElements
					                  (driver, CreateNewCustomer.class);
			cnc.createCustomer(customerName);
			
		}
		
		@Test
		public void createCustomerWithDescTest() throws Throwable{
			//read the test Data from Excel
			String customerName = fLib.getExcelData("Sheet1", 2, 2);
			String customerNameDesc = fLib.getExcelData("Sheet1", 2, 3);
			//step2 : navigate to Task Page
			Home hp = PageFactory.initElements(driver, Home.class);
			hp.clickOnTask();
			//step3 : navigate To CreateNewCustomer Page
			TAskList tl = PageFactory.initElements(driver, TAskList.class);
			tl.navigateToCreateNewCustomerPage();
			//step 4 : create Customer
			CreateNewCustomer cnc = PageFactory.initElements(driver, 
					                             CreateNewCustomer.class);
			cnc.createCustomer(customerName, customerNameDesc);
		}
    
}
