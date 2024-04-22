package giay2hand.IntergrationTest;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.File;

@Test
public class TC6_7 {
    //Lọc sản phẩm
    public static void TC6_7_() {
        int ts = 0;
        StringBuffer verErr = new StringBuffer();
        //1. Init web-driver session
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //Step 2. Go to
            driver.get("https://www.giay2hand.com/");
            //Step 3.
            driver.findElement(By.linkText("TẤT CẢ")).click();
            Thread.sleep(200);
            driver.findElement(By.linkText("THƯƠNG HIỆU")).click();
            Thread.sleep(200);
            driver.findElement(By.linkText("NIKE")).click();
            Thread.sleep(200);
            //Step 4.
            driver.findElement(By.xpath("//*[@id='sort-by']/ul/li[1]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id='sort-by']/ul[1]/li[1]/ul[1]/li[5]/a[1]")).click();
            Thread.sleep(2000);
        } catch (Exception e){
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }
}
