package org.gff;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GP Ramu\\eclipse-workspace\\PrioriTization\\foler\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login");
	WebElement userName = driver.findElement(By.name("login"));
	userName.sendKeys("rasu7687");
	WebElement passWord = driver.findElement(By.name("password"));
	passWord.sendKeys("Reverse@7687");
	WebElement loginButton = driver.findElement(By.name("commit"));
	loginButton.click();
	}
}
