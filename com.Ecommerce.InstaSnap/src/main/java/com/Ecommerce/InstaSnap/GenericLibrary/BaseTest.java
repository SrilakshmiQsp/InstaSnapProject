package com.Ecommerce.InstaSnap.GenericLibrary;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    @BeforeClass
    public void browsersetup() {
    	Reporter.log("browser launched Successfully",true);
    	
    }
    @BeforeMethod
    	public void login() {
    		Reporter.log("login sucessfully",true);
    	}
    
    @AfterClass
    public void terminatesrowser() {
    	Reporter.log("browser closed Sucessfully",true);
    	
    }
    @AfterMethod
    public void logout() {
    	Reporter.log("logout sucessfully");
    }
   
    	
    
}
