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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.annotations.VisibleForTesting;  

public class WYSIWYGEditor {
	public static void main(String[] args) throws InterruptedException {

		// Add/Remove Element
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("WYSIWYG Editor")).click();
		driver.findElement(By.xpath("//div[@aria-label='Close']//*[name()='svg']")).click();
		
		WebElement iframe = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(iframe);
		
		WebElement editorBody = driver.findElement(By.tagName("body"));
		String editorText = editorBody.getText();
		
		System.out.println("Teks di editor: " + editorText);
		
	}
}
