package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class nestedFrameAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Open WebPage
				WebDriver driver = new ChromeDriver();
				driver.get("https://the-internet.herokuapp.com/");
				driver.manage().window().maximize();
				
				// Click on Nested frames
				driver.findElement(By.cssSelector("a[href='/nested_frames']")).click();

				// Count frames on page with findElemts 
				System.out.println(driver.findElements(By.tagName("frame")).size());
				
				// SwitchTo frame with frame name
				
				driver.switchTo().frame("frame-top");//Parent frame
				driver.switchTo().frame("frame-middle");//nested frame
				
				// Grab text of 2nd frame and print to console
				// WebElemnts to point to source and target
				
				 System.out.println(driver.findElement(By.id("content")).getText());
				
				

	}

}
