package demopack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoAllCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Testing\\Selenium Automation Testing\\Browser drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://krninformatix.com/learn.html");
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));

		List<WebElement> allCheckBoxes = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));

		int size = allCheckBoxes.size();

		for (int i = 0; i < size; i++) {
			WebElement check = allCheckBoxes.get(i);
			check.click();
			Thread.sleep(1000);
		}

	}

}
