package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CheckboxAdvance {
	public static void main(String args[]) throws InterruptedException{
		//System.setProperty("webdriver.chrome.driver" , "D:/Automation/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
	    WebDriver driver = new FirefoxDriver();
		driver.get("http://www.spicejet.com/");//open specific url
		
		//clicking on all check boxes
		int count = driver.findElements(By.xpath(".//div[@id='discount-checkbox']//input[@type='checkbox']")).size();
		for(int i=0;i<count;i++){
			driver.findElements(By.xpath(".//div[@id='discount-checkbox']//input[@type='checkbox']")).get(i).click();
			Thread.sleep(500);
		}
		
		//Retrieving the name of all check boxes
		int j=0;
		while(j<count){
			String nameCont=driver.findElements(By.xpath(".//div[@id='discount-checkbox']//input[@type='checkbox']")).get(j).getAttribute("name");
			Thread.sleep(500);
			System.out.println("name="+nameCont);
			j++;
		}
		for(int k=0;k<count;k++){
			if ((driver.findElements(By.xpath(".//div[@id='discount-checkbox']//input[@type='checkbox']")).get(k).getAttribute("name")).toString().equals("ctl00$mainContent$chk_IndArm")){
				driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
				System.out.println("entered");
			}
			else{
				System.out.println(k);
				driver.findElements(By.xpath(".//div[@id='discount-checkbox']//input[@type='checkbox']")).get(k).getAttribute("name");
			}
		}
		

		driver.close();


		
	}

}