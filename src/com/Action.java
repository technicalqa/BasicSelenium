package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Action {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "D:/Automation/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		//moves to specific element
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
	
		/*WebElement move = driver.findElement(By.id("nav-link-accountList"));
		a.moveToElement(move).build().perform();*/
		
		//build=build all the elements
		//perform=execute the performance
		Thread.sleep(5000);
		driver.close();

	}

}
