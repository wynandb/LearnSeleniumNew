package Assignment;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class DriveDataDynamically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		checkbox example
//		1. select any checkbox  
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		
//		2.grab checkbox label - Store in variable
		String convertedlabelname = driver.findElement(By.cssSelector("label[for='bmw']")).getText().toLowerCase();
		//System.out.println(convertedlabelname);

//		dropdown example
//		3. Select the corresponding option in dropdown from the checkbox that was chosen.
//		** use the variable value from option 2
		WebElement staticdropdown = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByValue(convertedlabelname);

//		4. Enter label text stored in variable from step 2
		String originallabelname = driver.findElement(By.cssSelector("label[for='bmw']")).getText();
		driver.findElement(By.id("name")).sendKeys(originallabelname);
		
//		5. Click on alert button & verify if step 2 text is present in popup msg
		driver.findElement(By.cssSelector("input[id='alertbtn']")).click();
		String popuptext = driver.switchTo().alert().getText();
		//System.out.println(popuptext);
		String[] splittext = popuptext.split("Hello");
		String verifytext = splittext[1].trim();
		String[] formattedtext = verifytext.split(",");
		String verifyabletext = formattedtext[0].trim();
		//System.out.println(verifyabletext);
		System.out.println(originallabelname.equals(verifyabletext));
		

	}

}
