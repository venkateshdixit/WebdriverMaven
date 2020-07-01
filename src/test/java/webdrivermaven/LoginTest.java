package webdrivermaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp(){
		
		System.setProperty("webdriver.gecko.driver","C:\\Software\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	public void doLogin(){
		driver.get("http://www.gmail.com");
		//driver.findElement(By.id("Email")).sendKeys("dvenkatesh9951@gmail.com");
		//driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("dvenkatesh9951@gmail.com");
	   
	 //driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
	}
	
	@AfterSuite
	public void tearDown(){
		
		//driver.quit();
	}
	
	

}
