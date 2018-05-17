package sikuliscripts;



import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginToFB 
{
	
		public static WebDriver driver = null;
		public static String CHROME_KEY = "webdriver.chrome.driver";
		public static String CHROME_VALUE = "C:\\Users\\sivak\\Desktop\\vani\\ToolsDemo\\Drivers\\chromedriver.exe";
		public static WebDriverWait wait = null;
			@BeforeMethod
			public void precondition()
			{
				System.setProperty(CHROME_KEY,CHROME_VALUE);
				driver = new ChromeDriver();
				wait = new WebDriverWait(driver,10);
				driver.get("https://www.facebook.com");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			}
			
			@Test
			public void loginToFB() throws Exception
			{
				Screen screen = new Screen();
				Pattern email = new Pattern(".\\Images\\Username.PNG");
				Pattern Pass = new Pattern(".\\Images\\Password.PNG");
				Pattern LoginBtn = new Pattern(".\\Images\\LoginBtn.PNG");
				
				screen.wait(email,10);
				screen.type(email,"kalaivani1284@gmail.com");
				screen.type(Pass,"Sairam@1234");
				screen.click(LoginBtn);
				
				
				
			}
	}


