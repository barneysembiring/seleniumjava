package automationTestingDPIA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		/**
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//waktu tunggu secara global
		driver.get("https://www.automationexercise.com/login");//get link web
		driver.findElement(By.name("email")).sendKeys("barneysembiring@gmail.com");//memasukkan nilai barneysembiring kedalam atribut nama
		driver.findElement(By.name("password")).sendKeys("root");
		driver.findElement(By.className("btn")).click();
		**/
		//System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		//
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");//get link web
		driver.findElement(By.id("inputUsername")).sendKeys("barney");
		driver.findElement(By.name("inputPassword")).sendKeys("admin");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("barney");//xpath menggunakan value unique
		//driver.findElement(By.xpath("//input[@placeholder='Name'][1]")).sendKeys("barney");//xpath menggunakan index
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("barney@gmail.com");
		driver.findElement(By.xpath("//form/input[@placeholder='Phone Number']")).sendKeys("085261213777");//mengambil dari parent ke child
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());//mengirimkan text 
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[@class='go-to-login-btn']")).click();
		Thread.sleep(1000);
	
		driver.findElement(By.id("inputUsername")).sendKeys("barney");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//span/input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//span/input[@id='chkboxTwo']")).click();
		driver.findElement(By.className("signInBtn")).click();
	
		
		//driver.findElement(By.className("logout-btn")).click();
	}

}
