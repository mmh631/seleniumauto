package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// 1. Setup Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
	// 2. Initilize Chrome Driver 
		 WebDriver  browserObject = new ChromeDriver();
		 
	// 3. Open 
		 browserObject.get("https://admin-demo.nopcommerce.com/login");
		 WebElement storeEmail = browserObject.findElement(By.id("Email"));
		 
		 storeEmail.clear();
		 
	// Find the web element tag
		 storeEmail.sendKeys("admin@yourstore.com");
		 
		// --doing it step-by-step browserObject.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
	// Pass
		browserObject.findElement(By.name("Password")).clear();
		
		browserObject.findElement(By.name("Password")).sendKeys("admin");
	//Login 
		browserObject.findElement(By.className("login-button")).submit();
		
	}

}
