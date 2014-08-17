package com.ebay.test.framework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	/**
	 * @author shadedzyman
	 */
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("Do nothing");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		
	}
	
	@AfterMethod
	public void afterMethod(){
		
	}
	
	@AfterClass
	public void afterClass(){
		
	}

}
