package com.keerthi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HTMLDropDowns {

	public static void main(String[] args) throws Exception {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
//		Thread.sleep(3000);
//		driver.manage().window().maximize();
//		WebElement courseElement = driver.findElement(By.id("course"));
//		Select dropDown = new Select(courseElement);
//		List<WebElement> courseElementoptions = dropDown.getOptions();
//		for(WebElement options: courseElementoptions) {
//			System.out.println(options.getText());
//		}
//		dropDown.selectByIndex(2);  //dot net 
//		Thread.sleep(3000);
//		dropDown.selectByValue("python"); //python will select 
//		Thread.sleep(3000);
//		dropDown.selectByVisibleText("Javascript"); //javascript
//		Thread.sleep(3000);
//		String selectedoption = dropDown.getFirstSelectedOption().getText();
//		System.out.println("selected visible text:"+ selectedoption);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement ideElement = driver.findElement(By.id("ide"));
		Select idedropDown = new Select(ideElement);
		List<WebElement> ideElementoptions = idedropDown.getOptions();
		for(WebElement options: ideElementoptions) {
			System.out.println(options.getText());
		}
		idedropDown .selectByIndex(1);  //IntelliJ Idea
		Thread.sleep(3000);
		idedropDown .selectByValue("vs"); //visual studio
		Thread.sleep(3000);
		idedropDown .selectByVisibleText("Eclipse"); //Eclipse
		Thread.sleep(3000);
		idedropDown.deselectByValue("ij");
//		idedropDown.deselectAll();
		List<WebElement> options = idedropDown.getAllSelectedOptions();
		for (WebElement allselectedoptions : options) {
			System.out.println("Selected visible texts:"+ allselectedoptions.getText());
			
		}


	}

}
