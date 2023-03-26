package programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;

import net.bytebuddy.asm.MemberSubstitution.Substitution.Stubbing;

public class ExtentReport {

	public static void main(String[] args) throws IOException {
		System.out.println(1);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhis\\OneDrive\\Desktop\\visionClass\\WholePractices\\driver\\chromedriver.exe");

		File reportName=new File("ExtentReport.html");

		ExtentSparkReporter extSobj=new  ExtentSparkReporter(new File("ExtentReport.html"));

		ExtentReports report= new ExtentReports();

		report.attachReporter(extSobj);


		report.setSystemInfo("OS name : ", System.getProperty("os.name"));
		report.setSystemInfo("User Name","Abhishek y@d@v");//
		report.setSystemInfo("Server Name","QA Server");


		ExtentTest tc001= report.createTest("001");
		WebDriver driver= new ChromeDriver();
		TakesScreenshot screenShot= (TakesScreenshot)driver;
		driver.get("http:localhost:8888");
		//		urlNavigation.log(Status.INFO, "url successfully navigated");

		tc001.log(Status.INFO, "url navigation successfull");
		WebElement userBox=driver.findElement(By.name("user_name"));
		boolean ubStatus=userBox.isEnabled();
		if(ubStatus==true){
			tc001.log(Status.PASS, "User box is enabled");
		}else {
			tc001.log(Status.FAIL, "User box is disabled");
			File source= screenShot.getScreenshotAs(OutputType.FILE);
			File destination =new File("screenShot//userBox.jpg");
			Files.copy(source, destination);
			tc001.addScreenCaptureFromPath(destination.getAbsolutePath());
		}


		WebElement passwordBox=driver.findElement(By.name("user_password"));
		boolean pbStatus=passwordBox.isEnabled();		
		if(pbStatus==true) {
			tc001.log(Status.PASS, "userpassword is enabled");
			TakesScreenshot	takescr=(TakesScreenshot)driver;
			File from=takescr.getScreenshotAs(OutputType.FILE);
			File to=new File("screenShot//passwordBox.png");
			Files.copy(from, to);
			tc001.addScreenCaptureFromPath(to.getAbsolutePath());
		}	 else {
			tc001.log(Status.FAIL, "userpassword is not enabled");

		}
		report.flush();










		//		ExtentTest tc001=report.createTest("TC001");
		//		WebElement userBox=driver.findElement(By.name("user_name"));
		//		boolean userBoxabilityStatus=userBox.isEnabled();
		//		if(userBoxabilityStatus==true) {
		//			tc001.log(Status.PASS, "User Box is enable and test PASSED");
		//
		////			File fromLocation=getSnapShot.getScreenshotAs(OutputType.FILE);
		//			File toLocation=new File("testingSnapShots\\uBoxStatusSnapShot"+currentTime.toString().replace(":","_")+".png");
		////			Files.copy(fromLocation, toLocation);
		//
		//		}else {
		//			tc001.log(Status.FAIL, "Userbox is disable and test FAILED");			
		//		}
		//
		//		userBox.clear();
		//		userBox.sendKeys("admin");
		//		String enteredUName=userBox.getAttribute("value");
		//		if(enteredUName.equals("admin")) {
		//			tc001.log(Status.PASS,"User name entered successfully in user box and test PASSED");
		//		}else {
		//			tc001.log(Status.FAIL, "user name not entered successfully and test FAILED");
		//		}
		//
		//
		//
		//		WebElement passwordBox=driver.findElement(By.name("user_password"));
		//		boolean passWordStatus=passwordBox.isEnabled();
		//		if(passWordStatus==true) {
		//			tc001.log(Status.PASS, "PassWord box is enabled and test PASSED");
		//		}else {
		//			tc001.log(Status.FAIL, "Password box is disabled and test FAILED");
		//		}
		//
		//		passwordBox.clear();
		//		passwordBox.sendKeys("expertview");
		//		String enteredPassword=passwordBox.getAttribute("value");
		//		if(enteredPassword.equals("expertview")) {
		//			tc001.log(Status.PASS, "entered Password is matched and test PASSED");
		//		}else {
		//			tc001.log(Status.FAIL, "entered Password is not matched and test FAILED");
		//		}
		//		WebElement loginbutton=driver.findElement(By.name("Login"));
		//		boolean loginButtonStatus=loginbutton.isEnabled();
		//		if(loginButtonStatus==true) {
		//			tc001.log(Status.PASS, "Login Button is enabled and test PASSED");
		//
		//
		//
		//			TakesScreenshot screenShot=(TakesScreenshot)driver;
		//			File fromLocation=screenShot.getScreenshotAs(OutputType.FILE);
		//			File toLocation=new File("testingSnapShots//loginPageBeforelogin"+currentTime.toString().replace(":","_")+".png");
		//			Files.copy(fromLocation, toLocation);
		//			new FileInputStream("");
		//
		//
		//
		//		}else {
		//			tc001.log(Status.FAIL, "Login Button is Disabled and test FAILED");
		//		}
		//		TakesScreenshot getSnapShot=(TakesScreenshot)driver;
		//
		//		File fromeLocation=getSnapShot.getScreenshotAs(OutputType.FILE);
		//		File toLocation=new File("testingSnapShots//loginPageBeforelogin"+currentTime.toString().replace(":","_")+".png");
		//		Files.copy(fromeLocation, toLocation);
		//		loginbutton.click();
		//		System.out.println("1");
		//		WebDriverWait explicitWait=new WebDriverWait(driver, Duration.ofSeconds(6));
		//		System.out.println("2");
		//		explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Marketing")));
		//		System.out.println("3");
		//
		//		if(driver.getTitle().equals("admin - My Home Page - Home - vtiger CRM 5 - Commercial Open Source CRM")) {
		//			tc001.log(Status.PASS, "Homepage Appeared");
		//		}else {
		//			tc001.log(Status.FAIL, "Home Page not Appeared");
		//		}
		//		System.out.println("before flush");
		//		
		//		File fromLocation=getSnapShot.getScreenshotAs(OutputType.FILE);
		//		File toLlocation=new File("testingSnapShots\\homePageSnapShot"+currentTime.toString().replace(":", "_")+".png");
		//		Files.copy(fromLocation, toLlocation);
		//		tc001.addScreenCaptureFromPath(toLlocation.getAbsolutePath());
		//		
		//		
		//		report.flush();
		//		System.out.println("after flush");






	}

}
