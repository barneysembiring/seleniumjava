package automationTestingDPIA;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GreenCart {
	public static void main(String[] args) throws InterruptedException{
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//mengambil elements menggunakan list dikarenakan cssSelector lebih dari 1
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		String[] nama_item = {"Brocolli", "Cucumber", "Brinjal", "Capsicum", "Musk Melon", "Cashews"};
		int j = 0;
		
		for(int i=0; i < products.size(); i++) { // memakai size dikarenakan products tipe array list
			//memvalidasi teks sampai menemukan teks yang di inginkan
			String nama_bahan = products.get(i).getText();//get(i) mengambil index setiap looping yang berjalan
			/**
			 * Dikarenakan teks pada web ada - 1kg, oleh maka itu kita harus mengeleminasi - 1kg
			 * Trim == spasi yang dihapus
			 * SPlit == teks yang dihapus
			 * */
			
			String[] nama_produk = nama_bahan.split("-");
			//dikarenakan tanda " - " dihapus
			//oleh maka itu, Brocolli menjadi index[0], 1 Kg menjadi index[1]
			String nama_produk_fix = nama_produk[0].trim();
			
			List<String> listItem = Arrays.asList(nama_item);
			
			if(listItem.contains(nama_produk_fix)) {
				//klik add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				j++;
			}
			//dikarenakan untuk menghemat memory kita membuat variabel j agar di break
			// setelah mendapatkan nama_bahan yang di pilih/di inginkan
			if(j==listItem.size()) {
				break;
			}
			
		}
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		driver.findElement(By.xpath("//div[@class='action-block']/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("promoBtn")).click();
		System.out.println(driver.findElement(By.className("promoInfo")).getText());
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
//		driver.findElement(By.xpath("//select[@style='width: 200px;']")).sendKeys("indo");
//		driver.findElement(By.xpath("//select[@style='width: 200px;']")).click();
	
		//Untuk Select
		WebElement selectElement = driver.findElement(By.tagName("select"));
		Select select = new Select (selectElement);
		select.selectByValue("Indonesia");
		Thread.sleep(1500);
		
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		//driver.quit();
	}
}
