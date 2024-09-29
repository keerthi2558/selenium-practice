package com.keerthi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunctionality {

	public static void main(String[] args) throws Exception {
//		provide Web URL
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
//		Provide username
		WebElement username = driver.findElement(By.id("login_field"));
		username.isDisplayed();
		username.isEnabled();
		username.sendKeys("gopalmushini");
		Thread.sleep(3000);
//		Provide password
		WebElement password = driver.findElement(By.id("password"));
		password.isDisplayed();
		password.isEnabled();
		password.sendKeys("3TXgtbSS3**");
		Thread.sleep(3000);
//		Click on the login button
		WebElement login = driver.findElement(By.name("commit"));
		login.isDisplayed();
		login.isEnabled();
		login.click();
	

	}

}
