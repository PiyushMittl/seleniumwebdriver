package com.piyush.poc.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new SafariDriver();
		JavascriptExecutor jse = (JavascriptExecutor) driver;

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

		while (true) {

			// click on Redmi Note 5 Pro
			Thread.currentThread().sleep(2000);
			driver.get("http://buy.mi.com/in/buy/product/redmi-note-5-pro");

			System.out.println(driver.getCurrentUrl());
			
			if (!driver.getCurrentUrl().equals("http://promo.mi.com/webfile/globalweb/in/404.html")) {

				jse.executeScript("window.scrollBy(0,150)", "");
				Thread.currentThread().sleep(2000);
				driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/input")).sendKeys("1220001");

				driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/a")).click();

				for (int i = 0; true; i++) {
					System.out.println();

					jse.executeScript("window.scrollBy(250,250)", "");

					driver.findElement(By.xpath("//*[@id=\"J_proStep\"]/div[2]/div[1]/ul/li[1]")).click();
					String text = driver.findElement(By.xpath("//*[@id=\"J_nextBtn\"]")).getText();

					System.out.println(text);

					if (text.equalsIgnoreCase("buy now")) {

						jse.executeScript("window.scrollBy(250,250)", "");

						Thread.currentThread().sleep(2000);
						driver.findElement(By.xpath("//*[@id=\"J_nextBtn\"]")).click();

						Thread.currentThread().sleep(2000);
						driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/a")).click();

						jse.executeScript("window.scrollBy(250,250)", "");
						Thread.currentThread().sleep(2000);
						driver.findElement(By.xpath("//*[@id=\"mi_checkout\"]")).click();

						break;
					}
				}
			}
		}
	}
}
