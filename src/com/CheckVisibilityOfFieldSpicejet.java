package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CheckVisibilityOfFieldSpicejet {
	public static void main(String [] args) throws InterruptedException{
		
		//System.setProperty("webdriver.chrome.driver" , "D:/Automation/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://spicejet.com/");
		//Thread.sleep(1000);
		System.out.println("Before clicking on MUlitcity radio button(it is visible)");
		System.out.println(driver.findElement(By.id("flightSearchContainer")).isDisplayed());
		System.out.println("Before clicking on MUlitcity radio button(it should not be visible)");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_2")).click();
		driver.findElement(By.id("MultiCityModelAlert")).click();
		System.out.println(driver.findElement(By.id("flightSearchContainer")).isDisplayed());
		driver.quit();
	}

}
