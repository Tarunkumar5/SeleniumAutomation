package demopack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoRadio {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Testing\\Selenium Automation Testing\\Browser drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://krninformatix.com/sample.html");

		boolean radiostatus = driver.findElement(By.id("female")).isSelected();
		System.out.println(radiostatus);

		Thread.sleep(3000);

		driver.findElement(By.id("female")).click();

		boolean radiostatus1 = driver.findElement(By.id("female")).isSelected();
		System.out.println(radiostatus1);

		Thread.sleep(3000);

		driver.findElement(By.id("female")).click();

		boolean radiostatus2 = driver.findElement(By.id("female")).isSelected();
		System.out.println(radiostatus2);

	}

}
