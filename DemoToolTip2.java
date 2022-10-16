package demopack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoToolTip2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Testing\\Selenium Automation Testing\\Browser drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.samsung.com/in/refrigerators/french-door/bespoke-rf90a92w3-936l-white-rf90a92w3ap-tl/");
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		
		String ToolTip = driver.findElement(By.xpath("//span[@class='pd-info__sku-layer']")).getText();
		System.out.println(ToolTip);

	}

}
