package Practice;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
public class windowHandler {

	public static void main(String[] args) throws InterruptedException {
		
		// Go to website and switch to child window
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
				
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();//[parent,child] Use this to handle multiple tabs / windows
		Iterator<String> it = windows.iterator();// Use iterator <String> to iterate to the tab/windows
		String parentid = it.next();// To get next index , Iterate to get parent id and store in variable parentid
		String childid = it.next(); // Do second time to get childid and store in var childid
		driver.switchTo().window(childid);// switch driver with swithcTo class to childid
		
		// Grab email address and store as username to login on parent window & strip text to get only email
		
		String textgrab = driver.findElement(By.cssSelector("a[href='mailto:mentor@rahulshettyacademy.com']")).getText();
		String[] email = textgrab.split("with");
		String formattedemail = email[0].trim();
		System.out.println(formattedemail);
		driver.switchTo().window(parentid);
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys(formattedemail);
		
	
	}

}
