package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass1 {
	
	@BeforeSuite()
	public void beforesuite(){
		System.out.println("Before suite Testclass -1");
	}
	
	@BeforeTest()
	public void beforeTest(){
		System.out.println("Before test  TestClass-1");
	}
	@BeforeClass()
	public void beforeclass(){
		System.out.println("Before Class TestClass-1");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method TestClass-1");
	}
	@Test
	public void testA() {
		System.out.println("Test A ");
	}
	@Test
	public void testB() {
		System.out.println("Test B ");
	}
	
	@Test
	public void testC() {
		System.out.println("Test C ");
	}
	@Test
	public void testD() {
		System.out.println("Test D ");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method TestClass-1");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("After Class TestClass-1");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After Test TestClass-1");
	}
	
	
	@AfterSuite()
	public void aftersuite(){
		System.out.println("After suite TestClass-1");
	}
}