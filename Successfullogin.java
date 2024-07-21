package testqa;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Successfullogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://pharmeasy.in/");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[1]/div[1]/div/div/div[1]/div[2]/div/a/span"));
		action.moveToElement(ele).build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ele.click();
		WebElement ele2 = driver.findElement(By.xpath("(//input[@placeholder='Enter PIN Code'])[1]"));
		Actions action2 = new Actions(driver);
		action2.moveToElement(ele2).build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ele2.click();
		ele2.sendKeys("452010");
		Thread.sleep(3000);
		Actions action3 = new Actions(driver);
		WebElement ele3 = driver.findElement(By.xpath("//*[@id=\"selectPincode\"]/div[2]/div[1]/form/div/button"));
		action3.moveToElement(ele3).build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ele3.click();
		Thread.sleep(2000);
		Actions action4 = new Actions(driver);
		WebElement ele4 = driver.findElement(By.xpath("(//a[@class='c-iWbDBM c-iWbDBM-ijWwrnY-css'][normalize-space()='Medicine'])[1]"));
		action4.moveToElement(ele4).build().perform();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ele4.click();
		Thread.sleep(2000);
		System.out.println("Pin code verified");
			//Actions action5 = new Actions(driver);
		//WebElement ele5 = driver.findElement(By.className("Input_input__AFI4R Typeahead_input__64Wro"));
		//action5.moveToElement(ele5).build().perform();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//ele5.click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//ele5.sendKeys("paracetamol");
	//	Actions action6 = new Actions(driver);
	//	WebElement ele6 = driver.findElement(By.className("//div[@class='ClickableElement_clickable__ItKj2 Typeahead_searchIcon__KGDGS']"));
	//	action6.moveToElement(ele6).build().perform();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//ele6.click();
		
		
		
		
		
		driver.close();
		
		
		

	}

}
