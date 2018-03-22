package com.piyush.poc.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainMiNote5Pro {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new SafariDriver();

		// open site
		driver.get("http://www.mi.com/in/index.html");

		// click on Signin
		driver.findElement(By.xpath("//*[@id=\"J_signEntries\"]/ul/li[1]")).click();

		// username
		Thread.currentThread().sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("9358909659");

		// password
		Thread.currentThread().sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("Sweetls2607@");

		// click on login button
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

		// hover to "Redmi Phones" and click
		Thread.currentThread().sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"J_shopCategories\"]/div/dl[2]/dt/a")).click();

		// click on Redmi Note 5 Pro
		Thread.currentThread().sleep(2000);
		driver.get("http://www.mi.com/in/redmi-note-5-pro/");

		// 1st buy now
		Thread.currentThread().sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"J_barMenu\"]/li[4]/a")).click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"J_nextBtn\"]")));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(250,250)", "");
		
		
		Thread.currentThread().sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"J_nextBtn\"]")).click();
		// driver.findElement(By.className("btn-primary")).click();

		//Thread.currentThread().sleep(2000);
		//driver.get("http://buy.mi.com/in/cart/add/4173200001");

		// http://buy.mi.com/in/cart/recommend?phone=redmi-note-5-pro&goodsId=4180500021

		System.out.println("----");
		Thread.currentThread().sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/a")).click();

		Thread.currentThread().sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mi_checkout\"]")).click();

	}

}
