package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SynchronizationExplicitWait {
	public static void main(String [] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:/Automation/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.trivago.in/");
		driver.findElement(By.id("horus-querytext")).click();
		driver.findElement(By.id("horus-querytext")).sendKeys("Mumbai");
		driver.findElement(By.xpath(".//button[@class='btn btn--primary horus-btn-search']")).click();
		WebDriverWait explict=new WebDriverWait(driver,10);
		explict.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//h3[@title='Residency Sarovar Portico']")));
		driver.findElement(By.xpath(".//h3[@title='Residency Sarovar Portico']")).click(); 
		driver.quit();
		
	}

}
