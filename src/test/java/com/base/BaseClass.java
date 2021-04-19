package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
/*import org.openqa.selenium.Alert;*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;

	public void getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Revanth\\workspace\\SPEEDSpa1\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	public void loadUrl(String data) {
		driver.get(data);
	}

	public static void insert(WebElement e, String value) {
		e.sendKeys(value);

	}

	public static void btnClick(WebElement element) {

		element.click();
	}
	public static void clickByJs(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);

	}
	/*public static void insertJs(WebElement element, String name) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','name')", element);

	}*/
	public static void selectBYVissibleText(WebElement element, String data) {
		Select select = new Select(element);
		select.selectByVisibleText(data);

	}
	public static void drop_downText(By by, String text) throws Throwable {
		 WebElement ele = driver.findElement(by);
		 Select s = new Select(ele);
		 s.selectByVisibleText(text);
	}
	public void moveToElementAndClick(By by) {
        Actions action=new Actions(driver);
        action.moveToElement(driver.findElement(by)).click().perform();
        //logger.info("*****Element :" + by.toString() + " clicked using actions class*****");
    }
	
	/*public static void btnalert(WebElement web) {
		Alert a = driver.switchTo().alert();
		a.accept();
	}*/

}
