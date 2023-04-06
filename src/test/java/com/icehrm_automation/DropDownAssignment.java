package com.icehrm_automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAssignment {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","msedgedriver.exe");
		// TODO Auto-generated method stub
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("Amazon.com");
        driver.findElement(By.xpath("//div[@class='FPdoLc lj9FBc']//input[1]")).submit();
        driver.findElement(By.xpath("//h3[text()='Amazon.in']")).click();
        
        
        
        Thread.sleep(3000);
        WebElement searchDropDown = driver.findElement(By.name("url"));
        Select select=new Select(searchDropDown);
        select.selectByIndex(14);
        String inputText="HP Laptop";
        
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("inputText");
        driver.findElement(By.id("nav-search-submit-button")).submit();
        String Text=driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']")).getText();
        System.out.println(Text);
        
        String ResultText=Text.substring(Text.indexOf("\"")+1,Text.lastIndexOf("\""));
        System.out.println(ResultText);
        
        if(inputText.equals(ResultText))
        {
        	System.out.println("Result are matching");
        }
        else
        {
        	System.out.println("Result are not matching");
        }
        
        String TotalResult=driver.findElement(By.xpath("//div[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[1]")).getText();
        String Result=TotalResult.substring(0,19);
        System.out.println(Result);
        
        
        		
        

		
	}

}
