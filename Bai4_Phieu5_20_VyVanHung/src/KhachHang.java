import java.util.Scanner;

public class KhachHang {
    private String hoTen;
    private String diaChi;

    public KhachHang(String hoTen, String diaChi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }

    public KhachHang() {
    }

    public  void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ho ten");
        hoTen = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        diaChi = scanner.nextLine();
    }


    public void xuat(){
        System.out.printf("Khách hàng : %-10s Địa chỉ : %-10s %n",hoTen,diaChi);
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
