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

public class FormAuthentication {
	public static void main(String[] args) throws InterruptedException {

		// Add/Remove Element
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		// Form Authentication
		driver.findElement(By.linkText("Form Authentication")).click();
		driver.findElement(By.name("username")).sendKeys("tomsmith");
		driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//button[@class='radius']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();

	}
}
