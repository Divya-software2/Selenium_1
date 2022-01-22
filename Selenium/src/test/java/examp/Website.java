package examp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Website {

	@Test
	public void google()
	{
		System.setProperty("webdriver.chrome.driver","d:\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		d1.get("https://ksrtc.in/oprs-web/user/add.do");
		d1.manage().window().maximize();
	}
}
