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

public class FloatingMenu {
	public static void main(String[] args) throws InterruptedException {

		// Add/Remove Element
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		// Floating Menu
		driver.findElement(By.linkText("Floating Menu")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.linkText("Home")).click();
		driver.findElement(By.linkText("News")).click();
		driver.findElement(By.linkText("Contact")).click();
		driver.findElement(By.linkText("About")).click();
	}
}
