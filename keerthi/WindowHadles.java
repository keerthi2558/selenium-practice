package com.keerthi;


import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHadles {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		   //single window
//		String ParentwindowHandle = driver.getWindowHandle();
//		System.out.println("Parent window - "+ParentwindowHandle+driver.getTitle());
//		driver.findElement(By.id("newWindowBtn")).click();
//		
//		Set<String> windowHandles = driver.getWindowHandles();
//		System.out.println("Parent&Child window - "+windowHandles+driver.getTitle());
//		for (String windowhandle : windowHandles) {
//			if(!windowhandle.equals(ParentwindowHandle)) {
//				driver.switchTo().window(windowhandle);
//				driver.manage().window().maximize();
//				driver.findElement(By.id("firstName")).sendKeys("keerthi");
//				Thread.sleep(3000);
//				driver.close();
//				Thread.sleep(3000);
//				
//			}
//			
//		
//
//	}
//		driver.switchTo().window(ParentwindowHandle);
//		driver.findElement(By.id("name")).sendKeys("hari");
//		Thread.sleep(3000);
//		driver.quit();
		
            //single tab
		String ParentwindowHandle = driver.getWindowHandle();
		System.out.println("Parent window - "+ParentwindowHandle+driver.getTitle());
		driver.findElement(By.id("newTabBtn")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("Parent&Child window - "+windowHandles+driver.getTitle());
		for (String windowhandle : windowHandles) {
			if(!windowhandle.equals(ParentwindowHandle)) {
				driver.switchTo().window(windowhandle);
				driver.findElement(By.id("alertBox")).click();
				Alert simplealert = driver.switchTo().alert();
				System.out.println(simplealert.getText());
				Thread.sleep(2000);
				simplealert.accept();
				System.out.println(driver.findElement(By.id("output")).getText());
				driver.close();
			}
			
		

	}
		driver.switchTo().window(ParentwindowHandle);
		driver.findElement(By.id("name")).sendKeys("hari");
		Thread.sleep(3000);
		driver.quit();


}
}
