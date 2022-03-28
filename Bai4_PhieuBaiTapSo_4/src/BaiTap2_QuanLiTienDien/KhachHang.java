package BaiTap2_QuanLiTienDien;

import java.util.Scanner;

public abstract class KhachHang {
    public  static Scanner scanner = new Scanner(System.in);
    protected String maKhachHang;
    protected String hoTen;
    protected Date ngay = new Date();
    protected double soKw;
    protected double donGia;

    public void nhap(){
        System.out.println("Nhập mã KH : ");
        maKhachHang = scanner.nextLine();
        System.out.println("Nhập họ tên : ");
        hoTen = scanner.nextLine();
        System.out.println("Nhập ngày tháng năm :");
        ngay.nhap();
        System.out.println("Nhập soKw");
        soKw = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập đon giá : ");
        donGia = Double.parseDouble(scanner.nextLine());
    }
    public abstract double tinhTien();

    public void xuat(){
        System.out.printf("%-12s %-12s %-12s %-12.2f %-12.2f %-12.2f",maKhachHang,hoTen,ngay.xuat(),soKw,donGia,tinhTien());
    }

    public static void nhan(){
        System.out.printf("%-12s %-12s %-12s %-12s %-12s %-12s","maKhachHang","hoTen","ngay","soKw","donGia","tinhTien");
    }
}
