import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub//
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		String[] itemsNeeded = { "Beetroot" };
		// Iterate through the products variable
		int j = 0;
		for (int i = 0; i < products.size(); i++) { // Store product names in name variable
			String[] name = products.get(i).getText().split("-");
			// 0 index = "Beetroot " 1st index = 1kg
			// Trim the white space
			String formattedName = name[0].trim();
			// if statement to look for "Beetroot"
			// j variable to store count of code entering if block to add to cart
			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName)) { // Click add to cart when finding "Beetroot"
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemsNeeded.length) // "Beetroot index = 3 on page" So when it finds "Beetroot" it will break out of
							// for loop
					break;
			}

		}
	}
}