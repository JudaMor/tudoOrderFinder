package myFirstSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class groo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\dudia\\Downloads\\automition2\\drivers\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://vendors.groo.co.il/login");
     Thread.sleep(10000);
     driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/form/input[2]")).sendKeys("adi@tudo.co.il");
     Thread.sleep(5000);
     driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/form/input[3]")).sendKeys("Tudo65326532");
     Thread.sleep(5000);
     driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/form/input[4]")).click();
     }
	//מה לבחור בתוך האתר

}
