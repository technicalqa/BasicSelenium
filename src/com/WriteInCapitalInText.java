package com;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class WriteInCapitalInText {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver" , "D:/Automation/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Actions a = new Actions (driver);
		
		//a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("charger").build().perform();
		
		WebElement move =driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(move).click().keyDown(Keys.SHIFT).sendKeys("charger").build().perform();
		
		//double Click
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("name").doubleClick().build().perform();
		
		Thread.sleep(2000);
		driver.close();
		
	}

}

