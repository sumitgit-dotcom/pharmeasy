package testqa;
//import org.openqa.selenium.WebDriver;

//import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://pharmeasy.in/");
	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
	
	Actions action = new Actions(driver);
	
	WebElement ele = driver.findElement(By.linkText("Hello, Log in"));
	action.moveToElement(ele).build().perform();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	ele.click();
	
	Actions action1 = new Actions(driver);
	WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"login\"]/div[3]/form/div/div/input"));
	action1.moveToElement(ele1).build().perform();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	ele1.click();
	ele1.sendKeys("8871220199");
	Actions action2 = new Actions(driver);
	WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"login\"]/div[3]/form/div/button"));
	action2.moveToElement(ele2).build().perform();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	ele2.click();
	System.out.println("OTP sent successfull");
	
	Actions action3 = new Actions(driver);
	WebElement ele3 = driver.findElement(By.xpath("//input[@id='0']"));
	action3.moveToElement(ele2).build().perform();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	ele3.click();
	
	Actions action4 = new Actions(driver);
	WebElement ele4 = driver.findElement(By.xpath("//input[@id='1']"));
	action4.moveToElement(ele2).build().perform();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	ele4.click();
	
	Actions action5 = new Actions(driver);
	WebElement ele5 = driver.findElement(By.xpath("//input[@id='2']"));
	action5.moveToElement(ele2).build().perform();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	ele5.click();
	
	Actions action6 = new Actions(driver);
	WebElement ele6 = driver.findElement(By.xpath("//input[@id='3']"));
	action6.moveToElement(ele2).build().perform();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	ele6.click();
	
	Actions action7 = new Actions(driver);
	WebElement ele7 = driver.findElement(By.xpath("//span[@class='c-kkmdlQ c-kkmdlQ-gatHuX-structure-captionRegular c-kkmdlQ-dYJjti-weight-regular c-kkmdlQ-idrTqVf-css']"));
	action7.moveToElement(ele2).build().perform();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	ele7.click();
		
	
	
	
	
	
	
	
	
	
	

	
	
	driver.close();
	
	
	
	
	//driver.close();
	
	//ele.click();
	//WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10));
	//wait.until(null)
	
	
	
    
	
	
	

	
	driver.close();
		
		
		
		

	}}

//}
