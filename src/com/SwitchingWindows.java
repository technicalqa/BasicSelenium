package com;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SwitchingWindows {
	
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver =new FirefoxDriver();
		driver.get("https://accounts.google.com/SignUp");
		//driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();
		System.out.println(driver.getTitle());
		Set<String>ids=driver.getWindowHandles();
		java.util.Iterator<String> it=ids.iterator();
		String parentid =it.next();
		String childid =it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
