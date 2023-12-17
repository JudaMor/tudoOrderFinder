package myFirstSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allsale {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\dudia\\Downloads\\automition2\\drivers\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://supp.olsale.co.il/login?ref=/");
        Thread.sleep(10000);
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div/form/div[1]/input")).sendKeys("870");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div/form/div[2]/input")).sendKeys("adido");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div/form/button/span")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/div[2]/ul/li[2]/ul/li[5]/a/span")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div[2]/div[1]/div[3]/button")).click();
        
        
        

	}

}
