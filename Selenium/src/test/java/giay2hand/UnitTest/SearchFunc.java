package giay2hand.UnitTest;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SearchFunc {
    @Test
    public static void S1(){
        //1. Init web-driver session
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //Step 1.
            driver.get("https://www.giay2hand.com/");
            //Step 2.
            driver.findElement(By.xpath("//div[3]/div[3]")).click();
            Thread.sleep(20);
            //Step 3.
            driver.findElement(By.xpath("//*[@type=\"search\"]")).sendKeys("[2hand] Giày Thể Thao NIKE AIRMAX AXIS AA2168-003 - CŨ CHÍNH HÃNG");
            Thread.sleep(20);
            //Step 4.
            driver.findElement(By.xpath("//button[1]/img[1]")).click();
            Thread.sleep(200);
            // Step 5.
            String abc1 = driver.findElement(By.xpath(".//div[3]/h3[1]/a[1]")).getText();
            String abc2 = ("[2hand] Giày Thể Thao NIKE AIRMAX AXIS AA2168-003 - CŨ CHÍNH HÃNG");
            assertEquals(abc1,abc2);
            Thread.sleep(2000);
        } catch (Exception e){
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }
    @Test
    public static void S8(){
        //1. Init web-driver session
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //Step 1.
            driver.get("https://www.giay2hand.com/");
            //Step 2.
            driver.findElement(By.xpath("//div[3]/div[3]")).click();
            Thread.sleep(20);
            //Step 3.
            driver.findElement(By.xpath("//*[@type=\"search\"]")).sendKeys("giày123");
            Thread.sleep(20);
            //Step 4.
            driver.findElement(By.xpath("//button[1]/img[1]")).click();
            Thread.sleep(200);
            // Step 5.
            String abc1 = driver.findElement(By.xpath(".//h2[contains(@class, 'title-head')]")).getText();
            String abc2 = ("Không tìm thấy bất kỳ kết quả nào với từ khóa trên.");
            assertEquals(abc1,abc2);
            Thread.sleep(2000);
        } catch (Exception e){
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }
    @Test
    public static void S9(){
        //1. Init web-driver session
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //Step 1. Go to https://www.giay2hand.com/
            driver.get("https://www.giay2hand.com/");
            //Step 2.
            driver.findElement(By.xpath("//div[3]/div[3]")).click();
            Thread.sleep(20);
            //Step 3.
            driver.findElement(By.xpath("//button[1]/img[1]")).click();
            Thread.sleep(200);
            // Step 5. Xác thưc trùng khớp
            String abc1 = driver.findElement(By.xpath(".//h2[1]/a[1]")).getText();
            String abc2 = ("Nhập từ khóa để tìm kiếm sản phẩm");
            assertEquals(abc1,abc2);
            Thread.sleep(2000);
        } catch (Exception e){
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }
}
