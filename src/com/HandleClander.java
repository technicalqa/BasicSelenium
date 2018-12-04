package com;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandleClander {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:/Automation/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("");

	}

}
