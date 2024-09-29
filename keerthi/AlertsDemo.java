package com.keerthi;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		Thread.sleep(2000);
	//	simple alert
//		driver.findElement(By.id("alertBox")).click();
//		
//		Alert simplealert = driver.switchTo().alert();
//		System.out.println(simplealert.getText());
//		Thread.sleep(2000);
//		simplealert.accept();
//		Thread.sleep(2000);
//		driver.quit();
		
//		confirm alert
//driver.findElement(By.id("confirmBox")).click();
//		
//		Alert confirmalert = driver.switchTo().alert();
//		System.out.println(confirmalert.getText());
//		Thread.sleep(2000);
//		confirmalert.dismiss();
//		Thread.sleep(2000);
//		System.out.println(driver.findElement(By.id("output")).getText());
//		driver.quit(); 
		
// Prompt Alert
driver.findElement(By.id("promptBox")).click();

		
		Alert promptalert = driver.switchTo().alert();
		System.out.println(promptalert.getText());
		Thread.sleep(3000);
		promptalert.sendKeys("keerthi");
		promptalert.accept();
		
		System.out.println(driver.findElement(By.id("output")).getText());
		driver.quit();

	}

}
