package orangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
WebDriver driver;	
@BeforeMethod
public void browserLauch() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	
	driver.get
	("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	WebElement userName = driver.findElement
			(By.xpath("//*[@name='username']"));
	userName.sendKeys("Admin");
	
	WebElement password = driver.findElement
			(By.xpath("//*[@name='password']"));
	password.sendKeys("admin123");

	WebElement loginButton = driver.findElement
			(By.xpath("//*[@name='password']//following::button"));
	loginButton.click();
	
	 
	 
}

}
