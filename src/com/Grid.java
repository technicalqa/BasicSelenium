package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grid {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/Automation/chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/19372/psz-vs-lhq-14th-match-pakistan-super-league-2018/");
		int runs=0;
		WebElement table =driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowsnumber =table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		for(int i=0;i<rowsnumber-2;i++){
			String runByPlayers=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int totalRunByPlayer=Integer.parseInt(runByPlayers);
			runs=runs+totalRunByPlayer;
		}
		 String extra =table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		//String extra =table.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(2)")).getText();
		 int extrarun=Integer.parseInt(extra);
		 runs=runs+extrarun;
		 
		System.out.println(runs);
		String actualTotal =table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int actualTotalRuns=Integer.parseInt(actualTotal);
		if (actualTotalRuns==runs){
			System.out.println("Match Fond");
		}
		else{
			System.out.println("Match Not Fond::Test Failed");
		}
		driver.close();

	}

}
