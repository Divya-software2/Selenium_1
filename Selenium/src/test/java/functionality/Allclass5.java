package functionality;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import object_repository.Element;

public class Allclass5 {
    @Test
	public void class1() throws AWTException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","d:\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		d1.get("https://ksrtc.in/oprs-web/user/add.do");
		d1.manage().window().maximize();
		Element.email(d1).sendKeys("mass4302@gmail.com");
		Element.fullname(d1).sendKeys("Divyajaline");
		Element.mobile(d1).sendKeys("9151587963");
		Element.add(d1).click();
		Robot r1=new Robot();
		Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect=new Rectangle(dim);
		BufferedImage source=r1.createScreenCapture(rect);
		File destination=new File("D:\\Desktop\\report\\screen1.jpg");
		ImageIO.write(source, "png", destination);
		d1.close();
	}
    @Test
    public void class2() throws AWTException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","d:\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		d1.get("https://ksrtc.in/oprs-web/login/show.do");
		d1.manage().window().maximize();
		Element.username(d1).sendKeys("Divya");
		Element.password(d1).sendKeys("Surya@123");
		Element.login(d1).click();
		
		Robot r1=new Robot();
		Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect=new Rectangle(dim);
		BufferedImage source=r1.createScreenCapture(rect);
		File destination=new File("D:\\Desktop\\report\\screen2.jpg");
		ImageIO.write(source, "png", destination);
		d1.close();
	}
    @Test
    public void class3() throws AWTException, InterruptedException, IOException  
	{

		System.setProperty("webdriver.chrome.driver","d:\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		d1.get("https://ksrtc.in/oprs-web/");
		d1.manage().window().maximize();
		
		Element.from(d1).sendKeys("beng");
		Thread.sleep(1500);
		List<WebElement> list1 = d1.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
		for(WebElement ele1:list1) {
		if(ele1.getText().equalsIgnoreCase("BENGALURU")){
		ele1.click();
		break;
		}
		}
		Element.to(d1).sendKeys("hyd");
		Thread.sleep(1500);
		List<WebElement> list2 =d1.findElements(By.xpath("//*[@id=\"ui-id-2\"]/li"));
		for(WebElement ele2:list2) {
		if(ele2.getText().equalsIgnoreCase("HYDERABAD")){
		ele2.click();
		break;
		}
		}

		
		Element.departure(d1);
		Element.return1(d1);
		Element.search(d1).click();
		JavascriptExecutor jse1=(JavascriptExecutor) d1;
		jse1.executeScript("scroll(0,500)");
		Robot r1=new Robot();
		Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect=new Rectangle(dim);
		BufferedImage source=r1.createScreenCapture(rect);
		File destination=new File("D:\\Desktop\\report\\screen3.jpg");
		ImageIO.write(source, "png", destination);
		
	}
}
