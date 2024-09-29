package com.keerthi;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTime {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		driver.manage().window().maximize();
		
		Instant starttime = Instant.now();
		System.out.println(starttime.toString());
		
		driver.get("https://www.hyrtutorials.com/");
		
		Instant Endtime = Instant.now();
		System.out.println(Endtime.toString());
	Duration duration = Duration.between(starttime, Endtime);
	
	System.out.println("page load timeout:"+ duration.toMillis()+"milli seconds");
	System.out.println(driver.getTitle());
	driver.quit();

	}

}
