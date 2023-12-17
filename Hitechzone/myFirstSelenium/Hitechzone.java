package myFirstSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hitechzone {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\dudia\\Downloads\\automition2\\drivers\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://crm.htzone.co.il/RFL/Reffael.php");
         Thread.sleep(10000);
         driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr[1]/td[2]/input")).sendKeys("טודו דיזיין");
         Thread.sleep(5000);
         driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr[2]/td[2]/input")).sendKeys("123456");
         Thread.sleep(5000);
         driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr[3]/td[2]/input")).click();
         Thread.sleep(5000);
         driver.findElement(By.xpath("/html/body/h2[1]/img[2]")).click();
         //מוריד קובץ אקסל של הזמנות לטיפול מהייטקזון
         
	}

}

