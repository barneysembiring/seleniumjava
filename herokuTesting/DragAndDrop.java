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

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {

		// Add/Remove Element
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		// Drag and Drop
		driver.findElement(By.linkText("Drag and Drop")).click();
		Thread.sleep(2000);
		WebElement columnA = driver.findElement(By.id("column-a"));
		WebElement columnB = driver.findElement(By.id("column-b"));
		Actions actionss = new Actions(driver);
		actionss.clickAndHold(columnA).moveToElement(columnB).release().perform();
		Thread.sleep(2000);
		driver.navigate().back();

	}
}
