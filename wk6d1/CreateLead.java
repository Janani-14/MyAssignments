package wk6d1;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{

	@Test(dataProvider="Fetchdata")
	public void runcreateLead(String cname, String fname, String lname)  {
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.name("submitButton")).click();

	}
	
	//DataProvider
	@DataProvider (name="Fetchdata")
	public String[][] sendData(){
		String data[][] = new String[1][3];
		
		data[0][0]="jana";
		data[0][1]="abc";
		data[0][2]="k";
		
		return data;
		
	}
}
//doubts why not accepting caps in @test dp

