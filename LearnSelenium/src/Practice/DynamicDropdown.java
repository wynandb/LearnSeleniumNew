package Practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
//
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		// Implicit wait , this wait will wait for all web elements ****
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Select from and to destination
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();// Index used
		// for 2nd dropdown chenai to be found
		// If not allowed to use index , parent child xpath can be used.
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();// Parent child xpath
		// Select departure date

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

	}

}
