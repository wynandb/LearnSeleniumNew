package SeleniumInt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserWindowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("websdriver.chrome.driver", "/Users/Wynand Bouwer/Documents/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.navigate().to("https://rahulshettyacademy.com");
		driver.navigate().back();
		
		
		
		
		
		

	}

}
