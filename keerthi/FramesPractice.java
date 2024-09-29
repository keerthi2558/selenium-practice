package com.keerthi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FramesPractice {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.id("name")).sendKeys("text1"); // main web page
		Thread.sleep(3000);
		
		driver.switchTo().frame("frm3");
		driver.findElement(By.id("name")).sendKeys("text1.1");
		Thread.sleep(3000);
		driver.findElement(By.id("firstName")).sendKeys("hari");
		Thread.sleep(2000);
		driver.findElement(By.id("lastName")).sendKeys("keerthi");
		Thread.sleep(2000);
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("englishchbx")).click();

	}

}
