package Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub//

		// HANDLING ALERT ON PAGE

		String text = "Wynand";
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// Mazimize current window
		driver.manage().window().maximize();
		// Id tag used for locator
		driver.findElement(By.id("name")).sendKeys(text);
		// CSS used as locator for text box
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys(text);
		// CSS locator
		// driver.findElement(By.cssSelector("input[value*='Alert']")).click();
		// ID locator
		driver.findElement(By.id("alertbtn")).click();
		// GET TEXT FROM ALERT
		System.out.println(driver.switchTo().alert().getText());
		// DRIVER WILL NOW SWITH TO ALERT , AND WILL BE ABLE TO HANDLE ALERT
		driver.switchTo().alert().accept();
		driver.findElement(By.cssSelector("input[id='confirmbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

	}

}
