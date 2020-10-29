import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Help {
  @Test
  public void Help_fun(WebDriver driver) throws InterruptedException {
	 driver.get("https://service.alibaba.com/buyer/?spm=a2700.8293689.scGlobalHomeHeader.57.2ce265aagNsK2I&tracelog=hd_hp_buyerhp");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("/html/body/div[2]/div[5]/div[2]/div[1]/div[4]/div/button")).click();
	 Thread.sleep(3000);
	 WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div[1]/input"));
	 element.sendKeys("Hi Anna");
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div[2]/div")).click();
	 Thread.sleep(3000);
  }
}
