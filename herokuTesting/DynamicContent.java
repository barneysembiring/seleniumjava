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

public class DynamicContent {
	public static void main(String[] args) throws InterruptedException {

		// Add/Remove Element
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		// Dynamic Content
		driver.findElement(By.linkText("Dynamic Content")).click();
		driver.findElement(By.linkText("click here")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.className("large-10")).getText());
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().back();
	}
}
