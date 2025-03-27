package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		// Implicit wait , this wait will wait for all web elements ****
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		// Enter name
		driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("John");
		// Enter email
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("John@gmail.com");
		// Enter password
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Palmer");
		// Select check box
		driver.findElement(By.id("exampleCheck1")).click();
		// Select female from drop down
		driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1'] /Option[contains(.,'Female')]")).click();
		// Select student raio button
		driver.findElement(By.xpath("(//input[@value='option1'])")).click();
		// Enter DOB
		driver.findElement(By.xpath("(//input[@name='bday'])")).sendKeys("19880101");
		// Click submit
		driver.findElement(By.xpath("(//input[@value='Submit'])")).click();
		System.out.println(
				driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());

	}

}
