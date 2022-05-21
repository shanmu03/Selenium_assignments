package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();
		 WebElement eleUsername = driver.findElement(By.id("username"));
		  eleUsername.sendKeys("DemoSalesManager");
		  driver.findElement(By.id("password")).sendKeys("crmsfa");
		  driver.findElement(By.className("decorativeSubmit")).click();
		  driver.findElement(By.linkText("CRM/SFA")).click();
		  driver.findElement(By.linkText("Leads")).click();
		  driver.findElement(By.linkText("Create Lead")).click();
		  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("rytu");
		  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("rhst");
		  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("rkic");
		  driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("yud");
		  driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("jydt");
		  driver.findElement(By.id("createLeadForm_description")).sendKeys("bcaufgu");
		  driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("hfeuhy@yahoo.com");
		  
		  WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		  Select dd = new Select (state);
		  
		  dd.selectByVisibleText("New York");
		  
		 driver.findElement(By.name("submitButton")).click();
		 driver.findElement(By.linkText("Edit")).click();
		 driver.findElement(By.id("updateLeadForm_description")).clear();
		 driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("vbhg");
		 driver.findElement(By.name("submitButton")).click();
		 
		 System.out.println(driver.getTitle());
	}

}
