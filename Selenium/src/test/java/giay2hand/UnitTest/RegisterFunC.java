package giay2hand.UnitTest;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class RegisterFunC {
    @Test
    public static void CA15(){
        //1. Init web-driver session
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //Step 1. Go to
            driver.get("https://www.giay2hand.com/");
            //Step 2.
            driver.findElement(By.xpath("//div[2]/img[1]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//div[3]/div[2]/div[1]/a[2]")).click();
            Thread.sleep(2000);
            //Step 3.
            driver.findElement(By.xpath("//*[@id='first_name']")).sendKeys("RTFF");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id='last_name']")).sendKeys("Ngoc");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@name=\"email\"]")).sendKeys("ngochnn02019@gmail.com");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@name=\"phone\"]")).sendKeys("0792504888");
            Thread.sleep(2000);
            //Step 4. Click Register
            driver.findElement(By.xpath("//p[1]/input[1]")).click();
            Thread.sleep(2000);
            // Step 5.
            String abc1 = driver.findElement(By.xpath(".//*[@id='customer_register']/div[1]")).getText();
            String abc2 = ("Vui lòng nhập Mật khẩu");
            assertEquals(abc1,abc2);
            Thread.sleep(2000);
        } catch (Exception e){
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }
    @Test
    public static void CA16(){
        //1. Init web-driver session
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //Step 1.
            driver.get("https://www.giay2hand.com/");
            //Step 2.
            driver.findElement(By.xpath("//div[2]/img[1]")).click();
            Thread.sleep(20);
            driver.findElement(By.xpath("//div[3]/div[2]/div[1]/a[2]")).click();
            Thread.sleep(20);
            //Step 3.
            driver.findElement(By.xpath("//*[@id='first_name']")).sendKeys("Ngoc");
            Thread.sleep(20);
            driver.findElement(By.xpath("//*[@id='last_name']")).sendKeys("Ngoc");
            Thread.sleep(20);
            driver.findElement(By.xpath("//*[@name=\"email\"]")).sendKeys("ngochnn02019@gmail.com");
            Thread.sleep(20);
            driver.findElement(By.xpath("//*[@name=\"phone\"]")).sendKeys("0792504888");
            Thread.sleep(20);
            driver.findElement(By.xpath("//*[@id='creat_password']")).sendKeys("12!");
            Thread.sleep(20);
            //Step 4. Click Register
            driver.findElement(By.xpath("//p[1]/input[1]")).click();
            Thread.sleep(2000);
            // Step 5.
            String abc1 = driver.findElement(By.xpath(".//*[@id='customer_register']/div[1]")).getText();
            String abc2 = ("Mật khẩu dài từ 6 đến 50 ký tự");
            assertEquals(abc1,abc2);
            Thread.sleep(2000);
        } catch (Exception e){
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }
    public static void CA17(){
        //1. Init web-driver session
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //Step 1. Go to
            driver.get("https://www.giay2hand.com/");
            //Step 2.
            driver.findElement(By.xpath("//div[2]/img[1]")).click();
            Thread.sleep(200);
            driver.findElement(By.xpath("//div[3]/div[2]/div[1]/a[2]")).click();
            Thread.sleep(200);
            //Step 3.
            driver.findElement(By.xpath("//*[@id='first_name']")).sendKeys("Ngoc");
            Thread.sleep(200);
            driver.findElement(By.xpath("//*[@id='last_name']")).sendKeys("Ngoc");
            Thread.sleep(200);
            driver.findElement(By.xpath("//*[@name=\"email\"]")).sendKeys("ngochnn02019@gmail.com");
            Thread.sleep(200);
            driver.findElement(By.xpath("//*[@name=\"phone\"]")).sendKeys("0792504888");
            Thread.sleep(200);
            driver.findElement(By.xpath("//*[@id='creat_password']")).sendKeys("1 v2 !");
            Thread.sleep(200);
            //Step 4. Click Register
            driver.findElement(By.xpath("//p[1]/input[1]")).click();
            Thread.sleep(2000);
            // Step 5.
            String abc1 = driver.findElement(By.xpath(".//*[@id='customer_register']/div[1]")).getText();
            String abc2 = ("Mật khẩu không được chứa dấu cách, dấu nháy, ký tự >");
            assertEquals(abc1,abc2);
            Thread.sleep(2000);
        } catch (Exception e){
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }

}
