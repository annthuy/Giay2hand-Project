package giay2hand.IntergrationTest;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TC4_5 {
    @Test
    //Đổi mk thành công
    public static void TC4(){
        //1. Init web-driver session
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //Step 1. Go to
            driver.get("https://www.giay2hand.com/");
            //Step 2.
            driver.findElement(By.xpath("//div[2]/img[1]")).click();
            Thread.sleep(20);
            driver.findElement(By.xpath("//div[3]/div[2]/div[1]/a[1]")).click();
            Thread.sleep(20);
            //Step 3. Điền form
            driver.findElement(By.xpath("//*[@id='customer_email']")).sendKeys("ngochienn02019@gmail.com");
            Thread.sleep(20);
            driver.findElement(By.xpath("//*[@id='customer_password']")).sendKeys("123#@!");
            Thread.sleep(200);
            driver.findElement(By.xpath("//*[@value=\"Đăng nhập\"]")).click();
            Thread.sleep(200);
            driver.findElement(By.linkText("Đổi mật khẩu")).click();
            Thread.sleep(200);
            //Step 4.
            driver.findElement(By.xpath("//*[@id='OldPass']")).sendKeys("123#@!");
            Thread.sleep(20);
            driver.findElement(By.xpath("//*[@id='changePass']")).sendKeys("123!@!");
            Thread.sleep(20);
            driver.findElement(By.xpath("//*[@id='confirmPass']")).sendKeys("123!@!");
            Thread.sleep(200);
            //Step 5. Xác nhận
            driver.findElement(By.xpath("//*[@id='change_customer_password']/div/button[1]")).click();
            Thread.sleep(2000);
            // Step 6. Xác thưc trùng khớp
            String abc1 = driver.findElement(By.xpath(".//div[1]/form[1]/div[1]")).getText();
            String abc2 = ("Đổi mật khẩu thành công");
            assertEquals(abc1,abc2);
            Thread.sleep(2000);
        } catch (Exception e){
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }
    //Đổi mk thất bại
    public static void TC5(){
        //1. Init web-driver session
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //Step 1. Go to http://live.techpanda.org/
            driver.get("https://www.giay2hand.com/");
            //Step 2. Click on my account link
            driver.findElement(By.xpath("//div[2]/img[1]")).click();
            Thread.sleep(200);
            driver.findElement(By.xpath("//div[3]/div[2]/div[1]/a[1]")).click();
            Thread.sleep(200);
            //Step 3. Click Create an Account link and fill New User information except Email ID
            driver.findElement(By.xpath("//*[@id='customer_email']")).sendKeys("ngochienn02019@gmail.com");
            Thread.sleep(200);
            driver.findElement(By.xpath("//*[@id='customer_password']")).sendKeys("123!@!");
            Thread.sleep(200);
            driver.findElement(By.xpath("//*[@value=\"Đăng nhập\"]")).click();
            Thread.sleep(200);
            driver.findElement(By.linkText("Đổi mật khẩu")).click();
            Thread.sleep(200);
            //Step 4. Click Register
            driver.findElement(By.xpath("//*[@id='OldPass']")).sendKeys("123");
            Thread.sleep(200);
            driver.findElement(By.xpath("//*[@id='changePass']")).sendKeys("123!@!");
            Thread.sleep(200);
            driver.findElement(By.xpath("//*[@id='confirmPass']")).sendKeys("123!@!");
            Thread.sleep(200);
            //Step 5. Verify Registration is done. Expected account registration done.
            driver.findElement(By.xpath("//*[@id='change_customer_password']/div/button[1]")).click();
            Thread.sleep(2000);
            // Step 5.
            String abc1 = driver.findElement(By.xpath(".//div[1]/form[1]/div[1]")).getText();
            String abc2 = ("Mật khẩu không đúng");
            assertEquals(abc1,abc2);
            Thread.sleep(2000);
        } catch (Exception e){
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }
}
