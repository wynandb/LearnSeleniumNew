package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EndToEnd {

	public static void main(String[] args) throws InterruptedException {
//
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// Mazimize current window
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();// Parent child xpath
		// Check if the 2nd calendar is enabled

		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		// Select round trip
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		// Check if the 2nd calendar is enabled
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("2nd Calendar Enabled");
			Assert.assertTrue(true);
		} else {

			Assert.assertTrue(false);
		}
		// Select senior citizen
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		// Select passenger drop down
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);

		// For loop to add 4 adults to the total of 5 adults

		for (int i = 1; i < 5; i++)

		{
			driver.findElement(By.id("hrefIncAdt")).click();// 4 clicks
		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		// Click Search

		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}
}
