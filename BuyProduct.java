import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BuyProduct {
  @Test
  public void searchproduct(WebDriver driver) throws InterruptedException{
		WebElement search = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[3]/div/div/form/div[2]/input"));
		search.sendKeys("cyber power pc");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[3]/div/div/form/i[1]")).click();
		Thread.sleep(5000);

  	    driver.get("https://www.alibaba.com/product-detail/latest-all-in-one-Gaming-PC_62314893767.html?spm=a2700.galleryofferlist.normalList.57.26ad5266ynx0xB");
		Thread.sleep(5000);
		driver.get("https://biz.alibaba.com/contract/draftSampleOrder.htm?KEY=880a8ad13ce43c80ff23d37bad6928ec#/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/form/div[1]/div[2]/div/div/div[1]/div[2]/button/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/header/div[2]/div/div[1]/a")).click();
		Thread.sleep(2000);
		Help h = new Help();
		h.Help_fun(driver);
	}
}
