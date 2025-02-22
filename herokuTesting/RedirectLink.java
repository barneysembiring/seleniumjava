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

public class RedirectLink {
	public static void main(String[] args) throws InterruptedException {

		// Add/Remove Element
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		// Redirect Link
		driver.findElement(By.linkText("Redirect Link")).click();
		driver.findElement(By.linkText("here")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(2000);

		driver.findElement(By.linkText("200")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(2000);
		driver.findElement(By.linkText("here")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(2000);
		driver.findElement(By.linkText("301")).click();
		driver.findElement(By.linkText("here")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(2000);
		driver.findElement(By.linkText("404")).click();
		driver.findElement(By.linkText("here")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(2000);
		driver.findElement(By.linkText("500")).click();
		driver.findElement(By.linkText("here")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(2000);
		driver.findElement(By.linkText("here")).click();

	}
}
