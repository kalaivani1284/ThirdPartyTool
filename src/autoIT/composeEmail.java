package autoIT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class composeEmail 
{
public static WebDriver driver = null;
public static String CHROME_KEY = "webdriver.chrome.driver";
public static String CHROME_VALUE = "C:\\Users\\sivak\\Desktop\\vani\\ToolsDemo\\Drivers\\chromedriver.exe";
public static WebDriverWait wait = null;
//Thisis precondition
	@BeforeMethod
	public void precondition()
	{
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver,10);
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void RunautoIT()
	{
		try
		{
		String strFilePath = "C:\\Users\\sivak\\Desktop\\Java\\Selenium\\autoIT\\Sample.txt";
		String strPath="C:\\Users\\sivak\\Desktop\\Java\\Selenium\\autoIT\\attach.exe";
		String strParameter = strPath+" "+strFilePath;
		
		Runtime.getRuntime().exec(strParameter);
		}
				catch(Exception e)
		{
			System.out.println("Unable to load file");
		}
		
			}
	@Test
	public void composeEmailwithAttachment()
	{
		driver.findElement(By.id("identifierId")).sendKeys("kalaivani1284@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.name("password")).sendKeys("Sairam@1234");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		wait.until(ExpectedConditions.titleContains("Inbox"));
		driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
		driver.findElement(By.xpath("//div[@id=':qb']")).click();
		RunautoIT();
	}
	@AfterMethod
	public void closebrowser()
	{
		//driver.close();
	}
}
