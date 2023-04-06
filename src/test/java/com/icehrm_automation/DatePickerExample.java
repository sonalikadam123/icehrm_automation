package com.icehrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.LocalDateTime;
import java.util.List;

public class DatePickerExample {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://cybersuccess.icehrm.com/");

WebElement username=driver.findElement(By.id("username"));
username.sendKeys("admin");
WebElement password=driver.findElement(By.id("password"));
password.sendKeys("2zuzfakn");
WebElement loginButton=driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
  loginButton.click();
Thread.sleep(5000);
driver.findElement(By.xpath("//span[text()='Employees']")).click();
driver.findElement(By.xpath("//ul[@id='admin_Employees']/li[1]/a")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//button[@type='button']/span[2]")).click();
int Birthday=2000;
//get the today date
int currentDay= LocalDateTime.now().getDayOfMonth();
/*LocalDateTime.now().getDayOfWeek();
LocalDateTime.now().getMonthValue();*/
Thread.sleep(5000);
//click on calendar
driver.findElement(By.id("birthday")).click();
//get all current month days 
//List<WebElement> days = driver.findElements(By.xpath("//td[@class='ant-picker-cell-in-view')]/div"));
//List<WebElement> days = driver.findElements(By.xpath("//td[@class='ant-picker-cell ant-picker-cell-in-view ant-picker-cell-today']"));
//iterate through each day of month
//todays current date 
//driver.findElement(By.xpath("//td[@class='ant-picker-cell ant-picker-cell-in-view ant-picker-cell-today']")).click();
//specific birthdate 
 driver.findElement(By.xpath("//div[text()='6']")).click();
//for(WebElement element : days) {
	//String day = element.getText();
//	String today = String.valueOf(currentDay);
	//if(days.equals(today)) {
		//element.click();
	//}

	//}
	}
}




