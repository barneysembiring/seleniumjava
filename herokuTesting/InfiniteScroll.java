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

public class InfiniteScroll {
	public static void main(String[] args) throws InterruptedException {

		// Add/Remove Element
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Infinite Scroll")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		for(int i = 0; i < 10; i++) {
			js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
			try {
				Thread.sleep(2000);
			}catch (InterruptedException e) {
                e.printStackTrace();
            }
		}
	}
}
