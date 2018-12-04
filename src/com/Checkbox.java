package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Checkbox {
	public static void main(String args[]) throws InterruptedException{
		//System.setProperty("webdriver.chrome.driver" , "D:/Automation/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
	    WebDriver driver = new FirefoxDriver();
		driver.get("http://www.spicejet.com/");//open specific url
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).isSelected());
		//Checking element is selected or not
		System.out.println("1");
			if ((driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).isSelected()))
			{
				driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).click();
				//selecting Unaccompanied Minor
				System.out.println("2");
			}
			else
			{
				driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
				//Checking element is selected or not
				System.out.println("3");
			}
		driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).isSelected();
		//Checking element is selected or not
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).isSelected());
		driver.close();


		
	}

}
