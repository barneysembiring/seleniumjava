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

public class JavaScriptAlert {
	public static void main(String[] args) throws InterruptedException {

		// Add/Remove Element
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		// Javascript Alert
		driver.findElement(By.linkText("JavaScript Alerts")).click();
		driver.findElement(By.xpath("//li/button[@onclick='jsAlert()']")).click();
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert1.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li/button[@onclick='jsConfirm()']")).click();
		Thread.sleep(2000);
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert2.accept();
		driver.findElement(By.xpath("//li/button[@onclick='jsPrompt()']")).click();
		Thread.sleep(2000);
		Alert alert3 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert3.sendKeys("barney sembiring");
		alert3.accept();

	}
}
