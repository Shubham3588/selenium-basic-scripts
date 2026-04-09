package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LocatorsPractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//*[text()='Forgot your password?']")).click();
		driver.findElement(By.xpath("//*[@placeholder='Name']")).sendKeys("test");
		driver.findElement(By.xpath("//*[@placeholder='Email']")).sendKeys("test@test.com");
		driver.findElement(By.xpath("//*[@placeholder='Phone Number']")).sendKeys("8979846464");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[starts-with(text(),'Reset')]")).click();
		String infoMessage = driver.findElement(By.xpath("//*[@class='infoMsg']")).getText();
		String[] arr = infoMessage.split("'");
		System.out.println(arr[1]);
		driver.findElement(By.xpath("//*[text()='Go to Login']")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("test");
		driver.findElement(By.xpath("//*[@name='inputPassword']")).sendKeys(arr[1]);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		String actual = driver.findElement(By.xpath("//*[@class='login-container']/child::p[contains(text(),'You are successfully logged in.')]")).getText();
		Assert.assertEquals(actual, "You are successfully logged in.");
		
		

	}

}
