package org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticingSelenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\loges\\eclipse-workspace\\Intro\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.findElement(By.id(null));

	}

}
