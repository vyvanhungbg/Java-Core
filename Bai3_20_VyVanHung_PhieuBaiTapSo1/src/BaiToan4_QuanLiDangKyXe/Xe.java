package BaiToan4_QuanLiDangKyXe;

import java.util.Scanner;

public class Xe {
    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private double triGia;

    public Xe(String tenChuXe, String loaiXe, int dungTich, double triGia) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên chủ xe : ");
        tenChuXe = scanner.nextLine();
        System.out.println("Nhập loại xe : ");
        loaiXe = scanner.nextLine();
        System.out.println("Nhập dung tích : ");
        dungTich = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên chủ xe : ");
        triGia = Double.parseDouble(scanner.nextLine());
    }

    public void xuat(){
        System.out.printf("%-15s %-15s %-15d %-15.2f %-15.2f %n",tenChuXe,loaiXe,dungTich,triGia,tinhThue());
    }

    public static void nhan(){
        System.out.printf("%-15s %-15s %-15s %-15s %-15s%n","tenChuXe","loaiXe","dungTich","triGia","thue");
    }

    public double tinhThue(){
        if(dungTich <100){
            return 0.01*triGia;
        }else if(dungTich >= 100 && dungTich <200){
            return 0.03*triGia;
        }else {
            return  0.05*triGia;
        }
    }

    public Xe() {
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }
}
