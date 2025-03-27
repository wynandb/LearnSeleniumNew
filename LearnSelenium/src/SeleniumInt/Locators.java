package SeleniumInt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Invoke Chrome browser
		// REMINDER TO IMPORT THE BROWSER DRIVER BY HOVER ON THE DRIVER
		// System.setProperty("webdriver.chrome.driver", "/Users/Wynand
		// Bouwer/Documents/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Implicit wait , this wait will wait for all web elements ****
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		// Mazimize current window
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("Wynand");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		// Get the error text on the page via CSS and print to console
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		// Find forgot password via a (link)
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		// FInd the name text box via XPATH and populate it
		driver.findElement(By.xpath("//Input[@placeholder='Name']")).sendKeys("John");
		// Find the email text box via CSS and populate it
		driver.findElement(By.cssSelector("Input[placeholder='Email']")).sendKeys("John@gmail.com");
		// Clear the email via XPATH
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		// Find email textbox via CSS Index : Index not the best method. Rather use
		// specific method above
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("John@mango.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("5678908765");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

	}

}
