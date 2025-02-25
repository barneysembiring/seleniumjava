package automationTestingDPIA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class formtest {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.id("firstName")).sendKeys("barney");
		driver.findElement(By.id("lastName")).sendKeys("sembiring");
		driver.findElement(By.id("userEmail")).sendKeys("barneysembiring@gmail.com");
		driver.findElement(By.xpath("//label[.='Male']")).click();
		driver.findElement(By.cssSelector("input[placeholder='Mobile Number']")).sendKeys("1234567890");
		//driver.findElement(By.id("dateOfBirthInput")).sendKeys("01 Jan 2025");
		driver.findElement(By.id("dateOfBirthInput")).click();
		driver.findElement(By.xpath("//div[@aria-label='Choose Wednesday, January 1st, 2025']")).click();
		driver.findElement(By.xpath("//input[@id='subjectsInput']")).sendKeys("This is subject");
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']")).click();
		driver.findElement(By.id("uploadPicture")).sendKeys("F:\\Pict\\download.jpeg");
		driver.findElement(By.id("currentAddress")).sendKeys("Central Jakarta, Jakarta");
		
	}

}
