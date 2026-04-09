package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.NoSuchDriverException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpiceJet {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		try {
			driver.get("https://www.spicejet.com/");
			driver.manage().window().maximize();
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Flights']")));
			
			
		}catch(Exception e) {
			 System.out.println("Error occurred: " + e.getMessage());
		}finally {
			driver.quit();
		}
		

	}

}
