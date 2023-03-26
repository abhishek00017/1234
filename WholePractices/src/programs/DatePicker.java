package programs;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	public static void main(String[] args) throws InterruptedException {

				selectDate();

	}
	public static void selectDate() throws InterruptedException {

		Calendar c=Calendar.getInstance();
		c.add(Calendar.DATE, 7);
		Date d=c.getTime();
		DateFormat df=new SimpleDateFormat("dd_M");
		String formatedDate=df.format(d);

		String[] dateMonth=formatedDate.split("_");
		String date=dateMonth[0];
		String month=dateMonth[1];


		WebDriver driver=new ChromeDriver();
		driver.get("https:erail.in");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@title=\"Select Departure date for availability\"]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//table[@class=\"WithBorder\"]//td[contains(text(),'"+month+"')]//parent::tr//following-sibling::tr//td[text()='"+date+"']")).click();

	}

	public static void getMonthName(int monthNumber) {
		String monthName=" given month number is not valid please check....";
		if(monthNumber==1) {
			monthName= "Jan";
		}else if(monthNumber==2){
			monthName= "Feb";

		}else if(monthNumber==3){
			monthName= "mar";

		}else if(monthNumber==4){
			monthName= "apr";

		}else if(monthNumber==5){
			monthName= "may";

		}else if(monthNumber==6){
			monthName= "jun";

		}else if(monthNumber==7){
			monthName= "jul";

		}else if(monthNumber==8){
			monthName= "aug";

		}else if(monthNumber==9){
			monthName= "sep";
		}
	}

}
