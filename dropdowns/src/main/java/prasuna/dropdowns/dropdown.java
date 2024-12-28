package prasuna.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\Users\prasu\Downloads\chrome-win64.zip\chrome-win64.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?entry-point=login");
		Thread.sleep(6000);
		driver.findElement(By.xpath(null)).click();
		Thread.sleep(9000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("first name")).sendKeys("prasuna");
		driver.findElement(By.name("last name")).sendKeys("Latika");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		Thread.sleep(5000);
		driver.close();
		driver.getCurrentUrl();
	}

}


