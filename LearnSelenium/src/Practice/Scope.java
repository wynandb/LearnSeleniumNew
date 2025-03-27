package Practice;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub//
		
		
		// 1. Count links on page
			// links will have tag called a = anchor
		
		//Open WebPage
				WebDriver driver = new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				driver.manage().window().maximize();
				// 1. Count links on page and print to console
				System.out.println(driver.findElements(By.tagName("a")).size());
				
				// 2. get all the links in the footer by creating WebElement footerdriver (mini driver to limit search scope to footer)
				WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
				System.out.println(footerdriver.findElements(By.tagName("a")).size());
				
				// 3. Find 1st link section in footer # ALREADY at "gf-BIG" , so create Webelement columndriver & traverse from there to the element highlighting the 1st column
				WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
				System.out.println(columndriver.findElements(By.tagName("a")).size());
				
				// 4. click on each link in column & check if pages are opening
				for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
				{
					
					String clickonlinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
					
					columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
					Thread.sleep(5000);
				}
				
				
					Set<String> windows = driver.getWindowHandles();// 4 windows 
					Iterator<String> it = windows.iterator();// Iterator between windows
					
					
				while(it.hasNext()) // To tell if next index is present
				{
					driver.switchTo().window(it.next());//Moves to next index
					System.out.println(driver.getTitle());//print title
					}
					
					
										
		}
	
}
				

