package demopack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DemoIE {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Testing\\Selenium Automation Testing\\Browser drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();

	}

}
