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

public class ShiftingContent {
	public static void main(String[] args) throws InterruptedException {

		// Add/Remove Element
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		// Shifting Content
		driver.findElement(By.linkText("Shifting Content")).click();
		driver.findElement(By.linkText("Example 1: Menu Element")).click();
		driver.findElement(By.xpath("//a[preceding-sibling::code[text()='?mode=random']]")).click();
		driver.findElement(By.linkText("Portfolio")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("//a[preceding-sibling::code[text()='?pixel_shift=100']]")).click();
		driver.findElement(By.linkText("Gallery")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("//a[preceding-sibling::code[text()='?mode=random&pixel_shift=100']]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Home")).click();
		driver.findElement(By.linkText("Shifting Content")).click();
		driver.findElement(By.linkText("Example 2: An image")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//code[contains(text(), '?mode=random')]/following-sibling::a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//code[contains(text(), '?pixel_shift=100')]/following-sibling::a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//code[contains(text(), '?mode=random&pixel_shift=100')]/following-sibling::a"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//code[contains(text(), '?image_type=simple')]/following-sibling::a")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Example 3: List")).click();
		driver.navigate().back();

	}
}
