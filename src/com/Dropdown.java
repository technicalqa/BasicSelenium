package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {
	
	public static void main(String args[]) throws InterruptedException{
		
		//System.setProperty("webdriver.chrome.driver" , "D:/Automation/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.spicejet.com/");//open specific url
		Select s = new Select(driver.findElement(By.id ("ctl00_mainContent_ddl_Adult")));//select is  class
		s.selectByValue("3");
		Thread.sleep(1000);
		s.selectByIndex(1);
		Thread.sleep(1000);
		s.selectByVisibleText("4");
		Thread.sleep(1000);
		/*s.deselectAll();
		s.deselectByIndex(index);
		s.deselectByValue(value);
		s.deselectByVisibleText(text);*/ //DESELECTION
		
		driver.close();
	}

}
