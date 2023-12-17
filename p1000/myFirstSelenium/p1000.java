package myFirstSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1000 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\dudia\\Downloads\\automition2\\drivers\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://media.p1000.co.il/production/Suppliers/");
   Thread.sleep(10000);
   driver.findElement(By.xpath("/html/body/form/div[3]/table/tbody/tr/td/table/tbody/tr[2]/td[2]/input")).sendKeys("tudo123");
   Thread.sleep(5000);
   driver.findElement(By.xpath("/html/body/form/div[3]/table/tbody/tr/td/table/tbody/tr[3]/td[2]/input")).sendKeys("Tudo996633");
  // Thread.sleep(5000);
   //driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/div/span/div[3]/div")).click();
   // בעיית קאפצה
   Thread.sleep(5000);
   driver.findElement(By.xpath("/html/body/form/div[3]/table/tbody/tr/td/table/tbody/tr[4]/td/input")).click();
   Thread.sleep(5000);
   driver.findElement(By.xpath("/html/body/form/div[3]/div/table/tbody/tr/td[1]/div/div/div/div/table[2]/tbody/tr/td/div/a/span/span")).click();
   Thread.sleep(5000);
   driver.findElement(By.xpath("/html/body/form/div[3]/div/table/tbody/tr/td[1]/div/div/div/div/div[2]/div/table[1]/tbody/tr/td/div/a/span/span")).click();
   Thread.sleep(5000);
   driver.findElement(By.xpath("/html/body/form/div[3]/div/table/tbody/tr/td[3]/table/tbody/tr/td/div/div[2]/table[1]/tbody/tr/td[9]/i")).click();
   //הורדת אקסל מהזמנות חדשות אין פרטים כדי לבדוק האם זה עובד
	}

}
