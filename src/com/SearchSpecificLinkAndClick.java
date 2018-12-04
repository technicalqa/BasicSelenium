package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SearchSpecificLinkAndClick {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:/Automation/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.in");
		System.out.println("Total number of tags in 2nd footer section");
		WebElement secondColumn=driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		int tags=secondColumn.findElements(By.tagName("a")).size();
		System.out.println(tags);
		
		System.out.println("Tags in 2nd footer section");
		for(int i=0;i<tags;i++){
			if(secondColumn.findElements(By.tagName("a")).get(i).getText().contains("Affiliates")){
				secondColumn.findElements(By.tagName("a")).get(i).click();
				break;
				
			}
			
			
		}
		System.out.println(driver.getTitle());
		driver.close();

	}

}
