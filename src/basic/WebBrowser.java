package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ranie\\eclipse-workspace\\Selenium_July21\\Resources\\chromedriver.exe");
		
		System.out.println("STEP- Launch browser");
		WebDriver driver=new ChromeDriver();
		
		System.out.println("STEP- open URL");
		driver.get("https:\\www.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(3000);
		System.out.println("STEP- enter first name");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rani");
		System.out.println("STEP- Enter last name");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Erande");
		System.out.println("STEP- Enter mail address");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("ranierande15@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("ranierande15@gmail.com");
		System.out.println("STEP- Enter the password");
		driver.findElement(By.id("password_step_input")).sendKeys("12345");
	
		System.out.println("STEP- Select the birth date");
		//handel the drop down box
		WebElement birthDayelement=driver.findElement(By.xpath("//select[@title='Day']"));
		Select birthDayselect=new Select(birthDayelement);
		birthDayselect.selectByVisibleText("15");
		
		//select month
		WebElement birthDayelement1=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select birthDayselect1=new Select(birthDayelement1);
		birthDayselect1.selectByIndex(5);
		
		//select year
		WebElement birthDayelement2=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select birthDayselect2=new Select(birthDayelement2);
		birthDayselect2.selectByIndex(24);
		 
		
		//Handel with Radio button
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		
		driver.findElement(By.xpath("//a[@id='terms-link']")).click();
		
		
		
		driver.findElement(By.xpath("//a[@id='cookie-use-link']")).click();
		
		driver.quit();
		
	}
	

}
