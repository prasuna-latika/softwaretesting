package chrome.run;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prasunnalaunch {
	public static void main(String[] args) throws InterruptedException {
		
	
	//System.setProperty("webdriver.chrome.driver","C:\Users\prasu\Downloads\chrome-win64.zip\chrome-win64.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.makemytrip.com/");
			Thread.sleep(40000);
			driver.manage().window().maximize();
			Thread.sleep(30000);
			driver.manage().window().minimize();
			Thread.sleep(50000);
			driver.close();
			driver.getCurrentUrl();

}
}
