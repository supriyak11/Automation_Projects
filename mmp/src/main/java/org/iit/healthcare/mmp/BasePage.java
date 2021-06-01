package org.iit.healthcare.mmp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	
	protected static WebDriver driver;

	public static void SetWebdriver() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");
		// driver.get("https://demo.openmrs.org/openmrs/login.htm");
		Thread.sleep(3000);
	}

	static void loginMMP(WebDriver driver) {

		WebElement uId = driver.findElement(By.name("username"));
		uId.sendKeys("ria1");
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("Ria12345");
		WebElement btnLogin = driver.findElement(By.name("submit"));
		btnLogin.click();
	}

	static void loginMRS(WebDriver driver) {
		// System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver_win32\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		WebElement uId = driver.findElement(By.name("username"));
		uId.sendKeys("admin");
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("Admin123");

		WebElement btnLogin = driver.findElement(By.name("submit"));
		btnLogin.click();
	}

}
