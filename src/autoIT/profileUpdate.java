package autoIT;

	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class profileUpdate 
	{
	public  WebDriver driver = null;
		
		@BeforeMethod
		public void precondition()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivak\\Desktop\\vani\\FrameworkDemo\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.edureka.co");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}
			
			public void RunautoIT()
			{
				try
				{
				String strFilePath ="C:\\Users\\sivak\\Desktop\\Personal\\100_0206.jpg";
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
	public void login() throws Exception
	{
		driver.findElement(By.xpath("//a[text()='Log In']")).click();
		
		WebElement login=driver.findElement(By.xpath("//button[text()='LOGIN']"));
		WebDriverWait wait = new WebDriverWait(driver,30);
	    wait.until(ExpectedConditions.visibilityOf(login));
		
		login.click();
		
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='LOGIN']")));
		
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		
		WebElement Email =driver.findElement(By.xpath("//input[@id='inputName']"));
		Email.sendKeys("kalaivani1284@gmail.com");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@id ='pwd1']"));
		pwd.sendKeys("Sairam@1234");
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		String act_title ="Instructor-Led Online Training with 24X7 Lifetime Support | Edureka";
		
		//WebDriverWait wait1 = new WebDriverWait(driver,20);
	    wait.until(ExpectedConditions.titleIs(act_title));
	    driver.findElement(By.xpath("//img[@class='img30']")).click();
	    driver.findElement(By.xpath("//a[text()='My Profile']")).click();
	    wait.until(ExpectedConditions.titleContains("My Profile"));
	    
	    driver.findElement(By.xpath("//span[@class='edit_profile txt-md']")).click();
	    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[text()='Save & Close']"))));
	    driver.findElement(By.xpath("//span[@class='open_upload']")).click();
	    RunautoIT();
	}
	}




