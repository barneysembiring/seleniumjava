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

public class JQUeryUIMenus {
	public static void main(String[] args) throws InterruptedException {

		// Add/Remove Element
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		// JQuery UI Menus
		driver.findElement(By.linkText("JQuery UI Menus")).click();
		driver.findElement(By.id("ui-id-3")).click();
		driver.findElement(By.linkText("Downloads")).click();
		driver.findElement(By.linkText("PDF")).click();
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(2000);
		driver.findElement(By.linkText("Enabled")).click();
		driver.findElement(By.linkText("Back to JQuery UI")).click();

	}
}
