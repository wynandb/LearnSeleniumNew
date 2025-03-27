import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

// Base class
public class base {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		// Implicit wait , will wait for the specified time, will continue if element is found earlier , will not wait longer then specified
		//driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		//Explicit wait
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		// Go to website
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		// DYNAMIC ARRAY LIST TO BE GENERIC
		String[] itemsNeeded = { "Cucumber", "Brocolli","Beetroot","Beans"};
		
		//Call below is to call Method addItems
		addItems(driver,itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		//Explicit wait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promocode")));
		driver.findElement(By.cssSelector("input.promocode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//Explicit wait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.promoBtn")));
		//Assertion to check if the coupon was applied
		//Explicit wait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		Assert.assertEquals(driver.findElement(By.cssSelector("span.promoInfo")).getText(), "Code applied ..!");
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
			}
	
	//Method add items
public static void addItems(WebDriver driver,String[] itemsNeeded) 
{
	// CSS will find 30 elements as there are 30 products on the page and the class
	// name for each = product-name,
	// So you need to change up to list of web element and define it as products
	// All 30 product will be stored in the products variable
	List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
	// Use for loop to iterate through all the product names to find the product =
	// Cucumber
	// for loop to iterate and if statement to check for product name
	// i=0 ; if i = smaller then products (ALL THE PRODUCTS ON THE PAGE E.G 30)
	int j = 0;
	for (int i = 0; i < products.size(); i++) {
		// String var = name (LOOKING FOR THE PRODUCT NAME THAT = CUCUMBER IN THE
		// PRODUCTS VAR)
		// Need to split on hyphen , and change the name variable to String Array
		// variable because of the split
		String[] name = products.get(i).getText().split("-");
		// Trim needed to trim the white space on index 0 "Cucumber " to be "Cucumber"
		String formattedName = name[0].trim();

		// Format the name and strip the "1kg"

		// if needed to define what we looking for , looking for cucumber in name
		// variable
		// CHECK IF NAME EXTRACTED IN PRESENT IN ARRAY "itemsNeeded"
		// Convert array into array list for easy search
		List itemsNeededList = Arrays.asList(itemsNeeded);

		// j Variable to to count the number of times code enters the if block to add to
		// cart

		if (itemsNeededList.contains(formattedName)) {

			// j++ to increment j variable if code enters if code block to add to cart
			j++;
			// Click add to cart
			// Here the index will be used when product = Cucumber. This is generic and will
			// work even if the index changes
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			// if statement to break the for loop iteration , no need to iterate more then
			// needed. Code will only enter the if block if the itemsNeeded are found.
			if (j == itemsNeeded.length)
				break;
			
			}
		}
	
	}
}
	

	


	


