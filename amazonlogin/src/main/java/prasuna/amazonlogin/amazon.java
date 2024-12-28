package prasuna.amazonlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\Users\prasu\Downloads\chrome-win64.zip\chrome-win64.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(10000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://facebook.com");
		//sendKeys-is to input the text in "username/password fields"
		driver.findElement(By.id("email")).sendKeys("latikaprasuna@gmail.com");
		Thread.sleep(10000);
		driver.findElement(By.name("pass")).sendKeys("suryapranav");
		Thread.sleep(10000);
		//click is to perform action on "buttons"
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		driver.get("https://www.amazon.in");
		driver.findElement(null);
		driver.findElement(By.id("Create Account Submit")).click();
		WebElement YourName = driver.findElement(By.xpath("WebElement YourName = driver.findElement(null)"));
		Thread.sleep(5000);
		YourName.sendKeys("Prasuna");
		Thread.sleep(5000);
		YourName.clear();
		Thread.sleep(5000);
		YourName.sendKeys("nit");
		driver.manage().window().minimize();
		Thread.sleep(5000);
		driver.close();
		driver.getCurrentUrl();
	}

}
