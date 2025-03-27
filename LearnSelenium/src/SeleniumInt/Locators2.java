package SeleniumInt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
String name = "rahul";
		//Invoke Chrome browser
				//REMINDER TO IMPORT THE BROWSER DRIVER BY HOVER ON THE DRIVER
				//System.setProperty("webdriver.chrome.driver", "/Users/Wynand Bouwer/Documents/chromedriver-win64/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				// Implicit wait , this wait will wait for all web elements ****
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.get("https://rahulshettyacademy.com/locatorspractice/");
				// CALL GET PASSOWRD METHOD BELOW WHERE PASSWORD WAS EXTRACTED FROM PAGE TO SOTE IN VAR IN CORE TEST
				// CHANGE THE METHOD TO STATIC BY ADDING THE OBJECT (driver)
				String password = getPassword(driver);
				//Mazimize current window
				driver.manage().window().maximize();
				driver.findElement(By.id("inputUsername")).sendKeys(name);
				driver.findElement(By.name("inputPassword")).sendKeys(password);
				driver.findElement(By.className("signInBtn")).click();
				Thread.sleep(2000);
				System.out.println(driver.findElement(By.tagName("p")).getText());
				Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
				Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
				driver.findElement(By.xpath("//button[text()='Log Out']")).click();
				driver.close();
	}

// METHOD TO GET THE PASSWORD FROM TEXT ON THE BROWSER	
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
				driver.get("https://rahulshettyacademy.com/locatorspractice/");
				driver.manage().window().maximize();
				driver.findElement(By.linkText("Forgot your password?")).click();
				Thread.sleep(2000);
				String passwordText = driver.findElement(By.cssSelector("form p")).getText();
				// The Split method will create ARRAY and store text in index 0 and index 1 according to where the split is
				// e.g If split on char "'" in sentence = Please use temp password 'rahulshettyacademy' to login
				// TO GET THE PASSWORD = rahulshettyacademy YOU WILL HAVE TO SPLIT 2 TIMES 
				// USING SPLIT METHOD WILL CREATE ARRAY WITH INDEX . SO IF YOU SPLIT 2 TIMES YOU WILL HAVE 2 ARRAYS
				// BELOW 1ST SPLIT ON THE TEXT
				String[] passwordArray = passwordText.split("'");
				// 1ST ARRRAY 
				// [0] index in array 1 will store = Please use temp password
				// [1] index IN ARRAY 1 will store rahulshettyacademy' to login
				// BELOW IS 2ND SPLIT ON ARRAY ON INDEX 1 TO GET ONLY THE PASSWORD AND STORING IN VAR = password
				String password = passwordArray[1].split("'")[0];
				return password;
				
				
				
				
	}
}
