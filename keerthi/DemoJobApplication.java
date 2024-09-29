package com.keerthi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class DemoJobApplication {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jobs.lever.co/shopback-2/5f75daf8-184a-40f9-811e-ca408e793b62/apply?lever-source=LinkedIn");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.name("opportunityLocationId"));
		Select dropdownoption = new Select(dropdown);
		
		dropdownoption.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='resume-upload-input']")).sendKeys("C:\\Users\\PRIYANKA\\Downloads\\GopalResume2.pdf");
		Thread.sleep(2000);
		
		WebElement fullname = driver.findElement(By.name("name"));
		
		fullname.sendKeys("Gopala swamy Mushini");
		
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.name("email"));
		
		email.sendKeys("swamymushini2@gmail.com");
		
		Thread.sleep(2000);
		WebElement number = driver.findElement(By.name("phone"));
		String phonenumber = "9110760301";
		number.sendKeys(phonenumber);
		
		Thread.sleep(2000);
//		WebElement location = driver.findElement(By.id("location-input"));
//		
//		location.sendKeys("Amalapuram");
//		
//		Thread.sleep(6000);
		WebElement Currentcompany = driver.findElement(By.name("org"));
		Currentcompany.sendKeys("Rocket Software");
		
		Thread.sleep(2000);
		WebElement linkedinlink = driver.findElement(By.name("urls[LinkedIn]"));
		linkedinlink.sendKeys("https://www.linkedin.com/in/gopal-swamy-mushini-a6b02b119/");
		
		Thread.sleep(2000);
		WebElement githubURl = driver.findElement(By.name("urls[Github / Portfolio]"));
		githubURl.sendKeys("https://github.com/swamymushini?tab=repositories");
		
		Thread.sleep(2000);
//		WebElement websitelink = driver.findElement(By.name("urls[Portfolio]"));
//		websitelink.sendKeys("https://gopalaswamy.me/");
//		
//		Thread.sleep(2000);
		driver.findElement(By.name("cards[2377ebc0-98c8-41cd-ba35-cb7a8056028a][field0]")).click();
		Thread.sleep(2000);
		WebElement additionalInfo = driver.findElement(By.id("additional-information"));
	
		additionalInfo.sendKeys("I am a skilled Software Engineer with over 5 years of experience in Java, Spring boot, Apache Kafka, React JS, Node.js, SQL, NoSQL, and AWS. My achievements include the development of automated customer billing processes, integrating with e-commerce platforms, and implementing JWT-based login flows. I also led the development of fintech products, implementing microservices architecture and critical banking functionalities. With a strong focus on delivering scalable solutions and ensuring seamless cloud deployment, I am eager to bring my expertise to your team and contribute to driving technological innovation");
		Thread.sleep(2000);
		driver.quit();
		

	}

}
