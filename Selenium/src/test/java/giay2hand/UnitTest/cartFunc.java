package giay2hand.UnitTest;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test
public class cartFunc {
    public static void C1() {
        //1. Init web-driver session
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            driver.get("https://www.giay2hand.com/");
            //Click " Chon sản phẩm" button
            driver.findElement(By.xpath("//section[5]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
            Thread.sleep(2000);

            //Click "Them sp" button
            driver.findElement(By.xpath("//*[@id='add-to-cart-form']/div/button[1]")).click();
            Thread.sleep(2000);

            //Click "Tiep tuc mua hang" button
            driver.findElement(By.xpath("//*[@title=\"tiếp tục mua hàng\"]")).click();
            Thread.sleep(2000);

            //Xem thong tin gio hang
            driver.findElement(By.xpath("//*[contains(@alt, \"Giỏ hàng\")]")).click();
            Thread.sleep(2000);
        }catch (Exception e) {
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }

    public static void C3() {
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            driver.get("https://www.giay2hand.com/");
            //Click " Chon sản phẩm" button
            driver.findElement(By.xpath("//section[5]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
            Thread.sleep(2000);

            //Click "Them sp" button
            driver.findElement(By.xpath("//*[@id='add-to-cart-form']/div/button[1]")).click();
            Thread.sleep(2000);

            //Click "Tiep tuc mua hang" button
            driver.findElement(By.xpath("//*[@title=\"tiếp tục mua hàng\"]")).click();
            Thread.sleep(2000);

            //Xem thong tin gio hang
            driver.findElement(By.xpath("//*[contains(@alt, \"Giỏ hàng\")]")).click();
            Thread.sleep(2000);

            //Thay doi tăng so luong sp trong gio hang
            driver.findElement(By.xpath("//div[1]/div[2]/div[1]/div[4]/div[1]/button[1]")).click();
            Thread.sleep(2000);
        }catch (Exception e) {
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }

    public static void C4() {
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            driver.get("https://www.giay2hand.com/");
            //Click " Chon sản phẩm" button
            driver.findElement(By.xpath("//section[5]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
            Thread.sleep(2000);

            //Click "Them sp" button
            driver.findElement(By.xpath("//*[@id='add-to-cart-form']/div/button[1]")).click();
            Thread.sleep(2000);

            //Click "Tiep tuc mua hang" button
            driver.findElement(By.xpath("//*[@title=\"tiếp tục mua hàng\"]")).click();
            Thread.sleep(2000);

            //Xem thong tin gio hang
            driver.findElement(By.xpath("//*[contains(@alt, \"Giỏ hàng\")]")).click();
            Thread.sleep(2000);

            //Thay doi giảm so luong sp trong gio hang
            driver.findElement(By.xpath("//div[1]/div[2]/div[1]/div[4]/div[1]/button[2]")).click();
            Thread.sleep(2000);

        }catch (Exception e) {
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }

    public static void C5() {
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            driver.get("https://www.giay2hand.com/");
            //chọn sp
            driver.findElement(By.xpath("//section[5]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
            Thread.sleep(2000);

            //Click "Them sp" button
            driver.findElement(By.xpath("//*[@id='add-to-cart-form']/div/button[1]")).click();
            Thread.sleep(2000);

            //Click "Tiep tuc mua hang" button
            driver.findElement(By.xpath("//*[@title=\"tiếp tục mua hàng\"]")).click();
            Thread.sleep(2000);

            //Xem thong tin gio hang
            driver.findElement(By.xpath("//*[contains(@alt, \"Giỏ hàng\")]")).click();
            Thread.sleep(2000);

            //Xoa san pham
            driver.findElement(By.xpath("//a[contains(@class, 'remove-itemx')]")).click();
            Thread.sleep(2000);

        }catch (Exception e) {
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }

    public static void C6() {
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            driver.get("https://www.giay2hand.com/");
            //chọn sp
            driver.findElement(By.xpath("//section[5]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
            Thread.sleep(2000);

            //Click "Them sp" button
            driver.findElement(By.xpath("//*[@id='add-to-cart-form']/div/button[1]")).click();
            Thread.sleep(2000);

            //Click "Tiep tuc mua hang" button
            driver.findElement(By.xpath("//*[@title=\"tiếp tục mua hàng\"]")).click();
            Thread.sleep(2000);

        }catch (Exception e) {
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }

    public static void C7() {
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            driver.get("https://www.giay2hand.com/");
            //Mua them sp
            driver.findElement(By.xpath("//body/div[2]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/span[1]")).click();
            Thread.sleep(2000);
            //chon mua hang
            driver.findElement(By.xpath("//section[5]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
            Thread.sleep(2000);
            //thuc hien thanh toan
            driver.findElement(By.xpath("//div[3]/form[1]/div[2]/button[1]")).click();
            Thread.sleep(2000);
            //vao trang thanh toan
            driver.findElement(By.xpath("//*[@id='popup-cart-desktop']/div/div/div/div/a[1]")).click();
            Thread.sleep(2000);
        }catch (Exception e) {
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }
}