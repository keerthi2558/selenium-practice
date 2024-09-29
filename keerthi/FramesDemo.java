package com.keerthi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FramesDemo {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.id("name")).sendKeys("text1"); // main web page
		Thread.sleep(3000);
		
		driver.switchTo().frame("frm1"); // frame1
		Select coursename_dd = new Select(driver.findElement(By.id("course")));
		coursename_dd.selectByIndex(1);
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frm2"); // jump to frame2
		Thread.sleep(3000);
		driver.findElement(By.id("firstName")).sendKeys("keerthi");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frm1"); // jump to frame 1
		Thread.sleep(3000);
		coursename_dd.selectByIndex(3);
		
		driver.switchTo().defaultContent(); 
		driver.switchTo().frame("frm2"); // jump to frame2
		Thread.sleep(3000);
		driver.findElement(By.id("lastName")).sendKeys("hari");
		
		driver.switchTo().defaultContent(); // back to main web page
		driver.findElement(By.id("name")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("text2");
		

	}

}
