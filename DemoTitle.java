package demopack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Testing\\Selenium Automation Testing\\Browser drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://demo.actitime.com/");

		String expectedTitle = "actiTIME - Login";

		String actualTitle = driver.getTitle();

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

	}

}
