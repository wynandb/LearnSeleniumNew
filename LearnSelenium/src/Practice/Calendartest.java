package Practice;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Calendartest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Variables to use on calendar//
		
		String month = "6";
		String date = "15";
		String year = "2027";
		
		// Open Greencart webpage and click on top deals
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a[href='#/offers']")).click();
		
		//Switch to child window (top deals)
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		//Enter calendar values
		driver.findElement(By.cssSelector("input[name='month']")).sendKeys(month);
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input[name='day']")).sendKeys(date);
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input[name='year']")).sendKeys(year);
		Thread.sleep(500);
		String dateselected = driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).getText();
		driver.findElement(By.cssSelector("input[id='search-field']")).click();
		System.out.println(dateselected);
		
		
	}

}
