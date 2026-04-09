package seleniumPractice;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interview {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		String role = driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_14']/ancestor::tr/child::td[3]")).getText();
		System.out.println(role);
		driver.quit();
		
		
	}

}
