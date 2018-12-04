package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindingLinksInaPage {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/Automation/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.in");
		System.out.println("Total number of tags in page");
		int tags=driver.findElements(By.tagName("a")).size();
		System.out.println(tags);
		//or
		System.out.println(driver.findElements(By.tagName("a")).size());
		System.out.println("Total number of tags in Footer of the page");
		WebElement footer=driver.findElement(By.id("glbfooter"));
		int footertag=footer.findElements(By.tagName("a")).size();//Here footer is used instead of driver so it is onl searching in footer.
		System.out.println(footertag);
		driver.close();

	}

}
