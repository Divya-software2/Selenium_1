package object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Element {

	public static WebElement username(WebDriver d1) {
		return d1.findElement(By.id("userName"));
	}

	public static WebElement password(WebDriver d1) {
		return d1.findElement(By.id("password"));
	}

	public static WebElement login(WebDriver d1) {
		 return d1.findElement(By.xpath("//*[@id=\"submitBtn\"]"));
	}

	public static WebElement email(WebDriver d1) {
		return d1.findElement(By.id("email"));
	}

	public static WebElement fullname(WebDriver d1) {
		return d1.findElement(By.id("fullName"));
	}

	public static WebElement mobile(WebDriver d1) {
		return d1.findElement(By.id("mobileNo"));
	}

	public static WebElement add(WebDriver d1) {
		return d1.findElement(By.xpath("//*[@id=\"userProfileForm\"]/div/div/div/div/div/div[5]/input"));
	}

	public static WebElement from(WebDriver d1) {
		return d1.findElement(By.id("fromPlaceName"));
	}

	public static WebElement to(WebDriver d1) {
		return d1.findElement(By.id("toPlaceName"));
	}

	public static WebElement departure(WebDriver d1) {
		JavascriptExecutor jse=(JavascriptExecutor) d1;
		return (WebElement)jse.executeScript("document.getElementById('txtJourneyDate').value='17/01/2022'");
		
	}

	public static WebElement return1(WebDriver d1) {
		JavascriptExecutor jse=(JavascriptExecutor) d1;
		return (WebElement)jse.executeScript("document.getElementById('txtReturnJourneyDate').value='23/01/2022'");
		
	}

	public static WebElement search(WebDriver d1) {
		return d1.findElement(By.xpath("/html/body/main/form/div[1]/div/div[2]/div[3]/button"));
	}


}
