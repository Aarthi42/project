package org.face;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class launch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh\\eclipse-workspace\\Day3\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement selDetail=driver.findElement(By.xpath("(//a[text()='COURSES']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(selDetail).perform();
		Thread.sleep(2000);
		WebElement selTest=driver.findElement(By.xpath("//span[text()='Software Testing Training ']"));
		acc.moveToElement(selTest).perform();
	}
}
