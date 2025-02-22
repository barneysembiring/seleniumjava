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

public class HorizontalSlider {
	public static void main(String[] args) throws InterruptedException {

		// Add/Remove Element
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		// Horizontal Slider
		driver.findElement(By.linkText("Horizontal Slider")).click();
		WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));
		for (int i = 0; i < 7; i++) {
			slider.sendKeys(Keys.ARROW_RIGHT);
			Thread.sleep(500);
		}

		WebElement sliderValue = driver.findElement(By.id("range"));
	}
}
