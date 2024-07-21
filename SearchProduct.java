package testqa;

import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SearchProduct {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://pharmeasy.in/online-medicine-order?src=homecard");
		
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Actions actions = new Actions(driver);
        WebElement searchInput = driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[1]/div[2]/section[1]/div[1]/div/div/div[3]/div/div[2]/div/div/input"));
      actions.moveToElement(searchInput).build().perform();
		searchInput.click();
		Thread.sleep(2000);
		searchInput.sendKeys("paracetamol tablets");
		Actions act = new Actions(driver);
        WebElement enter = driver.findElement(By.xpath("//div[@class='ClickableElement_clickable__ItKj2 Typeahead_searchIcon__KGDGS']"));
        act.moveToElement(enter).build().perform();
      enter.click();
      Actions act1 = new Actions(driver);
      WebElement enter1 = driver.findElement(By.xpath("//div[@class='LHS_container__mrQkM Search_fullWidthLHS__mteti']//div[1]//div[1]//div[1]//a[1]//div[2]//div[1]//div[4]//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]//button[1]"));
		Thread.sleep(2000);
      act1.moveToElement(enter1).build().perform();
    enter1.click();
    Actions act2 = new Actions(driver);
    WebElement quantityDropdown = driver.findElement(By.xpath("//li[normalize-space()='3']"));
    act2.moveToElement(quantityDropdown).click().perform();
    Select select = new Select(quantityDropdown);
    select.selectByVisibleText("3");
    //Thread.sleep(2000);

    
    Actions act3 = new Actions(driver);
    WebElement enter2 = driver.findElement(By.xpath("//div[@class='CartStatusTile_container__XLhVe']//button[@id='proceed']"));
        act3.moveToElement(enter2).build().perform();
  enter2.click();
  
  
    
    
    
    
    
    
		
		
        


       
		
		driver.close();
		

	}

}
