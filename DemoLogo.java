package demopack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoLogo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Testing\\Selenium Automation Testing\\Browser drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		boolean logostatus =  driver.findElement(By.xpath("//div[@class='atLogoImg']")).isDisplayed();
		System.out.println(logostatus);

	}

}
