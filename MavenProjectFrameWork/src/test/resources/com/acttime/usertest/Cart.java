package com.acttime.usertest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Cart {
	
	@Test(dataProvider="getData")
	public void addToCart(String pCat, String pNAme){
		System.out.println("Prouct cat=>"+pCat +", product Name =>"+pNAme);
	}
	@DataProvider
	public Object[][] getData(){
		Object[][] objArr = new Object[4][2];
		
		objArr[0][0] = "apple";
		objArr[0][1] = "iphone6";
	
		objArr[1][0] = "apple";
		objArr[1][1] = "iphone7";	
		
		objArr[2][0] = "samsung";
		objArr[2][1] = "s6";
		
		objArr[3][0] = "samsung";
		objArr[3][1] = "s7";

return objArr;
	}

}
