package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class JavaAlertPopUp {
	
	public static void main(String []args)throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.get ("http://www.tizag.com/javascriptT/javascriptalert.php");
		
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		Thread.sleep(500);
		//Alert alert = driver.switchTo().alert();//Alert is of alert type.
		System.out.println(driver.switchTo().alert().getText()); //get text of alert pop up
		//driver.switchTo().alert().sendKeys("qwewqe"); // insert into popup text field
		driver.switchTo().alert().accept(); //Accept= positive(OK,done,yes)
		//driver.switchTo().alert().dismiss(); //dismiss= Negative(close,cancel,yes)
		Thread.sleep(500);
		driver.quit();
	}

}
