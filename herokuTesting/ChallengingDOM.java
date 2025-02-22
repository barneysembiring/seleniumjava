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

import com.google.common.annotations.VisibleForTesting;

public class ChallengingDOM {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Challenging DOM")).click();
		Thread.sleep(1500);
		driver.findElement(By.className("button")).click();		
		Thread.sleep(1500);
		driver.findElement(By.className("alert")).click();
		Thread.sleep(1500);
		driver.findElement(By.className("success")).click();
		Thread.sleep(1500);
		driver.findElement(By.linkText("edit")).click();
		Thread.sleep(1500);
		driver.findElement(By.linkText("delete")).click();
	}
}
