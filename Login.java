package demopack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Testing\\Selenium Automation Testing\\Browser drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com");

		WebElement un = driver.findElement(By.id("username"));
		un.sendKeys("admin");

		WebElement pw = driver.findElement(By.name("pwd"));
		pw.sendKeys("manager");

		WebElement logbut = driver.findElement(By.id("loginButton"));
		logbut.click();

		Thread.sleep(10000);

		WebElement logout = driver.findElement(By.id("logoutLink"));
		logout.click();
	}

}
