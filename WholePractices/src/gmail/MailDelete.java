package gmail;

//import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;


public class MailDelete {
	
	
public static void main(String[] args) throws InterruptedException {
	
	ChromeOptions opt=new ChromeOptions();
	opt.setExperimentalOption("excludeSwitches", new String[] {"enable-Automation"});
	opt.addArguments("--remote-allow-origins=*");
	ChromeDriver driver=new ChromeDriver(opt);
	driver.navigate().to("http://quearn.com/login");

			
		
		
		
	driver.findElement(By.linkText("Sign In")).click();
	Thread.sleep(3000);
	
	System.out.println(driver.getWindowHandles().size());
	Actions acObj=new Actions(driver);
	WebElement userName=driver.findElement(By.name("log"));
	
	acObj.sendKeys(userName, "Manoj47").perform();
	driver.findElement(By.name("pwd")).sendKeys("9795014005",Keys.ENTER);
//	driver.findElement(By.xpath("//input[@id=\"password_206\"]")).click();
	Thread.sleep(3000);
		
//		}
}
}
