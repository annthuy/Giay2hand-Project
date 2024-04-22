package giay2hand.IntergrationTest;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test
public class TC10 {
    //Thanh toán sp ở giỏ hàng
    public static void cart() {
        //1. Init web-driver session
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            driver.get("https://www.giay2hand.com/");
            // chọn sp
            driver.findElement(By.xpath("//div[2]/section[3]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
            Thread.sleep(2000);
            //mua sp và quan sát mẫu thông tin
            driver.findElement(By.xpath("//form[1]/div[2]/a[1]")).click();
            Thread.sleep(2000);

        }catch (Exception e) {
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }
}
