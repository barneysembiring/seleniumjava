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

public class ContextMenu {
	public static void main(String[] args) throws InterruptedException {

		// Add/Remove Element
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		// Context Menu
		driver.findElement(By.linkText("Context Menu")).click();
		Thread.sleep(2000);
		// driver.findElement(By.id("hot-spot")).click();
		WebElement element = driver.findElement(By.id("hot-spot"));
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();
		System.out.println("Alert text: " + alert.getText());
		alert.accept();
		driver.findElement(By.id("hot-spot")).click();
		Thread.sleep(2000);
		driver.navigate().back();

	}
}
