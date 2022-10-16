package demopack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoAllLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Testing\\Selenium Automation Testing\\Browser drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://krninformatix.com/");
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));

		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		int size = allLinks.size();

		for (int i = 0; i < size; i++) {
			WebElement links = allLinks.get(i);
			String te = links.getText();
			System.out.println(te);
		}

	}

}
