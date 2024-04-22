package giay2hand.IntergrationTest;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test
public class TC11 {
    //Xem thông tin tài khoản sau khi đăng kí
    public static void cart() {
        ///1. Init web-driver session
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            driver.get("https://www.giay2hand.com/");
            //Click account
            driver.findElement(By.xpath("//div[@title=\"Tài khoản\"]")).click();
            Thread.sleep(2000);
            //click tao tai khoan
            driver.findElement(By.xpath("//div[3]/div[2]/div[1]/a[2]")).click();
            Thread.sleep(2000);
            //nhap firstname
            driver.findElement(By.xpath("//*[@id='first_name']")).sendKeys("Ann");
            Thread.sleep(2000);
            //nhap lastname
            driver.findElement(By.xpath("//*[@id='last_name']")).sendKeys("Thuy");
            Thread.sleep(2000);
            //nhap email
            driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("a01211102@gmail.com");
            Thread.sleep(2000);
            //nhap sdt
            driver.findElement(By.xpath("//input[@name=\"phone\"]")).sendKeys("01345670125");
            Thread.sleep(2000);
            //nhap pass
            driver.findElement(By.xpath("//*[@id='creat_password']")).sendKeys("ann1234");
            Thread.sleep(2000);
            //click dang ki
            driver.findElement(By.xpath("//input[@value=\"Đăng ký\"]")).click();
            Thread.sleep(2000);
            //Click account
            driver.findElement(By.xpath("//div[@title=\"Tài khoản\"]")).click();
            Thread.sleep(2000);
            //Click trang tai khoan
            driver.findElement(By.xpath("//header[1]/div[1]/div[3]/div[2]/div[1]/a[1]")).click();
            Thread.sleep(2000);

        }catch (Exception e) {
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }
}