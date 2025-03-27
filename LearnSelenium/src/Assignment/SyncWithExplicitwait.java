package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Arrays;
import java.util.List;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SyncWithExplicitwait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		// Use explicit wait
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		//Login Variables
		String username = "rahulshettyacademy";
		String password = "learning";
		
		// Go to website
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		// Maximize current window
		driver.manage().window().maximize();
		
		// DYNAMIC ARRAY LIST TO BE GENERIC
		String[] itemsNeeded = {"iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry"};

		//Login Process
				
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		driver.findElement(By.id("okayBtn")).click();
		driver.findElement(By.cssSelector("option[value='consult']")).click();
		w.until(ExpectedConditions.elementToBeClickable(By.id("terms"))).click();
		driver.findElement(By.id("signInBtn")).click();
		w.until(ExpectedConditions.urlMatches("shop"));
		
		// Now add items to cart
		 
		addItems(driver, itemsNeeded);
		
	}

	// Method add items
	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.card-title"));
		
		int j = 0;
		
		for (int i = 0; i < products.size(); i++) {
			String name = products.get(i).getText().trim();
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
			if (itemsNeededList.contains(name)) 
			{
				j++;
				//Add itemsNeeded
				driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();
				if (j == itemsNeeded.length) 
				// Click checkout
				driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();	
			}
		
		}

	}
}
