import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProfileTest {
	//WebDriver driver;
//	@BeforeMethod
//	  public void beforeMethod() {
//		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibh\\OneDrive\\Desktop\\chromedriver.exe");
//		  	driver = new org.openqa.selenium.chrome.ChromeDriver();
//		    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//			driver.manage().window().maximize();
//			driver.manage().deleteAllCookies();
//	  }
  @Test
  public void profile(WebDriver driver) throws InterruptedException{
		driver.get("https://i.alibaba.com/globalBuyerIndex.htm");
		Thread.sleep(10000);
		driver.get("https://profile.alibaba.com/profile/my_profile.htm?spm=a2700.7756200.0.0.7bd81afaUyChYQ&tracelog=buyerMaHome");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/div")).click();
		WebElement mobile = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[4]/div[2]/form/div[3]/div/div/input"));
		mobile.clear();
		Thread.sleep(2000);
		mobile.sendKeys("8149021253");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[4]/div[2]/form/div[7]/div/button[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[16]/div/div[2]/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/header/div[2]/div/div[1]/a")).click();
		Thread.sleep(5000);
		BuyProduct product = new BuyProduct();
		product.searchproduct(driver);
	}
//  @AfterMethod
//  public void afterMethod() {
//	  driver.quit();
//  }
  
}
