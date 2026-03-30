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
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr"));
		
		for(WebElement item:list) {
			if(item.getText().contains("Jordan.Mathews")) {
				String details = item.getText();
				String[] role = details.split(" ");
				System.out.println(Arrays.toString(role));
				System.out.println(role[0] + role[1]);
			}
		}

	}

}
