package com.icehrm_automation.utility;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class LoginTest extends BaseClass {
	String firstName = "Cyber";
	String lastName = "Success";
	String empId = "001";
	String Nationality ="Indian";
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("this is launch browser method from @BeforeMethod");
		launchBrowser("chrome");
		driver.navigate().to("https://cybersuccess.icehrm.com/");
		
        enterText (By.id("username"),"admin");
        enterText(By.id("password"),"2zuzfakn");
        click(By.xpath("//button[contains(text(),'Log in')]"));
        click(By.xpath("//span[text()='Employees']"));
        click(By.xpath("//ul[@id='admin_Employees']/li[1]/a"));
        
        
	}
	@Test
	public void addEmp() {
		System.out.println("This is createEmp method from @Test");
		click(By.xpath("//div[@id='EmployeeTable']/descendant::span[contains(text(),'Add New')]"));
		
				enterText(By.xpath("//input[@id='employee_id']"),empId);
				enterText(By.xpath("//input[@id='first_name']"),firstName);
				enterText(By.xpath("//input[@id='last_name']"),lastName);
				enterText(By.xpath("//div[@class='ant-select-selector'][1]"),Nationality);
				
				driver.findElement(By.id("Indian")).click();
	}
	
	@Test
	public void verifyEmp()
	{
		System.out.println("This is verifyEmp method from @Test");
		
	}
	@AfterMethod
	public void tearDown()
	{
		System.out.println("This is tearDown method from @AfterMethod");
	}
	
	
	}