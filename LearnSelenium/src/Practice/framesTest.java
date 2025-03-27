package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class framesTest {

	public static void main(String[] args) {
		//
		//Open WebPage
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		// Count frames on page with findElemts 
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		// SwitchTo to frame with frame index 
		driver.switchTo().frame(0);
		
		//# When using index NO WEBELEMENT NEEDED
		
		//SwitchTo to frame with WebElement
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		//driver.findElement(By.cssSelector("div[id='draggable']")).click();
		
		// Action class to be able to drag and drop
		Actions a = new Actions(driver);
		
		// WebElemnts to point to source and target
		WebElement  source = driver.findElement(By.cssSelector("div[id='draggable']"));
		WebElement  target = driver.findElement(By.cssSelector("div[id='droppable']"));
		
		// Build and perform the drag and drop
		a.dragAndDrop(source, target).build().perform();
		
		// TO GET OUT OF THE FRAME TO PERFORM OTHER ACTIONS ONCE ALL ACTIONS ON FRAME IS DONE
		driver.switchTo().defaultContent();

	}

}
