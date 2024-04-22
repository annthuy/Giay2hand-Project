package giay2hand.UnitTest;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.AssertJUnit.assertEquals;

public class ChangePassFunc {
    public static void CN3(){
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
            //Step 3.
            driver.findElement(By.xpath("//*[@id='customer_email']")).sendKeys("ngochienn02019@gmail.com");
            Thread.sleep(20);
            driver.findElement(By.xpath("//*[@id='customer_password']")).sendKeys("123#@!");
            Thread.sleep(20);
            driver.findElement(By.xpath("//*[@value=\"Đăng nhập\"]")).click();
            Thread.sleep(20);
            driver.findElement(By.linkText("Đổi mật khẩu")).click();
            Thread.sleep(20);
            //Step 4.
            driver.findElement(By.xpath("//*[@id='OldPass']")).sendKeys("11");
            Thread.sleep(20);
            driver.findElement(By.xpath("//*[@id='changePass']")).sendKeys("123#@!");
            Thread.sleep(20);
            driver.findElement(By.xpath("//*[@id='confirmPass']")).sendKeys("123#@!");
            Thread.sleep(20);
            //Step 5.
            driver.findElement(By.xpath("//*[@id='change_customer_password']/div/button[1]")).click();
            Thread.sleep(2000);
            // Step 6.
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
    public static void CN5(){
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
            //Step 3.
            driver.findElement(By.xpath("//*[@id='customer_email']")).sendKeys("ngochienn02019@gmail.com");
            Thread.sleep(20);
            driver.findElement(By.xpath("//*[@id='customer_password']")).sendKeys("123#@!");
            Thread.sleep(20);
            driver.findElement(By.xpath("//*[@value=\"Đăng nhập\"]")).click();
            Thread.sleep(20);
            driver.findElement(By.linkText("Đổi mật khẩu")).click();
            Thread.sleep(20);
            //Step 4.
            driver.findElement(By.xpath("//*[@id='OldPass']")).sendKeys("123#@!");
            Thread.sleep(20);
            driver.findElement(By.xpath("//*[@id='changePass']")).sendKeys("123");
            Thread.sleep(20);
            driver.findElement(By.xpath("//*[@id='confirmPass']")).sendKeys("123");
            Thread.sleep(20);
            //Step 5.
            driver.findElement(By.xpath("//*[@id='change_customer_password']/div/button[1]")).click();
            Thread.sleep(2000);
            // Step 6.
            String abc1 = driver.findElement(By.xpath(".//div[1]/form[1]/div[1]")).getText();
            String abc2 = ("Mật khẩu mới dài từ 6 đến 50 ký tự");
            assertEquals(abc1,abc2);
            Thread.sleep(2000);
        } catch (Exception e){
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }
    public static void CN6(){
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
            //Step 3.
            driver.findElement(By.xpath("//*[@id='customer_email']")).sendKeys("ngochienn02019@gmail.com");
            Thread.sleep(20);
            driver.findElement(By.xpath("//*[@id='customer_password']")).sendKeys("123#@!");
            Thread.sleep(20);
            driver.findElement(By.xpath("//*[@value=\"Đăng nhập\"]")).click();
            Thread.sleep(20);
            driver.findElement(By.linkText("Đổi mật khẩu")).click();
            Thread.sleep(20);
            //Step 4.
            driver.findElement(By.xpath("//*[@id='OldPass']")).sendKeys("11");
            Thread.sleep(20);
            driver.findElement(By.xpath("//*[@id='changePass']")).sendKeys("123 # !!");
            Thread.sleep(20);
            driver.findElement(By.xpath("//*[@id='confirmPass']")).sendKeys("123 # !!");
            Thread.sleep(20);
            //Step 5.
            driver.findElement(By.xpath("//*[@id='change_customer_password']/div/button[1]")).click();
            Thread.sleep(2000);
            // Step 6.
            String abc1 = driver.findElement(By.xpath(".//div[1]/form[1]/div[1]")).getText();
            String abc2 = ("Mật khẩu mới không được chứa dấu cách, dấu nháy, ký tự >");
            assertEquals(abc1,abc2);
            Thread.sleep(2000);
        } catch (Exception e){
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }
    public static void CN7(){
        //1. Init web-driver session
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //Step 1.
            driver.get("https://www.giay2hand.com/");
            //Step 2.
            driver.findElement(By.xpath("//div[2]/img[1]")).click();
            Thread.sleep(20);
            driver.findElement(By.xpath("//div[3]/div[2]/div[1]/a[1]")).click();
            Thread.sleep(20);
            //Step 3.
            driver.findElement(By.xpath("//*[@id='customer_email']")).sendKeys("ngochienn02019@gmail.com");
            Thread.sleep(20);
            driver.findElement(By.xpath("//*[@id='customer_password']")).sendKeys("123#@!");
            Thread.sleep(20);
            driver.findElement(By.xpath("//*[@value=\"Đăng nhập\"]")).click();
            Thread.sleep(20);
            driver.findElement(By.linkText("Đổi mật khẩu")).click();
            Thread.sleep(20);
            //Step 4.
            driver.findElement(By.xpath("//*[@id='OldPass']")).sendKeys("123#@!");
            Thread.sleep(20);
            driver.findElement(By.xpath("//*[@id='changePass']")).sendKeys("123#$%");
            Thread.sleep(20);
            driver.findElement(By.xpath("//*[@id='confirmPass']")).sendKeys("123@!!");
            Thread.sleep(20);
            //Step 5.
            driver.findElement(By.xpath("//*[@id='change_customer_password']/div/button[1]")).click();
            Thread.sleep(2000);
            // Step 6.
            String abc1 = driver.findElement(By.xpath(".//div[1]/form[1]/div[1]")).getText();
            String abc2 = ("Xác nhận mật khẩu không khớp");
            assertEquals(abc1,abc2);
            Thread.sleep(2000);
        } catch (Exception e){
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }

}
