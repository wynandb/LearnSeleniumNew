package Practice;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.By;
public class FluentWait {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub//
		
		//System.setProperty("webdriver.chrome.driver", "/Users/Wynand Bouwer/Documents/chromedriver-win64/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		//driver.findElement(By.cssSelector("[id=start] button"));
		//Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
			//	.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		
		//WebElement foo = wait.until(new Function<WebDriver , WebElement>(){
			
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.cssSelector("[id='finish'] h4"));
				}
		//	});
	//	System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed());
	}
		
//}		
	


