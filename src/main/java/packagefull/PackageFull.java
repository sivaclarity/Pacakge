package packagefull;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PackageFull {
	public WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private JavascriptExecutor js;

	//@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		baseUrl = "https://www.google.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		js = (JavascriptExecutor) driver;
	}

	@Test
	public void testUntitledTestCase() throws Exception {
		driver.get("https://b2cui2.tltid.com/pa");
		driver.manage().window().maximize();
		String parentHandle = driver.getWindowHandle();
		System.out.println("FirstPage is :" + driver.getTitle());

		driver.findElement(By.xpath("//span[contains(text(),'Hotels')]")).click();
		driver.findElement(By.xpath("//span[text()='Hotel']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter a Hotel Name or Destination']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter a Hotel Name or Destination']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter a Hotel Name or Destination']")).sendKeys("yyz");
		driver.findElement(By.xpath("//span[contains(text(),'Toronto, ON, Canada (YYZ-Pearson Intl.) ')]")).click();

		driver.findElement(By.xpath("//div[@date='2022-02-14']")).click();
		// driver.findElement(By.xpath("//button[@aria-label='Move forward to switch to
		// the next month.']")).click();
		driver.findElement(By.xpath("//div[@date='2022-02-28']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Done')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		WebDriverWait waits = new WebDriverWait(driver, 30);
		waits.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Themes/Types")));
		driver.findElement(By.xpath("//*/text()[normalize-space(.)='Free breakfast']/parent::*")).click();
		driver.findElement(By.xpath("//div[3]/div/div/div[2]/div/fieldset[4]/div/div/label")).click();
		driver.findElement(By.xpath("//div[7]/fieldset/div/div/label")).click();
		driver.findElement(By.linkText("Themes/Types")).click();
		driver.findElement(By.xpath("//div[9]/div[2]/fieldset[2]/div/div/label")).click();
		driver.findElement(By.xpath("//div[8]/div/div/div[2]/div/div/div[3]/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Book Now']")).click();
		driver.findElement(By.xpath("//input")).click();
		driver.findElement(By.xpath("//input")).clear();
		driver.findElement(By.xpath("//input")).sendKeys("siva");
		driver.findElement(By.xpath("//div[2]/div/div/input")).click();
		driver.findElement(By.xpath("//div[2]/div/div/input")).clear();
		driver.findElement(By.xpath("//div[2]/div/div/input")).sendKeys("ka");
		driver.findElement(By.xpath("//input[@type='tel']")).click();
		driver.findElement(By.xpath("//input[@type='tel']")).clear();
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8838737525");
		driver.findElement(By.xpath("//fieldset/div/div/div[2]/label")).click();
		driver.findElement(By.xpath("//div[3]/div/div/div/div/input")).click();
		driver.findElement(By.xpath("//div[3]/div/div/div/div/input")).clear();
		driver.findElement(By.xpath("//div[3]/div/div/div/div/input")).sendKeys("siva@gmail.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[6]/div/div/input")));
		driver.findElement(By.xpath("//div[2]/div/div/input")).click();
		driver.findElement(By.xpath("//div[2]/div/div/input")).clear();
		driver.findElement(By.xpath("//div[2]/div/div/input")).sendKeys("155");
		driver.findElement(By.xpath("//div[@class='multiselect__tags']")).click();
		driver.findElement(By.xpath("//span[text()='Afghanistan']")).click();
		driver.findElement(By.xpath("(//input[@class='form-control'])[5]")).clear();
		driver.findElement(By.xpath("(//input[@class='form-control'])[5]")).sendKeys("605004");
		driver.findElement(By.xpath("(//div[@class='multiselect__tags'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Badakhshan']")).click();
		driver.findElement(By.xpath("//div[6]/div/div/input")).clear();
		driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("pondy");
		driver.findElement(By.xpath("//div[@class='custom-control custom-checkbox']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//driver.quit();
	}
	@AfterClass(alwaysRun = true)
	
	public void close()
	{
		driver.quit();
	}
}
