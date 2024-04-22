package giay2hand.SystemTest;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
@Test
public class TestCase {
    //Tạo TK
    public static void ST1(){
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
            //Step 3. Hoàn thành form
            driver.findElement(By.xpath("//*[@id='first_name']")).sendKeys("Tran");
            Thread.sleep(20);
            driver.findElement(By.xpath("//*[@id='last_name']")).sendKeys("Ngoc");
            Thread.sleep(20);
            driver.findElement(By.xpath("//*[@name=\"email\"]")).sendKeys("ngochiennmssss02019@gmail.com");
            Thread.sleep(20);
            driver.findElement(By.xpath("//*[@name=\"phone\"]")).sendKeys("0792400193");
            Thread.sleep(200);
            driver.findElement(By.xpath("//*[@id='creat_password']")).sendKeys("ngoch02019@");
            Thread.sleep(200);
            //Step 4. Click button
            driver.findElement(By.xpath("//p[1]/input[1]")).click();
            Thread.sleep(2000);
        } catch (Exception e){
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }

    public static void ST4() {
        //1. Init web-driver session
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            driver.get("https://www.giay2hand.com/");
            //Click account
            //trang tai khoan
            driver.findElement(By.xpath("//*[@title=\"Tài khoản\"]")).click();
            Thread.sleep(200);

            //click đăng nhập
            driver.findElement(By.xpath("//div[2]/header[1]/div[1]/div[3]/div[2]/div[1]/a[1]")).click();
            Thread.sleep(200);

            //nhap email
            driver.findElement(By.xpath("//*[@id='customer_login']/input[3]")).sendKeys("ngochienn02019@gmail.com");
            Thread.sleep(200);

            //nhập pass
            driver.findElement(By.xpath("//*[@id='customer_login']/input[4]")).sendKeys("123#@!");
            Thread.sleep(200);

            //click đăng nhập
            driver.findElement(By.xpath("//*[@id='customer_login']/p/input[1]")).click();
            Thread.sleep(2000);

        }catch (Exception e) {
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }

