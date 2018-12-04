package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ComparingTitles {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:/Automation/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.in");
		//System.out.println("Total number of tags in 2nd footer section");
		WebElement secondColumn=driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		int tags=secondColumn.findElements(By.tagName("a")).size();
		System.out.println(tags);
		String BeforeClicking = null;
		String AfterClicking = null;
		
		for(int i=0;i<tags;i++){
			System.out.println(i);
			if(secondColumn.findElements(By.tagName("a")).get(i).getText().contains("Affiliates")){
				BeforeClicking=driver.getTitle();
				secondColumn.findElements(By.tagName("a")).get(i).click();
				AfterClicking=driver.getTitle(); 
				System.out.println(BeforeClicking);
				break;
				
			}
			
			
		}
		if (BeforeClicking!=AfterClicking){
			boolean displaytext=driver.findElement(By.xpath("html/body/div[5]/aside/div[1]/h3")).isDisplayed();
			if(displaytext==true){
				if(driver.getPageSource().contains("How does the Affiliate Program Work?")){
					System.out.println("Pass");
				}
				
			}
		}
		else
			System.out.println("Fail");
		driver.close();

	}

}