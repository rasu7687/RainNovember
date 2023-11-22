package org.gff;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class JavaScriptExe {

	public static void main(String[] args) throws IOException {
		
		System.out.println("hello world");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GP Ramu\\eclipse-workspace\\PrioriTization\\foler\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		/*driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 1000)");*/
		
		
		
		/*driver.get("https://www.geeksforgeeks.org/"); 
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0, document.body.scrollHeight)");*/
		
		
		/*driver.navigate().to("http://demo.guru99.com/test/guru99home/scrolling.html");
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		WebElement Element = driver.findElement(By.linkText("VBScript"));
		js2.executeScript("arguments[0].scrollIntoView();", Element);
*/
		/*driver.get("http://www.gmail.com");
		Boolean Display = driver.findElement(By.xpath("//input[@name='identifier']")).isDisplayed();
		System.out.println("Element displayed is :"+Display);
		Boolean Enable = driver.findElement(By.xpath("//*[text()='Next']")).isEnabled();
		System.out.println("Element enabled is :"+Enable);
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("iamrajesh7687@gmail.com");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		*/
		/*
		 driver.get("https://www.amazon.in//");
		 driver.manage().window().maximize();
		String currentHandle= driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@placeholder='Search Amazon.in']")).sendKeys("Headphones", Keys.ENTER);
		driver.findElement(By.xpath("//img[contains(@alt,'boAt BassHeads 100 in-Ear Wired Headphones with Mic (Black)')]")).click();
		Set<String> handles=driver.getWindowHandles();
		for(String actual: handles) {
			if(!actual.equalsIgnoreCase(currentHandle)) {
				driver.switchTo().window(actual);
			*/
	
	/*	driver.get("https://www.oreilly.com/library/view/selenium-webdriver-3/9781788999762/78e449ca-0371-421c-bd5e-a50d144e172e.xhtml#:~:text=This%20is%20used%20to%20get,be%20(0%2C%200).");
		driver.manage().window().maximize();
		WebElement getPosition = driver.findElement(By.xpath("//input[@value='Search']"));
		Point xypoint = getPosition.getLocation();
		int xValue=xypoint.getX();
		int yValue=xypoint.getY();
		System.out.println("X value is:"+ xValue+" and Y value is: "+ yValue);
		
		WebElement colorButton = driver.findElement(By.xpath("//input[@value='Search']"));
		String bgcolor = colorButton.getCssValue("background-color");
		System.out.println("button color is :"+ bgcolor ); 
		
			
		WebElement sizeButton = driver.findElement(By.xpath("//input[@value='Search']"));
		int height = sizeButton.getSize().getHeight();
		int width = sizeButton.getSize().getWidth();
		System.out.println("height is: "+ height + " width is: "+ width);
		*/
		/*driver.get("https://www.oreilly.com/library/view/selenium-webdriver-3/9781788999762/78e449ca-0371-421c-bd5e-a50d144e172e.xhtml#:~:text=This%20is%20used%20to%20get,be%20(0%2C%200).");
		driver.manage().window().maximize();
		
		String attribute = driver.findElement(By.xpath("//input[@value='Sign In']")).getAttribute("value");
		System.out.println(attribute);*/
	
		/*driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions action = new Actions(driver); 
		action.contextClick().build().perform();	
	*//*
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));
		WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));
		Actions act=new Actions(driver);
		act.dragAndDrop(From, To).build().perform();
*/
		/*driver.manage().window().maximize();
		driver.get("https://www.testim.io/");
	    File firstSrc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    File dest = new File("./snaps/raghu.png");
	    FileHandler.copy(firstSrc, dest);
	    driver.quit();
*/
		/*driver.manage().window().maximize();
		driver.navigate().to("https://www.geeksforgeeks.org/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.quit();*/
		
		/*
		driver.get("https://letcode.in/table");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.id("simpletable"));
		List<WebElement> headers = table.findElements(By.tagName("th")); 	
	for (WebElement header : headers) {
		String text = header.getText();
		System.out.println(text);
	}

	
	*/
	
	/*	driver.get("https://letcode.in//frame");
		WebElement myFrame = driver.findElement(By.xpath("//iframe[@src='frameUI']"));
		driver.switchTo().frame(myFrame);
		driver.findElement(By.name("fname")).sendKeys("Rajesh");
		driver.findElement(By.name("Iname")).sendKeys("R");
	driver.switchTo().frame(0);
	driver.findElement(By.name("email")).sendKeys("Rajesh1223");
	driver.switchTo().parentFrame();
	driver.findElement(By.name("Iname")).sendKeys("Sugan");
	driver.switchTo().parentFrame();
	driver.findElement(By.xpath("//button[text(),'Refer the video']")).sendKeys("123");
	*/
		/*Robot robot = new Robot();
		driver.get("https://www.amazon.in//");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 Rectangle size = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());

		 BufferedImage image = robot.createScreenCapture(new Rectangle(size));

		 File dest = new File("./snaps/robotscreenshot.png");
		 ImageIO.write(image,"JPG", dest);
		 System.out.println("Screenshot captured and saved successfully");
		 driver.quit();
*/
		/* driver.get("https://letcode.in/table");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.id("simpletable"));
		List<WebElement> headers = table.findElements(By.tagName("th")); 	
	for (WebElement header : headers) {
		String text = header.getText();
		System.out.println(text);

	}*/
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		File firstSrc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    File dest = new File("./snaps/rajesh.png");
	    FileHandler.copy(firstSrc, dest);
	    driver.quit();
			
	}


			
	}


