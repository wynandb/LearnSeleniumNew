package SeleniumInt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Invoke Chrome browser
		//REMINDER TO IMPORT THE BROWSER DRIVER BY HOVER ON THE DRIVER
		//System.setProperty("webdriver.chrome.driver", "/Users/Wynand Bouwer/Documents/chromedriver-win64/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		
		//Firefox Launch
		//REMINDER TO IMPORT THE BROWSER DRIVER BY HOVER ON THE DRIVER
		//System.setProperty("webdriver.gecko.driver", "/Users/Wynand Bouwer/Documents/geckodriver-v0.35.0-win64/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//Microsoft Edge Launch
		//REMINDER TO IMPORT THE BROWSER DRIVER BY HOVER ON THE DRIVER
		System.setProperty("webdriver.edge.driver", "/Users/Wynand Bouwer/Documents/edgedriver_win64/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		
		//Navigate to specified website
		driver.get("https://www.evetech.co.za");
		//Get title of the web page
		System.out.println(driver.getTitle());
		//Get current URL of web page
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
	}

}
