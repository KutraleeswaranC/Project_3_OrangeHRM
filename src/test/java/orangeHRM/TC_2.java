package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC_2 extends BaseClass {
	
	@Test
	public void Test2() throws Exception{
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(2000);
		
		WebElement uname= driver.findElement
				(By.xpath("(//div[text()='-- Select --']//following::div)[1]"));
		Actions act=new Actions(driver);
		act.sendKeys(uname , "A").sendKeys(Keys.ARROW_DOWN,Keys.RETURN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		
		WebElement status_1=driver.findElement
				(By.xpath("(//div[@class='oxd-table-filter-area']//following::i)[2]"));
		Actions act1=new Actions(driver);
		act1.sendKeys(status_1, "E").sendKeys(Keys.ARROW_DOWN,Keys.RETURN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
		
		WebElement uname_2=driver.findElement
				(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]"));
		Actions act2=new Actions(driver);
		act2.sendKeys(uname_2 , "E").sendKeys(Keys.ARROW_DOWN,Keys.RETURN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		
		WebElement status_2 = driver.findElement
				(By.xpath("(//div[@class='oxd-select-text--after'])[2]"));
		Actions act3=new Actions(driver);
		act3.sendKeys(status_2, "D").sendKeys(Keys.ARROW_DOWN,Keys.RETURN).sendKeys(Keys.ENTER).build().perform();
       System.out.println("TC_2 Successfully Completed");		
	}

}
