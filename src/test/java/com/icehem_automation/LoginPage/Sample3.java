package com.icehem_automation.LoginPage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample3 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		@Test
	    public void sample3Test1(){
	        System.out.println("This is test1 from sample3 class");
	    }
	    @Test
	    public void sample3Test2(){
	        System.out.println("This is test2 from sample3 class");
	    }
	    @Test
	    public void sample3Test3(){
	        System.out.println("This is test3 from sample3 class");
	    }
	    @BeforeClass
	    public void beforeClass(){
	        System.out.println("Sample3 Before class");
	    }
	    @AfterClass
	    public void afterClass(){
	        System.out.println("Sample3 After class");
	    }

	    @BeforeMethod
	    public void beforeMethod(){
	        System.out.println("Sample3 Before method");
	    }

	    @AfterMethod
	    public void afterMethod(){
	        System.out.println("Sample3 after method");
	    }
	    {
	   System.out.println("Sonali");
	    }
	}


