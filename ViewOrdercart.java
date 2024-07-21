package testqa;

import java.time.Duration;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ViewOrdercart {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://pharmeasy.in/online-medicine-order?src=homecard");
			
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        Actions actions = new Actions(driver);
	        WebElement searchbox = driver.findElement(By.xpath("//input[@placeholder='Search medicines/Healthcare products ']"));
	        actions.moveToElement(searchbox).build().perform();
	        searchbox.click();
	        Thread.sleep(2000);
	        searchbox.sendKeys("paracetamol");
	        System.out.println("product entered");
	        Actions act = new Actions(driver);
	        WebElement click = driver.findElement(By.xpath("//div[@class='ClickableElement_clickable__ItKj2 Typeahead_searchIcon__KGDGS']"));
	        act.moveToElement(click).build().perform();
	      click.click();
	      Actions act1 = new Actions(driver);
	      WebElement addtocart = driver.findElement(By.xpath("//div[2]//div[1]//div[1]//a[1]//div[2]//div[1]//div[4]//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]//button[1]"));
			//Thread.sleep(2000);
	      act1.moveToElement(addtocart).build().perform();
	      addtocart.click();
	      Actions act2 = new Actions(driver);
	      WebElement quantityDropdown = driver.findElement(By.xpath("//li[normalize-space()='4']"));
	     act2.moveToElement(quantityDropdown).build().perform();
	     quantityDropdown.click();
	      Select select = new Select(quantityDropdown);
	     select.selectByVisibleText("4");
	     Actions act3 = new Actions(driver);
	      WebElement viewcart = driver.findElement(By.linkText("Cart"));
	      act3.moveToElement(viewcart).build().perform();
	      viewcart.click();
	      
	      
	      
	      
	      
	   
	      
	      
	        
	        

	        
	        
	        driver.close();
	        

	}

}
