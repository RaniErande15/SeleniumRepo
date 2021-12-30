package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ranie\\eclipse-workspace\\Selenium_July21\\Resources\\chromedriver.exe");
		
		System.out.println("STEP- Launch browser");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		
		driver.findElement(By.xpath("//input[@class='is_required validate account_input form-control']")).sendKeys("yogitalokhande@gmail.com");
		driver.findElement(By.xpath("//*[@id=\'SubmitCreate\']/span")).click();
		
		System.out.println("Successful");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\'id_gender2\']")).click();
		System.out.println("STEP- First name");
		
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Rani");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Erande");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("12345");
		
		WebElement element=driver.findElement(By.xpath("//select[@name='days']"));
		Select sel=new Select(element);
		sel.selectByValue("15");
		
		
		WebElement element1=driver.findElement(By.xpath("//select[@name='months']"));
		Select sel1=new Select(element1);
		sel1.selectByIndex(6);
		
		WebElement element2=driver.findElement(By.xpath("//select[@name='years']"));
		Select sel2=new Select(element2);
		sel2.selectByIndex(25);
	
		driver.findElement(By.xpath("//input[@id='newsletter']")).click();
		driver.findElement(By.xpath("//input[@id='optin']")).click();
		
		//driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Rani");
		//driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Erande");
		
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("XYZ");
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("ABC-XYZ");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Pune");
		
		//Handel drop down
		WebElement ele3=driver.findElement(By.xpath("//select[@id='id_state']"));
		Select sel3=new Select(ele3);
		sel3.selectByIndex(15);
		
		
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("00000");
		
		driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("0123456789");
		//driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("Sample");
		
		//driver.findElement(By.xpath("//*[@id='submitAccount']")).click();
	}

}
