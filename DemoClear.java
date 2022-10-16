package demopack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoClear {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Testing\\Selenium Automation Testing\\Browser drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement us = driver.findElement(By.id("username"));
		us.sendKeys("Tarun Kumar");

		Thread.sleep(3000);

		WebElement usclear = driver.findElement(By.id("username"));
		usclear.clear();

		WebElement us1 = driver.findElement(By.id("username"));
		us1.sendKeys("admin");

		WebElement pwd = driver.findElement(By.name("pwd"));
		pwd.sendKeys("manager");

		WebElement login = driver.findElement(By.id("loginButton"));
		login.click();

		Thread.sleep(8000);

		WebElement logout = driver.findElement(By.id("logoutLink"));
		logout.click();

	}

}
