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

public class DynamicControls {
	public static void main(String[] args) throws InterruptedException {

		// Add/Remove Element
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		// Dynamic Controls
		driver.findElement(By.linkText("Dynamic Controls")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form[@id='checkbox-example']/button")).click();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//form[@id='checkbox-example']/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkbox")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form[@id='input-example']/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form/input[@type='text']")).click();
		// driver.findElement(By.id("input-example")).sendKeys("this is desc");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//form/input[@type='text']")).sendKeys("this is description");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(2000);
	}
}
