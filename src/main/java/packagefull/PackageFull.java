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

	@BeforeClass(alwaysRun = true)
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
		 System.out.println("FirstPage is :"+driver.getTitle());

		driver.findElement(By.xpath("//span[contains(text(),'Hotels')]")).click();
		driver.findElement(By.xpath("//span[text()='Hotel']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter a Hotel Name or Destination']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter a Hotel Name or Destination']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter a Hotel Name or Destination']")).sendKeys("yyz");
		driver.findElement(By.xpath("//span[contains(text(),'Toronto, ON, Canada (YYZ-Pearson Intl.) ')]")).click();

		driver.findElement(By.xpath("//div[@date='2022-02-14']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Move forward to switch to the next month.']")).click();
		driver.findElement(By.xpath("//div[@date='2022-02-28']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Done')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		isElementPresent(By.linkText("Themes/Types"));
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
		isElementPresent(By.xpath("//div[6]/div/div/input"));
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
		Thread.sleep(3000);

		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].scrollIntoView(true);");
		 */
		/*
		 * WebElement card
		 * =driver.findElement(By.xpath("//div[@class='_3-zL border-global']")); String
		 * print = card.getText(); System.out.println("Text: "+print);
		 */
		/*
		 * Alert alert = driver.switchTo().alert();
		 * 
		 * // Capturing alert message. String alertMessage=
		 * driver.switchTo().alert().getText();
		 * 
		 * // Displaying alert message System.out.println(alertMessage);
		 * Thread.sleep(5000);
		 */
		// Switch to new window opened

		/*
		 * for(String winHandle : driver.getWindowHandles()){
		 * driver.switchTo().window(winHandle);
		 * 
		 * System.out.println("Text: "+driver.getCurrentUrl()); }
		 * 
		 * int scroll=0; do { try {
		 * 
		 * WebElement elem = driver.findElement(By.
		 * xpath("//main[@class='h100 fb-wrap-content-padding auto-overflow']"));
		 * elem.click(); elem.sendKeys(Keys.PAGE_DOWN);
		 * 
		 * WebDriverWait wait = new WebDriverWait(driver, 5);
		 * wait.until(ExpectedConditions.elementToBeClickable(By.
		 * xpath("//div[@class='_3-zL border-global']"))); break; } catch(Exception e) {
		 * 
		 * } WebElement elem =driver.findElement(By.xpath("//div[@class='box-title']"));
		 * elem.click(); elem.sendKeys(Keys.PAGE_DOWN); scroll++; } while (scroll<6);
		 */
		// get the current window handle
		
		/*
		 * for (String handle: driver.getWindowHandles()) { if
		 * (!parentHandle.equals(handle)) driver.switchTo().window(handle); }
		 */
		/*
		 * Set <String> handles =driver.getWindowHandles(); Iterator<String> it =
		 * handles.iterator(); //iterate through your windows while (it.hasNext()){
		 * String parent = it.next(); String newwin = it.next();
		 * driver.switchTo().window(newwin); }
		 */
driver.getWindowHandles().size();
driver.switchTo().window[3];
		
		 System.out.println("SecondPage is :"+ driver.getTitle());
	/*	driver.findElement(By.xpath("//div[@class='_3-zL border-global']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Card Number']")).sendKeys("4111 1111 1111 1111 111");
		driver.findElement(By.xpath("//div[@class='_3cLE  border-global xs-form-ctrl on-focus']")).sendKeys("1026");
		driver.findElement(By.xpath("//input[@placeholder='CVV']")).sendKeys("123");
		driver.findElement(By.xpath("(//button[@class='btn btn-primary w100 pos-r _2fNU   '])[2]")).click();
		driver.findElement(By.xpath("//button[@onclick='submitSuccess()']"));
		// ERROR: Caught exception [unknown command []]
		// ERROR: Caught exception [unknown command []]
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		// driver.quit();
		/*
		 * String verificationErrorString = verificationErrors.toString(); if
		 * (!"".equals(verificationErrorString)) { fail(verificationErrorString);
		 */
	}
//  }

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	/*
	 * private boolean isAlertPresent() { try { driver.switchTo().alert(); return
	 * true; } catch (NoAlertPresentException e) { return false; } }
	 */

	/*
	 * private String closeAlertAndGetItsText() { try { Alert alert =
	 * driver.switchTo().alert(); String alertText = alert.getText(); if
	 * (acceptNextAlert) { alert.accept(); } else { alert.dismiss(); } return
	 * alertText; } finally { acceptNextAlert = true; }
	 */

}