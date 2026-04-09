package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Google {

	public static void main(String[] args)  {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("APjFqb")).sendKeys("cric");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		List<WebElement> lst = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@role='listbox']/li")));
				
				//driver.findElements(By.className("G43f7e"));
		
		for(WebElement item:lst) {
			System.out.println("In For loop");
			String text = item.getText().trim();
			System.out.println(text);
			if(text.equalsIgnoreCase("cricbuzz")) {
				item.click();
				break;
			}
		}
		

	}

}
