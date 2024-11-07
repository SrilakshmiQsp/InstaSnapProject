package com.Ecommerce.InstaSnap.productTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Ecommerce.InstaSnap.GenericLibrary.BaseTest;

public class VerifyElectronicProduct extends BaseTest {
	@Test(priority=1)
	public void createProduct() {
		Reporter.log("Electronic product created",true);
	}
	@Test(priority=2,invocationCount=2,dependsOnMethods="createProduct")
	public void updateproduct() {                                                                 
		Reporter.log("Electonic product updated",true);
	}
}
