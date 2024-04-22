import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TestPassValidator {
    @Test
    //mat khau khong duoc bo trong
    public void testPasswordIsNull() {
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    PassValidator user = new PassValidator();
                    user.Setpassword(null);
                }
        );
        assertEquals("Vui lòng nhập Mật khẩu", exception.getMessage());
    }
    //mat khau co so luong ky tu be hon 6
    @Test
    public void testDodaimatkhau1() {
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    PassValidator user = new PassValidator();
                    user.Setpassword("123");
                }
        );
        assertEquals("Mật khẩu dài từ 6 đến 50 ký tự", exception.getMessage());
    }
    //mat khau co so luong ky tu lon hon 50
    @Test
    public void testDodaimatkhau() {
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    PassValidator user = new PassValidator();
                    user.Setpassword("1234567812345678123456781234567812345678123456781234567812345678");
                }
        );
        assertEquals("Mật khẩu dài từ 6 đến 50 ký tự", exception.getMessage());
    }
    //name khong duoc bo trong
    @Test
    public void testNameIsNull() {
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    PassValidator user = new PassValidator();
                    user.Setname(null);
                }
        );
        assertEquals("Please fill out this field", exception.getMessage());
    }
    //email khong duoc bo trong
    @Test
    public void testEmailIsNull() {
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    PassValidator user = new PassValidator();
                    user.Setemail(null);
                }
        );
        assertEquals("Please fill out this field", exception.getMessage());
    }
    //số điện thoại khong duoc bo trong
    @Test
    public void testNummberphonelIsNull() {
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    PassValidator user = new PassValidator();
                    user.Setnumberphone(null);
                }
        );
        assertEquals("Please fill out this field", exception.getMessage());
    }
    //số điện thoại khong be hon 10 ky tu
    @Test
    public void testNummberphonelIsShort() {
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    PassValidator user = new PassValidator();
                    user.Setnumberphone("123");
                }
        );
        assertEquals("Số điện thoại không đúng định dạng", exception.getMessage());
    }
    //số điện thoại khong lon hon 10 ky tu
    @Test
    public void testNummberphonelIsLong() {
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    PassValidator user = new PassValidator();
                    user.Setnumberphone("12345678901");
                }
        );
        assertEquals("Số điện thoại không đúng định dạng", exception.getMessage());
    }
    //thanh toan noi thanh
    @Test
    public void thanhtoannoithanh() {
        PassValidator caculator1 = new PassValidator();
        int result = caculator1.thanhtoannoithanh(999000,30000);
        assertEquals(1029000,result);
    }
    //thanh toan ngoai thanh
    @Test
    public void thanhtoanngoaithanh() {
        PassValidator caculator1 = new PassValidator();
        int result = caculator1.thanhtoanngoaithanh(999000,40000);
        assertEquals(1039000,result);
    }
}