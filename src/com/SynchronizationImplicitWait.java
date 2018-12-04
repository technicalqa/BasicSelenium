package com;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SynchronizationImplicitWait {
	public static void main(String [] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver" , "D:/Automation/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Waits for all the page to load till 5 sec if loads before 5 sec
		//then it execute.
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.trivago.in/");
		driver.findElement(By.id("horus-querytext")).click();
		driver.findElement(By.id("horus-querytext")).sendKeys("Mumbai");
		driver.findElement(By.xpath(".//button[@class='btn btn--primary horus-btn-search']")).click();
		driver.findElement(By.xpath(".//h3[@title='Residency Sarovar Portico']")).click(); 
		driver.close();
		
	}

}
