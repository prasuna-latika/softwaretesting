package prasuna.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrollby {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\Users\prasu\Downloads\chrome-win64.zip\chrome-win64.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apple.com/in/");
		Thread.sleep(6000);
		Actions actions= new Actions(driver);
		actions.scrollByAmount(0,3000).perform();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(6000);
		driver.findElement(By.name("sex")).click();
		WebElement femaleRadioButton=driver.findElement(By.xpath("https://www.facebook.com/r.php?entry_point=login"));
		if(femaleRadioButton.isSelected()) {
			System.out.println("display female radio button is selected");
		}
		else
		{
			System.out.println("display male&custom radio buttons are selected");
		}
		driver.manage().window().minimize();
		Thread.sleep(5000);
		driver.close();
		driver.getCurrentUrl();
	}

}
