package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Automation Testing\\chromedriver_win32\\chromedriver.exe");
		
		System.out.println("STEP- Launch browser");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com");
		
		driver.manage().window().maximize();
		
		String ecpectedtext="WOMEN";
		String str=driver.findElement(By.xpath("//a[@title='Women']")).getText();
		if(ecpectedtext.equals(str))
			System.out.println("Test case pass");
		else
			System.out.println("Test case fail");
		
		String text="Dress";
		String str1=driver.findElement(By.xpath("//a[@title='Dresses']")).getText();
		if(text.equals(str1))
			System.out.println("Pass");
		else
			System.out.println("Fail");

	}

}
