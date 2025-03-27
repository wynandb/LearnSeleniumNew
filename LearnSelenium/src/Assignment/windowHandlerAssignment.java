package Assignment;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class windowHandlerAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[href='/windows']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
		Thread.sleep(1000);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentid = it.next();
		Thread.sleep(1000);
		String childid = it.next();
		driver.switchTo().window(childid);
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		Thread.sleep(1000);
		driver.switchTo().window(parentid);
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		
		


		}

		
		

	}


