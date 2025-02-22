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

public class Frames {
	public static void main(String[] args) throws InterruptedException {

		// Add/Remove Element
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");

		// Frames
		driver.findElement(By.linkText("Frames")).click();
		driver.findElement(By.linkText("Nested Frames")).click();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-left");
		WebElement leftText = driver.findElement(By.tagName("body"));
		System.out.println("This is: " + leftText.getText());
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame-middle");
		WebElement middleText = driver.findElement(By.tagName("div"));
		System.out.println("This is: " + middleText.getText());
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame-right");
		WebElement rightText = driver.findElement(By.tagName("body"));
		System.out.println("This is: " + rightText.getText());
		driver.switchTo().defaultContent();
	}
}
