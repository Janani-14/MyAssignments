package SeleniumTraing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_WK2_assignmt {

	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//div[@class='_1pc_']/preceding-sibling::input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("Janani");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("krish");
		driver.findElement(By.xpath("//div[contains(text(),'Mobile')]/following-sibling::input")).sendKeys("7485963210");
		driver.findElement(By.xpath("//div[text()='New password']/following-sibling::input[@type='password']")).sendKeys("Celene#15");
		
       Select obj=new Select(driver.findElement(By.id("day")));
       obj.selectByIndex(2);
       Select obj1=new Select(driver.findElement(By.id("month")));
       obj1.selectByValue("6");
       Select obj2=new Select(driver.findElement(By.id("year")));
       obj2.selectByIndex(5);
        //driver.findElement(By.xpath("//button[text()='Sign Up'][@name='websubmit']")).click();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   driver.close();

	}

	}
