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
import org.junit.Assert;


public class Typos {
	public static void main(String[] args) throws InterruptedException {

		// Add/Remove Element
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Typos")).click();
		WebElement text =driver.findElement(By.xpath("//p[2]"));
		String actualText = text.getText();
		if (actualText.contains("Sometimes you'll see a typo, other times you won't.")){
			System.out.println("Tidak memiliki typo, test sukses");
		}else {
			System.out.println("Terdapat typo, test gagal");
		}
		
		//driver.navigate().refresh();

	}
}
