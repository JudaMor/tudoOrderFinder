package myFirstSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class azr {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\dudia\\Downloads\\automition2\\drivers\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://azrieliil-prod.mirakl.net/login");
       Thread.sleep(10000);
       driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]/form/div[1]/div/div/input")).sendKeys("adi@tudo.co.il");
       Thread.sleep(5000);
       driver.findElement(By.id("submitLabel")).click();
       Thread.sleep(5000);
       driver.findElement(By.xpath("/html/body/div/div/main/section/div/div/div/form/div[2]/div/div[2]/div/input")).sendKeys("Tudo11223344");
       Thread.sleep(5000);
       driver.findElement(By.xpath("/html/body/div/div/main/section/div/div/div/form/div[3]/button")).click();
       Thread.sleep(5000);
       driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/aside/nav/div[1]/div[2]/div/div/ul/li[2]/a/div[2]/div/span")).click();
       Thread.sleep(5000);
       driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[1]/div[2]/div[3]/div[2]/div/form/div/div[1]/div[2]/div[3]/button")).click();
       Thread.sleep(5000);
       driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[1]/div[2]/div[3]/div[2]/div/form/div/div[1]/div[2]/div[3]/ul/li[2]/a/span[2]")).click();
       //כולל הורדה של קובץ
       

	}

}
