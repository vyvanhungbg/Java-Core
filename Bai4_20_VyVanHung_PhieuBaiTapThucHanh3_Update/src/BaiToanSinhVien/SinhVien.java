package BaiToanSinhVien;

import java.util.Scanner;

public class SinhVien {
    private int maSinhVien;
    private String hoTen;
    private double diemLT;
    private double diemTH;


    public SinhVien() {
        this.maSinhVien = 0;
        this.hoTen = "";
        this.diemLT = 0;
        this.diemTH = 0;
    }

    public SinhVien(int maSinhVien, String hoTen, double diemLT, double diemTH) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(double diemLT) {
        this.diemLT = diemLT;
    }

    public double getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(double diemTH) {
        this.diemTH = diemTH;
    }

    public  static  void inTieuDe(){
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %n","Mã SV","Họ Tên","Điêm LT","Điểm TH","Điểm TB");
    }

    public void inDL(){
        System.out.printf("%-20d %-20s %-20.3f %-20.3f %-20.3f %n",maSinhVien,hoTen,diemLT,diemTH,diemTB());
    }
    public double diemTB(){
        return (diemLT+diemTH)/2;
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên :");
        maSinhVien = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập họ tên :");
        hoTen = scanner.nextLine();
        System.out.println("Nhập điểm LT");
        diemLT = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập điểm TH");
        diemTH = Double.parseDouble(scanner.nextLine());
    }
}
