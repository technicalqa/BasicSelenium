package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DropDownDynamic {
	public static void main(String args[]) throws InterruptedException{
		
		//System.setProperty("webdriver.chrome.driver" , "D:/Automation/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
	    WebDriver driver = new FirefoxDriver();
		driver.get("http://www.spicejet.com/");//open specific url
		
		WebElement dynamicDropDown=driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		dynamicDropDown.click();
		WebElement selectValueFromDynamicDropDown=driver.findElement(By.xpath(".//a[@value='PAT']"));
		selectValueFromDynamicDropDown.click();
		Thread.sleep(1000);
		WebElement selectValueFromDynamicDropDown2=driver.findElement(By.xpath("(.//a[@value='BOM'])[2]"));
		selectValueFromDynamicDropDown2.click();
		Thread.sleep(1000);
		driver.close();
	}

}
