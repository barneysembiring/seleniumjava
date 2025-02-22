package herokuTesting;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import com.google.common.annotations.VisibleForTesting;

public class StatusCodes {
	public static void main(String[] args) throws InterruptedException {

		// Add/Remove Element
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Status Codes")).click();
		
		List<WebElement> statusLinks = driver.findElements(By.cssSelector("ul > li > a"));
		
		for (WebElement link : statusLinks) {
			String statusCode = link.getText();
			System.out.println("Mengakses Status Code: " + statusCode);
			
			link.click();
			
			WebElement message = driver.findElement(By.tagName("p"));
			System.out.println("Berhasil: " + message.getText());
			
			driver.findElement(By.linkText("here")).click();
			
			statusLinks = driver.findElements(By.cssSelector("ul > li > a"));
		}
	}
}
