package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class HandleFrame extends BaseClass{
	private static WebDriverWait wait;
	public static void frame(String frameIdOrName) {
		
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		WebDriver frameDriver=wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIdOrName));
		frameDriver.switchTo().frame(frameIdOrName);
		
	}
	
	public static void frame(int index) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		WebDriver frameDriver=wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
		frameDriver.switchTo().frame(index);
	}
	
	public static void frame(WebElement wb) {
		wait=new WebDriverWait (driver,Duration.ofSeconds(30));
		WebDriver frameDriver=wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(wb));
		frameDriver.switchTo().frame(wb);
	
		
	}
	
	public static void defaultContent() {
		
		driver.switchTo().defaultContent();
	}
	
	public static void switchToParent() {
		
		driver.switchTo().parentFrame();
	}
}
