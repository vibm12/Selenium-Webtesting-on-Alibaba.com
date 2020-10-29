import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignIn {
  WebDriver driver;
  public void f() {
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibh\\OneDrive\\Desktop\\chromedriver.exe");
	  	driver = new org.openqa.selenium.chrome.ChromeDriver();
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://alibaba.com");
  }
  
  @Test
  public void signin() throws InterruptedException{
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[4]/div[1]/div[1]/div[2]/div[1]/a")).click();
		WebElement email = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/form/div[4]/dl[1]/dd/div/input"));
		email.sendKeys("vaibhavmahajan124@gmail.com");
		WebElement password = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/form/div[4]/dl[2]/dd/div/input"));
		password.sendKeys("Vaibhav@123");
		Thread.sleep(5000);
		
		// SLIDER
//		WebElement slider = driver.findElement(By.xpath("")); 
//	    Actions move = new Actions(driver);
//	    Action action = (Action) move.dragAndDropBy(slider, 30, 0).build();
//      action.perform();
		
		// LOGIN
		
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/form/div[5]/input[2]")).click();
		Thread.sleep(2000);	
		ProfileTest t = new ProfileTest();
		t.profile(driver);
		//Help h = new Help();
		//h.Help_fun(driver);
		
	}
  	   
 
  
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }
  
}
