package myFirstSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lastprice {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\dudia\\Downloads\\automition2\\drivers\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.lastprice.co.il/Marketplace/Login");
   Thread.sleep(10000);
   driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[1]/div/form/div[1]/input")).sendKeys("tudo");
   Thread.sleep(5000);
   driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[1]/div/form/div[2]/input")).sendKeys("TUD@@@9050");
   Thread.sleep(5000);
   driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[1]/div/form/input[2]")).click();
   Thread.sleep(5000);
   driver.findElement(By.xpath("/html/body/div/ul/li[3]/a/span")).click();
   Thread.sleep(5000);
   driver.findElement(By.xpath("/html/body/div/ul/li[3]/div/div/a[1]")).click();
   Thread.sleep(5000);
   driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div[4]/div[1]/div/a")).click();
   //מתוך השורות לטיפול שליחת קובץ אקסל לא ניתן לבדיקה אין נתונים קובץ פגום
	}
	
	

}
