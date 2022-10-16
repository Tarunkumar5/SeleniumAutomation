package demopack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Testing\\Selenium Automation Testing\\Browser drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.actitime.com/");
		
		WebElement un = driver.findElement(By.id("username"));
		un.sendKeys("admin");
		
		WebElement pwd =  driver.findElement(By.name("pwd"));
		pwd.sendKeys("manager");
		
		WebElement login = driver.findElement(By.id("loginButton"));
		login.click();
		
		Thread.sleep(10000);
		
		String expectedText = "Enter Time-Track";
		
		String actualText = driver.findElement(By.xpath("(//td[@class='pagetitle'])[1]")).getText();
		
		if(actualText.equals(expectedText)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}

}
