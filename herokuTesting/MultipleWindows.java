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

public class MultipleWindows {
	public static void main(String[] args) throws InterruptedException {

		// Add/Remove Element
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		// Multiple Windows
		driver.findElement(By.linkText("Multiple Windows")).click();
		String windowPertama = driver.getWindowHandle();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> allWindows = driver.getWindowHandles();
		String windowKedua = "";
		for (String windowHandle : allWindows) {
			if (!windowHandle.equals(windowPertama)) {
				windowKedua = windowHandle;
				break;
			}
		}
		driver.switchTo().window(windowKedua);
		WebElement newWindow = driver.findElement(By.className("example"));
		System.out.println("berikut adalah " + newWindow.getText());

	}
}
