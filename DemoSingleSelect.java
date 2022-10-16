package demopack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoSingleSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Testing\\Selenium Automation Testing\\Browser drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/sample.html");
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		
		WebElement singleselect = driver.findElement(By.id("city"));
		Select dd = new Select(singleselect);
		dd.selectByIndex(2);
		
		Thread.sleep(3000);
		
		dd.selectByValue("4");
		
		Thread.sleep(3000);
		
		dd.selectByVisibleText("Chennai");
		
		List<WebElement> allOptions = dd.getOptions();
		for(int i=0;i<4;i++) {
			WebElement option = allOptions.get(i);
			String te = option.getText();
			System.out.println(te);
		}

	}

}
