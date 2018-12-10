package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CheckVisibilityOfFieldMMT {
	public static void main(String [] args) throws InterruptedException{
		
		//System.setProperty("webdriver.chrome.driver" , "D:/Automation/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(1000);
		System.out.println("Before clicking on MUlitcity radio button(it is visible)");
		System.out.println(driver.findElement(By.id("hp-widget__return")).isDisplayed());
		System.out.println("After clicking on MUlitcity radio button(it should not be visible)");
		driver.findElement(By.xpath(".//*[@id='multicity']/label")).click();
		Thread.sleep(1000);
		
		System.out.println(driver.findElement(By.id("hp-widget__return")).isDisplayed());
		//To check element present or not
		int count =  driver.findElements(By.id("MultiCityModelAlert")).size();
		if (count==0){
			System.out.println("No object present");
		}
		else{
			System.out.println("object is present");
		}
		driver.quit();
	}

}
12312312
