package giay2hand.UnitTest;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

@Test
public class loginFunc {
    public static void LG10() {
        //1. Init web-driver session
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            driver.get("https://www.giay2hand.com/");
            //Click account
            driver.findElement(By.xpath("//div[@title=\"Tài khoản\"]")).click();
            Thread.sleep(200);

            //click login
            driver.findElement(By.xpath("//body/div[2]/header[1]/div[1]/div[3]/div[2]/div[1]/a[1]")).click();
            Thread.sleep(200);

            //nhap email
            driver.findElement(By.xpath("//*[@id='customer_email']")).sendKeys("nganngo03092002@gmail.com");
            Thread.sleep(200);

            //nhap pass
            driver.findElement(By.xpath("//*[@id='customer_password']")).sendKeys("ngongockimngan");
            Thread.sleep(200);

            //click dang nhap
            driver.findElement(By.xpath("//*[@value=\"Đăng nhập\"]")).click();
            Thread.sleep(200);
        }catch (Exception e) {
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }
    @Test
    public static void LG11() {
        //1. Init web-driver session
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            driver.get("https://www.giay2hand.com/");
            //Click account
            driver.findElement(By.xpath("//div[@title=\"Tài khoản\"]")).click();
            Thread.sleep(200);
            //click login
            driver.findElement(By.xpath("//div[3]/div[2]/div[1]/a[1]")).click();
            Thread.sleep(200);
            //nhap email
            driver.findElement(By.xpath("//*[@id='customer_email']")).sendKeys("nganngo03092002@gmail.com");
            Thread.sleep(200);
            //nhap pass
            driver.findElement(By.xpath("//*[@id='customer_password']")).sendKeys("ngongockim");
            Thread.sleep(200);
            //click dang nhap
            driver.findElement(By.xpath("//*[@value=\"Đăng nhập\"]")).click();
            Thread.sleep(200);
            String abc1 = driver.findElement(By.xpath(".//div[1]/form[1]/div[1]")).getText();
            String abc2 = ("Thông tin đăng nhập không chính xác.");
            assertEquals(abc1,abc2);
            Thread.sleep(200);
        }catch (Exception e) {
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }
    @Test
    public static void LG12() {
        //1. Init web-driver session
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            driver.get("https://www.giay2hand.com/");
            //Click account
            driver.findElement(By.xpath("//div[@title=\"Tài khoản\"]")).click();
            Thread.sleep(200);
            //click login
            driver.findElement(By.xpath("//div[3]/div[2]/div[1]/a[1]")).click();
            Thread.sleep(200);
            //nhap email
            driver.findElement(By.xpath("//*[@id='customer_email']")).sendKeys("ngan03092002@gmail.com");
            Thread.sleep(200);
            //nhap pass
            driver.findElement(By.xpath("//*[@id='customer_password']")).sendKeys("ngongockim");
            Thread.sleep(200);
            //click dang nhap
            driver.findElement(By.xpath("//*[@value=\"Đăng nhập\"]")).click();
            Thread.sleep(200);
            String abc1 = driver.findElement(By.xpath(".//div[1]/form[1]/div[1]")).getText();
            String abc2 = ("Thông tin đăng nhập không chính xác.");
            assertEquals(abc1,abc2);
            Thread.sleep(200);
        }catch (Exception e) {
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }
    @Test
    public static void LG13() {
        //1. Init web-driver session
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            driver.get("https://www.giay2hand.com/");
            //Click account
            driver.findElement(By.xpath("//div[@title=\"Tài khoản\"]")).click();
            Thread.sleep(200);
            //click login
            driver.findElement(By.xpath("//div[3]/div[2]/div[1]/a[1]")).click();
            Thread.sleep(200);
            //nhap email
            driver.findElement(By.xpath("//*[@id='customer_email']")).sendKeys("nganngo03092002@gmail.com");
            Thread.sleep(200);
            //nhap pass
            driver.findElement(By.xpath("//*[@id='customer_password']")).sendKeys("ngongockim");
            Thread.sleep(200);
            //click dang nhap
            driver.findElement(By.xpath("//*[@value=\"Đăng nhập\"]")).click();
            Thread.sleep(200);
            String abc1 = driver.findElement(By.xpath(".//div[1]/form[1]/div[1]")).getText();
            String abc2 = ("Thông tin đăng nhập không chính xác.");
            assertEquals(abc1,abc2);
            Thread.sleep(200);
        }catch (Exception e) {
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }
    @Test
    public static void LG15() {
        //1. Init web-driver session
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            driver.get("https://www.giay2hand.com/");
            //Click account
            driver.findElement(By.xpath("//div[@title=\"Tài khoản\"]")).click();
            Thread.sleep(200);
            //click login
            driver.findElement(By.xpath("//div[3]/div[2]/div[1]/a[1]")).click();
            Thread.sleep(200);
            //click link "tại đây"
            driver.findElement(By.xpath("//form[1]/p[1]/a[1]")).click();
            Thread.sleep(200);
            //nhap firstname
            driver.findElement(By.xpath("//*[@id='first_name']")).sendKeys("Ann");
            Thread.sleep(200);
            //nhap lastname
            driver.findElement(By.xpath("//*[@id='last_name']")).sendKeys("Thuy");
            Thread.sleep(20);
            //nhap email
            driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("a0212002@gmail.com");
            Thread.sleep(20);
            //nhap sdt
            driver.findElement(By.xpath("//input[@name=\"phone\"]")).sendKeys("012345678125");
            Thread.sleep(20);
            //nhap pass
            driver.findElement(By.xpath("//*[@id='creat_password']")).sendKeys("ann1234");
            Thread.sleep(200);
            //click dang ki
            driver.findElement(By.xpath("//input[@value=\"Đăng ký\"]")).click();
            Thread.sleep(2000);
        }catch (Exception e) {
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }
    @Test
    public static void LG16() {
        //1. Init web-driver session
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            driver.get("https://www.giay2hand.com/");
            //Click account
            driver.findElement(By.xpath("//div[@title=\"Tài khoản\"]")).click();
            Thread.sleep(200);
            //click login
            driver.findElement(By.xpath("//div[3]/div[2]/div[1]/a[1]")).click();
            Thread.sleep(200);
            //click link "create account"
            driver.findElement(By.xpath("//*[@id='register-btn']")).click();
            Thread.sleep(200);
            //nhap firstname
            driver.findElement(By.xpath("//*[@id='first_name']")).sendKeys("Ann");
            Thread.sleep(20);
            //nhap lastname
            driver.findElement(By.xpath("//*[@id='last_name']")).sendKeys("Thuy");
            Thread.sleep(20);
            //nhap email
            driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("nn02@gmail.com");
            Thread.sleep(20);
            //nhap sdt
            driver.findElement(By.xpath("//input[@name=\"phone\"]")).sendKeys("08125485231");
            Thread.sleep(20);
            //nhap pass
            driver.findElement(By.xpath("//*[@id='creat_password']")).sendKeys("ann1234");
            Thread.sleep(200);
            //click dang ki
            driver.findElement(By.xpath("//input[@value=\"Đăng ký\"]")).click();
            Thread.sleep(2000);
        }catch (Exception e) {
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }
    @Test
    public static void LG17() {
        //1. Init web-driver session
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            driver.get("https://www.giay2hand.com/");
            //Click account
            driver.findElement(By.xpath("//div[@title=\"Tài khoản\"]")).click();
            Thread.sleep(200);
            //click login
            driver.findElement(By.xpath("//div[3]/div[2]/div[1]/a[1]")).click();
            Thread.sleep(200);
            //click link "forgot password"
            driver.findElement(By.xpath("//*[@id='RecoverPassword']")).click();
            Thread.sleep(200);
            //nhap email
            driver.findElement(By.xpath("//*[@id='recover_password']/input[1]")).sendKeys("annthuy@gmail.com");
            Thread.sleep(2000);
            //click gửi
            driver.findElement(By.xpath("//input[@value=\"Gửi\"]")).click();
            Thread.sleep(2000);
            String abc1 = driver.findElement(By.xpath(".//*[@id='recover_customer_password']/p[1]")).getText();
            String abc2 = ("Vui lòng kiểm tra email để nhận đường dẫn thay đổi mật khẩu");
            assertEquals(abc1,abc2);
            Thread.sleep(2000);
        }catch (Exception e) {
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }
    @Test
    public static void LG19() {
        //1. Init web-driver session
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            driver.get("https://www.giay2hand.com/");
            //Click account
            driver.findElement(By.xpath("//div[@title=\"Tài khoản\"]")).click();
            Thread.sleep(2000);
            //click login
            driver.findElement(By.xpath("//body/div[2]/header[1]/div[1]/div[3]/div[2]/div[1]/a[1]")).click();
            Thread.sleep(2000);
            //click link gg
            driver.findElement(By.xpath("//*[contains(@alt, \"google-login-button\")]")).click();
            Thread.sleep(2000);
            //nhap email
            driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("annthuy212002@gmail.com");
            Thread.sleep(2000);
            //click next
            driver.findElement(By.xpath("//*[@id='identifierNext']/div/button/div[3]")).click();
            Thread.sleep(2000);
            //nhap pass
            driver.findElement(By.xpath("//*[@type=\"password\"]")).sendKeys("annthuy1255");
            Thread.sleep(2000);
            //click next
            driver.findElement(By.xpath("//*[@id='passwordNext']/div/button/div[3]")).click();
            Thread.sleep(2000);
        }catch (Exception e) {
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }
}