package SeleniumTraing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledButton_WK2_d2 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//div[@class='col-12']/input[@id='j_idt88:name']")).sendKeys("Janumercy");
		driver.findElement(By.xpath("//div[@class='col-12']/input[@id='j_idt88:j_idt91']")).sendKeys("Janumercy");
		boolean dis = driver.findElement(By.xpath("//div[@class='col-12']/input[@id='j_idt88:j_idt93']")).isEnabled();
		if(dis) {
			System.out.println("enabled");
		}else {
			System.out.println("disabled");
		}
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50000));
		//driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']")).sendKeys("Can you clear me, please?");
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt99'][contains(@placeholder,'email')]")).sendKeys("janumercy14@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='j_idt88:j_idt101'][@maxlength='2147483647']")).sendKeys("Im tester as working as Manually");
		driver.findElement(By.xpath("//div[@id='j_idt88:j_idt103_editor']//br")).sendKeys("learning automation for upskilling");
		driver.findElement(By.xpath("//span[@class='ui-float-label']/input[@id='j_idt106:float-input']")).sendKeys("celene");
		//driver.findElement(By.xpath("//input[@id='j_idt106:auto-complete_input'][@placeholder='Search']")).sendKeys("janu");
		//driver.findElement(By.xpath("//li[@data-item-label='3']")).click();
		
		
		boolean keyboard=driver.findElement(By.xpath("//div[@id='j_idt133']/following::div[contains(@class,'keypad-popup ')]")).isEnabled();
		if (keyboard)
		{
			System.out.println("keyboard popped");
		}else {
			System.out.println("no keyboard");	
		}
		driver.findElement(By.xpath("//div[contains(@data-placeholder,'content')]//p")).sendKeys("celene");
		
		driver.close();
	}

}
