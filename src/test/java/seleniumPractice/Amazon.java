package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Amazon {

	public static void main(String[] args) {
		
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Bestsellers']")));
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Mobile",Keys.ENTER);
		driver.findElement(By.xpath(getBrandXpath("Samsung"))).click();
		String deliveryDate = driver.findElement(By.xpath("//*[contains(text(),'Samsung Galaxy M06 5G Mobile')]/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/div[3]/div[1]/div/div[2]/div/div/div[2]")).getText();
		Assert.assertEquals(deliveryDate, "Or fastest delivery Tomorrow, 9 Apr");
		
		
	}
	
	public static String getBrandXpath(String brand) {


		
		return "//*[@id='filter-p_123']/span/span/li/span/a/child::span[text()='" + brand + "']";
	}

}
