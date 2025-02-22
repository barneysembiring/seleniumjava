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

public class FileDownloader {
	public static void main(String[] args) throws InterruptedException {

		// Add/Remove Element
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		// File Downloader
		driver.findElement(By.linkText("File Download")).click();
		driver.findElement(By.xpath("//a[@href='download/myfile.pdf']")).click();
		WebElement downloadLink = driver
				.findElement(By.xpath("//a[contains(@href, 'download/7d2c5299e08a3426d5a9d62cfd8d285a1c7cb0d7')]"));
		downloadLink.click();
		Thread.sleep(5000);
		System.out.println("Download selesai!");
		driver.navigate().back();
	}
}
