package myFirstSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ksp {

	public static void main(String[] args)throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\dudia\\Downloads\\automition2\\drivers\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://soft.ksp.co.il/external/white_items/general/index.php");
    Thread.sleep(10000);
    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/div[1]/input")).sendKeys("tudoDesign");
    Thread.sleep(5000);
    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/div[2]/input")).sendKeys("ksptudo2020");
    Thread.sleep(5000);
    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/button")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/button[3]/span/i")).click();
    //כולל הורדת קובץ אקסל של הזמנות שעדיין לא נכנסו לטיפול?...
	}

}
