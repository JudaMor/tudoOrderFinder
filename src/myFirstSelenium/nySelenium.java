
package myFirstSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class nySelenium {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\dudia\\Downloads\\automition2\\drivers\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://portal.ace.co.il/priportal/");
        Thread.sleep(10000);
        driver.findElement(By.xpath("/html/body/div/div/div/section/form/div[4]/div/div/input")).sendKeys("adi@tudo.co.il");
        Thread.sleep(5000);
        driver.findElement(By.id("password")).sendKeys(" tudo2023");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div/div/div/section/form/button")).click(); 
        Thread.sleep(10000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/div[1]")).click(); 
               Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/div[3]/div/div/div[3]")).click();
       Thread.sleep(5000);
       // Select selectOne = new Select(driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[3]/div[2]/div/div/div/div/div")));
       // selectOne.selectByIndex(1);
     //   Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[4]/div[2]/div/div/div/div/div/input")).sendKeys("yqwaaes5v1wjgkbkk61uetikpcc713p1@hook.eu2.make.com");

        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/button[2]")).click(); 
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/button"));
         

	}
	
	
	
  
}


