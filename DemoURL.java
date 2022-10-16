package demopack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoURL {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Testing\\Selenium Automation Testing\\Browser drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://demo.actitime.com/");

		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		Thread.sleep(10000);

		String expectedURL = "https://demo.actitime.com/user/submit_tt.do";
		String actualURL = driver.getCurrentUrl();

		if (actualURL.equals(expectedURL)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}
}
