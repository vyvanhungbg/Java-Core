import java.text.DecimalFormat;
import java.util.Scanner;

public class HangHoa {
    private String tenHang;
    private int soLuong;
    private double donGia;


    public HangHoa() {
    }

    public HangHoa(String tenHang, int soLuong, double donGia) {
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "HangHoa{" +
                "tenHang='" + tenHang + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                '}';
    }

    public  void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên hàng");
        tenHang = scanner.nextLine();
        System.out.println("Nhập số lượng");
        soLuong = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập đơn giá");
        donGia = Double.parseDouble(scanner.nextLine());
    }

    public Double tinhTien(){
        return soLuong*donGia;
    }



    public static void tieuDe(){
        System.out.printf("%10s %10s %10s %10s %n","Tên Hàng","Số Lượng","Đơn giá","Thành tiền");
    }


    public void xuat(){
        DecimalFormat df = new DecimalFormat("###, ###.0#");
        System.out.printf("%10s %10d %10.2f %10s %n",tenHang,soLuong,donGia,df.format(tinhTien()));
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
}
