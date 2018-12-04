package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class InvokingBrowser {
	
	public static void main(String args[]){
		
		System.setProperty("webdriver.chrome.driver" , "D:/Automation/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.zycus.com/");//open specific url
		String s1=driver.getTitle();//get Title
		System.out.println(driver.getTitle());//Another way to print title
		//String s2=driver.getPageSource();//get PageSource
		//System.out.println(driver.getPageSource());//Another way to print PageSource
		String s3=driver.getCurrentUrl();//get PageSource
		System.out.println(driver.getCurrentUrl());//Another way to print CurrentUrl
		System.out.println(driver.findElement(By.tagName("a")));
		
		System.out.println("TITLENAME ="+s1 +"SourceNAME =+s2" + "CurrentUrlNAME = " +s3);
		driver.close();
	}

}
