package selenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sadbasicsExp_1 {
	
	WebDriver driver;
	JavascriptExecutor jse;
	public void LaunchAUT()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (15)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/");  
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	public void username()
	{
		jse=(JavascriptExecutor)driver;
		
		WebElement we =driver.findElement(By.id("username"));
		
		 jse.executeScript("arguments[0].value=anilkumartesting22@gmail.com");
	}
	public void clickloging()
	{
		jse=(JavascriptExecutor)driver;
		WebElement L_click=driver.findElement(By.id("Login"));
		jse.executeScript("arguments[0].click();",L_click);
	}
	public void password()
	{
		jse=(JavascriptExecutor)driver;
		WebElement pass=driver.findElement(By.id("password"));
		jse.executeScript("arguments[0].value=123456';",pass);
	}
	public static void main(String[] args) {
		
		sadbasicsExp_1 obj=new sadbasicsExp_1();
		obj. username();
		obj.clickloging();
		obj.password();
	}

}




