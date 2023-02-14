package basicexamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderPopUp {
	@Test
	public void demo() {
		String month = "June";
		String day = "30";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		
		driver.findElement(By.xpath("//span[@class=\"ic_circularclose_grey\"]")).click();
		for(;;) {
			try{
				driver.findElement(By.xpath("//div[text()='"+month+" 2023']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+day+"']")).click();
				break;
			}
			catch (Exception e) {
				
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
	}

}