    public static void ST10_ST11_ST12() {
        //1. Init web-driver session
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            driver.get("https://www.giay2hand.com/");
            //Click " Chon sản phẩm" button
            driver.findElement(By.xpath("//section[5]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
            Thread.sleep(200);
            //Click "Them sp" button
            driver.findElement(By.xpath("//*[@id='add-to-cart-form']/div/button[1]")).click();
            Thread.sleep(2000);
            //Click "Tiep tuc mua hang" button
            driver.findElement(By.xpath("//*[@title=\"tiếp tục mua hàng\"]")).click();
            Thread.sleep(200);
            //Xem thong tin gio hang
            driver.findElement(By.xpath("//*[contains(@alt, \"Giỏ hàng\")]")).click();
            Thread.sleep(2000);
            //Thay doi so luong sp trong gio hang
            driver.findElement(By.xpath("//input[contains(@class, 'input_pop')]")).clear();
            driver.findElement(By.xpath("//input[contains(@class, 'input_pop')]")).sendKeys("5");
            driver.findElement(By.xpath("//div[1]/div[2]/div[1]/div[5]")).click();
            Thread.sleep(200);
            //Xoa san pham
            driver.findElement(By.xpath("//a[contains(@class, 'remove-itemx')]")).click();
            Thread.sleep(2000);
        }catch (Exception e) {
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }

    public static void ST14(){
        //1. Init web-driver session
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //Step 1. Go to
            driver.get("https://www.giay2hand.com/");
            //Step 2.
            driver.findElement(By.xpath("//div[3]/div[3]")).click();
            Thread.sleep(20);
            //Step 3.
            driver.findElement(By.xpath("//*[@type=\"search\"]")).sendKeys("[2hand] Giày Thể Thao NIKE AIR MONARCH 415445-002 - CŨ CHÍNH HÃNG");
            Thread.sleep(200);
            //Step 4.
            driver.findElement(By.xpath("//button[1]/img[1]")).click();
            Thread.sleep(200);
            // Step 5.
            String abc1 = driver.findElement(By.xpath(".//div[3]/h3[1]/a[1]")).getText();
            String abc2 = ("[2hand] Giày Thể Thao NIKE AIR MONARCH 415445-002 - CŨ CHÍNH HÃNG");
            assertEquals(abc1,abc2);
            Thread.sleep(2000);
        } catch (Exception e){
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }

    @Test
    public static void ST15(){
        //1. Init web-driver session
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //Step 1. Go to
            driver.get("https://www.giay2hand.com/");
            //Step 2. Click "Tất Cả" on the header
            driver.findElement(By.xpath("//header[1]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click();
            Thread.sleep(200);
            //Step 3. Select a product category
            //secondhand
            driver.findElement(By.xpath("//div[1]/nav[1]/ul[1]/li[1]/a[1]")).click();
            Thread.sleep(2000);
            //men
            driver.findElement(By.xpath("//aside[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]")).click();
            Thread.sleep(200);
            //women
            driver.findElement(By.xpath("//aside[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]")).click();
            Thread.sleep(200);
            //thương hiệu
            driver.findElement(By.xpath("//div[1]/nav[1]/ul[1]/li[4]/a[1]")).click();
            Thread.sleep(2000);
            //nike
            driver.findElement(By.xpath("//*[@title=\"NIKE\"]")).click();
            Thread.sleep(200);
            //adidas
            driver.findElement(By.xpath("//*[@title=\"ADIDAS\"]")).click();
            Thread.sleep(200);
            //puma
            driver.findElement(By.xpath("//*[@title=\"PUMA\"]")).click();
            Thread.sleep(200);
            //fila
            driver.findElement(By.xpath("//*[@title=\"FILA\"]")).click();
            Thread.sleep(200);
            //converse
            driver.findElement(By.xpath("//*[@title=\"CONVERSE\"]")).click();
            Thread.sleep(200);
            //vans
            driver.findElement(By.xpath("//*[@title=\"VANS\"]")).click();
            Thread.sleep(200);
            //MLB
            driver.findElement(By.xpath("//a[@title=\"MLB\"]")).click();
            Thread.sleep(200);
            //New era
            driver.findElement(By.xpath("//aside[1]/div[1]/nav[1]/ul[1]/li[4]/ul[1]/li[8]/a[1]")).click();
            Thread.sleep(200);
            //New balance
            driver.findElement(By.xpath("//*[@title=\"NEW BALANCE\"]")).click();
            Thread.sleep(200);
            //khác
            driver.findElement(By.xpath("//a[@href=\"/thuong-hieu-khac\"]")).click();
            Thread.sleep(200);
            //quần áo & phụ kiện
            driver.findElement(By.xpath("//aside[1]/div[1]/nav[1]/ul[1]/li[5]/a[1]")).click();
            Thread.sleep(200);
            //Vớ
            driver.findElement(By.xpath("//aside[1]/aside[1]/div[1]/nav[1]/ul[1]/li[5]/ul[1]/li[1]/a[1]")).click();
            Thread.sleep(200);
            //T-Shirt
            driver.findElement(By.xpath("//aside[1]/aside[1]/div[1]/nav[1]/ul[1]/li[5]/ul[1]/li[2]/a[1]")).click();
            Thread.sleep(200);
            //Pants
            driver.findElement(By.xpath("//aside[1]/aside[1]/div[1]/nav[1]/ul[1]/li[5]/ul[1]/li[3]/a[1]")).click();
            Thread.sleep(200);
            //Cap
            driver.findElement(By.xpath("//*[@title=\"CAP\"]")).click();
            Thread.sleep(200);
            //Slide
            driver.findElement(By.xpath("//aside[1]/aside[1]/div[1]/nav[1]/ul[1]/li[5]/ul[1]/li[5]/a[1]")).click();
            Thread.sleep(200);
            //Bags
            driver.findElement(By.xpath("//aside[1]/aside[1]/div[1]/nav[1]/ul[1]/li[5]/ul[1]/li[6]/a[1]")).click();
            Thread.sleep(200);
            //Perfume
            driver.findElement(By.xpath("//*[@title=\"PERFUME\"]")).click();
            Thread.sleep(200);
            //Phụ kiện khác
            driver.findElement(By.xpath("//aside[1]/aside[1]/div[1]/nav[1]/ul[1]/li[5]/ul[1]/li[8]/a[1]")).click();
            Thread.sleep(200);
            //Sale
            driver.findElement(By.xpath("//aside[1]/div[1]/nav[1]/ul[1]/li[6]/a[1]")).click();
            Thread.sleep(200);
        } catch (Exception e){
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }

    public static void ST18(){
        //1. Init web-driver session
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //Step 1. Go to
            driver.get("https://www.giay2hand.com/");
            //Step 2. Click vào bài viết
            driver.findElement(By.xpath("//div[2]/div[1]/h3[1]/a[1]")).click();
            Thread.sleep(20);
            //Step 3. Hoàn thành form nhập thông tin bình luận
            driver.findElement(By.xpath("//input[@name=\"Author\"]")).sendKeys("hinhin");
            Thread.sleep(200);
            driver.findElement(By.xpath("//input[@name=\"Email\"]")).sendKeys("ngochienn02019@gmail.com");
            Thread.sleep(200);
            driver.findElement(By.xpath("//*[@id='comment']")).sendKeys("đẹp quá");
            Thread.sleep(200);
            //Step 4. Click
            driver.findElement(By.xpath("//*[@id='article_comments']/div/div/div/div/button[1]")).click();
            Thread.sleep(2000);
        } catch (Exception e){
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }

}

