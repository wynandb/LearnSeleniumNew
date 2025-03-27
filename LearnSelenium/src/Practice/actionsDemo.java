package Practice;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
public class actionsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		//
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver gets linked to Actions class
		Actions a = new Actions(driver);
		
		
		
		//Move to  Specific element
		
		//Action gets performed by the .build().perform(); Build build the action and perform executes the action
		// ContextClick = RightClick
		a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).contextClick().build().perform();
		
		Thread.sleep(1000);
		a.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"))).click().keyDown(Keys.LEFT_SHIFT).sendKeys("hello").doubleClick().build().perform();
		
	}

}
