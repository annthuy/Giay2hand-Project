public class PassValidator {
    private String password;
    private String name;
    private String email;
    private String numberphone;
    //Password ở form tạo tài khoản
    public void Setpassword(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Vui lòng nhập Mật khẩu");
        } else {
            if (password.length() < 6) {
                throw new IllegalArgumentException("Mật khẩu dài từ 6 đến 50 ký tự");
            } else if (password.length() > 50) {
                throw new IllegalArgumentException("Mật khẩu dài từ 6 đến 50 ký tự");
            }
        }
        this.password = password;
    }
    //Name ở form tạo tài khoản
    public void Setname(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Please fill out this field");
        }
        this.name = name;
    }
    //Email ở form tạo tài khoản
    public void Setemail(String email) {
        if (email == null) {
            throw new IllegalArgumentException("Please fill out this field");
        }
        this.email = email;
    }
    //Số điệ thoại ở form tạo tài khoản
    public void Setnumberphone(String numberphone) {
        if (numberphone == null) {
            throw new IllegalArgumentException("Please fill out this field");
        }else {
            if (numberphone.length() < 10) {
                throw new IllegalArgumentException("Số điện thoại không đúng định dạng");
            } else if (numberphone.length() > 10) {
                throw new IllegalArgumentException("Số điện thoại không đúng định dạng");
            }
        }
        this.numberphone = numberphone;
    }

    //Thanh toán nội thành
    public int thanhtoannoithanh(int sanpham, int phishipnoithanh) {
        return sanpham + phishipnoithanh;
    }
    //Thanh toán ngoại thành
    public int thanhtoanngoaithanh(int sanpham, int phishipngoaithanh) {
        return sanpham + phishipngoaithanh;
    }
}