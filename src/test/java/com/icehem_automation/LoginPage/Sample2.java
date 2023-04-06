package com.icehem_automation.LoginPage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample2 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		@Test
	    public void sample2Test1(){
	        System.out.println("This is test1 from sample2 class");
	    }
	    @Test
	    public void sample2Test2(){
	        System.out.println("This is test2 from sample2 class");
	    }
	    @Test
	    public void sample2Test3(){
	        System.out.println("This is test3 from sample2 class");
	    }
	    @BeforeClass
	    public void beforeClass(){
	        System.out.println("Sample2 Before class");
	    }
	    @AfterClass
	    public void afterClass(){
	        System.out.println("Sample2 After class");
	    }

	    @BeforeMethod
	    public void beforeMethod(){
	        System.out.println("Sample2 Before method");
	    }

	    @AfterMethod
	    public void afterMethod(){
	        System.out.println("Sample2 after method");
	    }
	
	}


