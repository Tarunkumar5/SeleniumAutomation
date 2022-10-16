package demopack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoToolTip1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Testing\\Selenium Automation Testing\\Browser drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gsmarena.com/samsung-phones-9.php");
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		
		String toolTip = driver.findElement(By.xpath("//img[contains(@src,'samsung-galaxy-tab-active4-pro')]")).getAttribute("title");
		System.out.println(toolTip);

	}

}
