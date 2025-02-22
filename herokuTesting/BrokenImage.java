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

public class BrokenImage {
	public static void main(String[] args) throws InterruptedException {

		// Add/Remove Element
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		// Broken Image
		driver.findElement(By.linkText("Broken Images")).click();
		Thread.sleep(2000);
		List<WebElement> images = driver.findElements(By.tagName("img"));

		boolean foundBrokenImage = false; // Flag untuk deteksi gambar rusak

		for (WebElement img : images) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			boolean isImageLoaded = (boolean) js
					.executeScript("return arguments[0].complete && arguments[0].naturalWidth > 0", img);

			if (!isImageLoaded) {
				System.out.println("Broken image ditemukan: ");
				foundBrokenImage = true;
			} else {
				System.out.println("Gambar ditemukan: ");
			}
		}
		Thread.sleep(2000);
		driver.navigate().back();

	}
}
