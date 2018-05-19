package GIT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class gitDemo 
{
	
@Test
public void gitoutput()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sivak\\Desktop\\vani\\ToolsDemo\\Drivers\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	System.out.println("This is the GIT Demo");
	driver.get("https://google.com");
	driver.findElement(By.name("q")).sendKeys("Edureka",Keys.ENTER);

}
	
}
