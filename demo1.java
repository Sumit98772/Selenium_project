package project;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class demo1 {
	
		private static final WebDriver webDriver = null ;
		private static WebElement txtbx_password;

		public static void main(String args[]) throws InterruptedException
		{
			
			System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
			
			LOGIN(driver);
			Customer(driver);
			
			Logout(driver);
		}
		

		private static void Customer(ChromeDriver driver) {
			WebElement Customers=
			driver.findElement(By.xpath("//*[contains(text(),'Customers')]"));
			//boolean c = extracted(Customers);
			//boolean b = c;
			//if(b){
				//driver.findElement(By.xpath("//*[contains(text(),'Customers')]"));
				
				
			//}
			//driver.findElement(By.xpath("//*[contains(text(),'Customers')]"));
			//System.out.println("sumit");
			Customers.click();
			WebElement Customers1=

					driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a/p"));
			
			Customers1.click();
		
			WebElement AddnewButton=	
					driver.findElement(By.xpath("/html/body/div[3]/div[1]/form[1]/div/div/a\r\n"));
						
			AddnewButton.click();
			WebElement Email= driver.findElement(By.xpath("//input[@id='Email']"));
					Email.sendKeys("verma1kolkn4@gmail.com");
					WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
					password.sendKeys("12345");
					WebElement Firstname=driver.findElement(By.xpath("//input[@id='FirstName']"));	
				    Firstname.sendKeys("sumush");
				    WebElement Lastname=driver.findElement(By.xpath("//input[@id='LastName']"));	
				    Lastname.sendKeys("verma");
				    WebElement Gender=	driver.findElement(By.xpath("//input[@id='Gender_Male']"));
					Gender.click();
					WebElement DOB=driver.findElement(By.xpath("//input[@id='DateOfBirth']"));	
					DOB.sendKeys("8/10/2003");
					WebElement Company=driver.findElement(By.xpath("//input[@id='Company']"));	
				    Company.sendKeys("SVIET");
				    WebElement Tax=driver.findElement(By.xpath("//input[@id='IsTaxExempt']"));	
				    Tax.click();
				    
				    WebElement Newsletter=driver.findElement(By.xpath("//input[@role='listbox']"));	
				    Newsletter.click();
				  //  WebElement Newsletteroption=driver.findElement(By.xpath("//*[@role='option']/option[1]"));	
				   // Newsletteroption.click();
				    
				   // WebElement Newsletteroption=driver.findElement(By.xpath("//Select[contains(@name,'SelectedNewsletterSubscriptionStoreIds')]/option[.='Test store 2']"));
				   // elm.selectByVisibleText("Test store 2");
				    //Newsletteroption.click();
				    

				    
				    WebElement Saveandedit=	driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div[1]/div/button[2]"));
					Saveandedit.click();
					WebElement Delete=	driver.findElement(By.xpath("//*[@id=\"customer-delete\"]"));
					Delete.click();
					//WebElement Delete1=	driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/div/div/form/div/div[2]/button"));
					//WebElement Delete1=
							//driver.findElement(By.xpath("//a[@class='btn btn-danger float-right']"));
					//driver.findElement(By.xpath("//button[contains(@text,'Delete')]"));
					 //driver.switchTo().alert().dismiss();
					 //WebElement delete = (By.xpath("//button[.='Delete']"))); 
					//Alert alert=driver.switchTo().alert();
					//alert.accept();
					//WebElement Search=	driver.findElement(By.xpath("//button[contains(@id(),'search-customers')]"));
					//Search.click();
					WebElement element = driver.findElement(By.className("btn btn-danger float-right"));
					JavascriptExecutor executor = (JavascriptExecutor)driver;
					executor.executeScript("arguments[0].click();", element);
					//Delete1.click();
					WebElement Email1= driver.findElement(By.xpath("//label[@id='SearchEmail']"));
					Email1.sendKeys("verma123@gmail.com");
					WebElement Company1=driver.findElement(By.xpath("//input[@id='SearchCompany']"));	
				    Company1.sendKeys("SVIET");
					WebElement Firstname1=driver.findElement(By.xpath("//input[@id='SearchFirstName']"));	
				    Firstname1.sendKeys("sumit");
				    WebElement IPaddress=driver.findElement(By.xpath("//input[@id='SearchIpAddress']"));	
				    IPaddress.sendKeys("172.13.16.25");
				    WebElement Lastname1=driver.findElement(By.xpath("//input[@id='SearchLastName']"));	
				    Lastname1.sendKeys("verma");
				    WebElement Month=	driver.findElement(By.xpath("//input[@id='SearchMonthOfBirth']"));
					Month.click();
					WebElement Month1=	driver.findElement(By.xpath("//*[contains(text(),'8')]"));
					Month1.click();
					 WebElement Day=	driver.findElement(By.xpath("//input[@id='SearchDayOfBirth']"));
					Day.click();
					WebElement Day1=	driver.findElement(By.xpath("//*[contains(text(),'8')]"));
					Day1.click();
					WebElement Search=	driver.findElement(By.xpath("//button[contains(@id(),'search-customers')]"));
					Search.click();
							
		}


		
		private static void Logout(ChromeDriver driver) {
			WebElement Logout_button = 
					driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
			Logout_button.click();		
		}

		private static void LOGIN(ChromeDriver driver) throws InterruptedException {
			
			 
			WebElement txtbx_Email = 
					driver.findElement(By.xpath("//input[@id='Email']"));
			Thread.sleep(1000);
			txtbx_Email.clear();
			Thread.sleep(1000);
					txtbx_Email.sendKeys("admin@yourstore.com");			
					
					WebElement txtbx_password=
					driver.findElement(By.xpath("//input[@id='Password']"));
					Thread.sleep(1000);
					txtbx_password.clear();
					Thread.sleep(1000);
					txtbx_password.sendKeys("admin");
					
			
					WebElement RememberMe=	driver.findElement(By.xpath("//input[@id='RememberMe']"));
					RememberMe.click();
					
						
					WebElement LoginButton=	driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
					LoginButton.click();
					
					
								
		}
}
