package Practice;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutoSuggestDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		// Generic CSS selector to find all the elements in the dropdown when typing "ind"
		// Store these 3 options in a variable called options and its a List of WebElements. NOTE the .FindElemets Plural as there are more then 1 element.
		// Because there are 3 options in the drop down write a for loop with If statement to find the option you are looking for.
		List<WebElement> options = driver.findElements(By.cssSelector("li[class=''ui-menu-item]"));
		
		// Here you specify to pick 1 option from options . 
		//The Option = WebElement , hence WebElement in form of option
		for(WebElement option :options)
		{
			// option.getText to get the value from the variable and so Identifying what you are looking for. 
			// equalsIgnoreCase just to ignore upper case
			if (option.getText().equalsIgnoreCase("India"));
			{
				// When match is found , it must click 
				option.click();
				break;// Will stop further iterations to look for the desired value
			}
		}
	}

}
