package SeleniumTraing;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2_EditLead {


			public static void main(String[] args) {
				    
				     ChromeDriver driver=new ChromeDriver();         
				     driver.get("http://leaftaps.com/opentaps/control/main"); 
				     driver.manage().window().maximize();
				  WebElement elem = driver.findElement(By.id("username"));	    
				  elem.sendKeys("DemoSalesManager");
				  driver.findElement(By.id("password")).sendKeys("crmsfa");
				  driver.findElement(By.className("decorativeSubmit")).click();
				  driver.findElement(By.linkText("CRM/SFA")).click();
				  driver.findElement(By.linkText("Leads")).click();
				  driver.findElement(By.linkText("Create Lead")).click();
				  //filling the data fields
				  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
				  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Janani");
				  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Krishnan");
				  driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Mercy");
				  driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
				  driver.findElement(By.id("createLeadForm_description")).sendKeys("Doing testing");
				  driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("janumercy14@gmail.com");
				  driver.findElement(By.name("submitButton")).click();
				  //after submitting the page
				  driver.findElement(By.linkText("Edit")).click();
				  driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("this is for testing the application");
				  driver.findElement(By.className("smallSubmit")).click();
				  //updation completed
				  System.out.println("title is" + driver.getTitle());
				 
				  driver.close();
			
				  
			}
		
	}


