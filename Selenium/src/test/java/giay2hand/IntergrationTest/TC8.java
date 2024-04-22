package giay2hand.IntergrationTest;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test
public class TC8 {
    //Tạo tài khoản và đăng nhập
    public static void TC8() {
        //1. Init web-driver session
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
            Thread.sleep(200);
            //nhap email
            driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("thuyyy02@gmail.com");
            Thread.sleep(200);
            //nhap sdt
            driver.findElement(By.xpath("//input[@name=\"phone\"]")).sendKeys("0792500000");
            Thread.sleep(200);
            //nhap pass
            driver.findElement(By.xpath("//*[@id='creat_password']")).sendKeys("ann1234");
            Thread.sleep(200);
            //click dang ki
            driver.findElement(By.xpath("//input[@value=\"Đăng ký\"]")).click();
            Thread.sleep(2000);
            //trang tai khoan
            driver.findElement(By.xpath("//*[@title=\"Tài khoản\"]")).click();
            Thread.sleep(2000);
            //đăng xuất
            driver.findElement(By.xpath("//div[3]/div[2]/div[1]/a[2]")).click();
            Thread.sleep(2000);
            //trang tai khoan
            driver.findElement(By.xpath("//*[@title=\"Tài khoản\"]")).click();
            Thread.sleep(2000);
            //click đăng nhập
            driver.findElement(By.xpath("//div[2]/header[1]/div[1]/div[3]/div[2]/div[1]/a[1]")).click();
            Thread.sleep(2000);
            //nhap email
            driver.findElement(By.xpath("//*[@id='customer_login']/input[3]")).sendKeys("annthuy02@gmail.com");
            Thread.sleep(2000);
            //nhập pass
            driver.findElement(By.xpath("//*[@id='customer_login']/input[4]")).sendKeys("ann1234");
            Thread.sleep(2000);
            //click đăng nhập
            driver.findElement(By.xpath("//*[@id='customer_login']/p/input[1]")).click();
            Thread.sleep(2000);

        }catch (Exception e) {
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }
}