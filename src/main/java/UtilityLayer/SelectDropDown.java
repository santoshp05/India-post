package UtilityLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class SelectDropDown extends BaseClass{
	
	public static void selectByVisibleText(WebElement wb,String value) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement wb1=wait.until(ExpectedConditions.visibilityOf(wb));
		
		Select sel= new Select(wb1);
		sel.selectByVisibleText(value);
	}
	public static void selectByValue(WebElement wb,String value) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement wb1=wait.until(ExpectedConditions.visibilityOf(wb));
		
		Select sel= new Select(wb1);
		sel.selectByValue(value);
		
	}
	public static void selectByIndex(WebElement wb,int Index) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement wb1=wait.until(ExpectedConditions.visibilityOf(wb));
		
		Select sel= new Select(wb1);
		sel.selectByIndex(Index);
	}
	
	public static void getOptions(WebElement wb) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement wb1=wait.until(ExpectedConditions.visibilityOf(wb));
		
		Select sel= new Select(wb1);
		List<WebElement>ls=sel.getOptions();
		
		for(WebElement allList:ls) {
			System.out.println(allList.getText());
		}
	}
	
	public static int size(WebElement wb) {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			WebElement wb1=wait.until(ExpectedConditions.visibilityOf(wb));
			
			Select sel= new Select(wb1);
			return sel.getOptions().size();
					
	}
	
	public static String getSelectedOption(WebElement wb) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement wb1=wait.until(ExpectedConditions.visibilityOf(wb));
		
		Select sel= new Select(wb1);
		return sel.getFirstSelectedOption().getText();
	}
	
}
