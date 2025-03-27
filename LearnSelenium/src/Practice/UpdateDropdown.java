package Practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UpdateDropdown {

	public static void main(String[] args) throws InterruptedException {
//
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// Check if check box is selected before it is and after
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		// System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		// Count number of check boxes on the page
		// Find locator common to all check boxes by inspecting the check boxes
		// Note the elements in the find , not element
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 6);
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);

		// While loop created to repeat clicks as a best practice
		// 1st create variable i = 1 : On the page the no of adults already default to 1
		// , so you need to count from 1
		// While condition i smaller then 5 : We need 5 cliks to add 5 adults , so so
		// the while loop should exit on 5
		// The actions for clicks should be in the while loop , and 1++; should be added
		// to the click action of adding adult. To increment the i variable to prevent
		// infinite loop
		// The action to click done should NOT be in the while loop , as it will cause
		// the dropdown to close and element not be accessible anymore to add adults

		// While loop****

		// int i = 1;

		// while (i<5)
		// {
		// driver.findElement(By.id("hrefIncAdt")).click();// 4 clicks
		// i++;
		// }

		// For loop can also work*****

		for (int i = 1; i < 5; i++)

		{
			driver.findElement(By.id("hrefIncAdt")).click();// 4 clicks
		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
