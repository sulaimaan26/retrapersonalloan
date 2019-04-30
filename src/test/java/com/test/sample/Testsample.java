package com.test.sample;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.retra.base.TestBase;

public class Testsample extends TestBase {
	Testsample(){
		super();
	}
	
	@BeforeTest
	public void test001() {
		intialization();
	}
	
	
	@Test
	public void test2() {
		System.out.println(driver.getTitle());
	}
	@AfterTest
	public void teardown() {
		driver.close();
	}
	
}
