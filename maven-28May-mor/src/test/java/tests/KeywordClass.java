package tests;

//import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeywordClass {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method");
	}
	
	@Test(priority=2,invocationCount=3)
	public void testA() {
		System.out.println("TestA");
	}
	
	@Test(priority=4)
	public void testB() {
		System.out.println("TestB");
	}
	
	@Test(enabled=false)
	public void testC() {
		System.out.println("TestC");
		Assert.fail();
		
	}
	
	@Test(priority=1)
	public void testD() {
		System.out.println("TestD");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println(" After Method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After class");
	}
	

}
