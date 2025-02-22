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

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {

		// Add/Remove Element
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		// Dropdown
		driver.findElement(By.linkText("Dropdown")).click();
		driver.findElement(By.id("dropdown")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select/option[@value='1']")).click();
		driver.findElement(By.id("dropdown")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("dropdown")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select/option[@value='2']")).click();
		driver.findElement(By.id("dropdown")).click();
		Thread.sleep(2000);
		driver.navigate().back();

	}
}
