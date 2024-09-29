package com.keerthi;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureSreenshot {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/keerthi2558");
		
		File sourcefile = driver.getScreenshotAs(OutputType.FILE);
		File destfile = new File("./screenshot.img.jpg");
		
	

	}

}
