package demopack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoCheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Testing\\Selenium Automation Testing\\Browser drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://krninformatix.com/sample.html");
		
		boolean chkboxstatus =  driver.findElement(By.id("rem")).isSelected();
		System.out.println(chkboxstatus);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("rem")).click();
		
		boolean chkboxstatus1 =  driver.findElement(By.id("rem")).isSelected();
		System.out.println(chkboxstatus1);

		Thread.sleep(3000);
		
		driver.findElement(By.id("rem")).click();
		
		boolean chkboxstatus2 =  driver.findElement(By.id("rem")).isSelected();
		System.out.println(chkboxstatus2);
		
		if(!chkboxstatus) {
			driver.findElement(By.id("rem")).click();
		}

	}

}
