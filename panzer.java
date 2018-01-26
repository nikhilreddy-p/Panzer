package com.tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class panzer {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//NIKHIL//Desktop//QA//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.com");
		WebElement ele=driver.findElement(By.id("lst-ib"));
		ele.sendKeys("webdriveriobh");
		ele.sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div/h3/a")).click();
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		Assert.assertEquals("http://webdriver.io/", URL);
		Assert.assertEquals("validated", "http://web4driver.io/",URL);
		
		
	}

}
