package BaiTap2_QuanLiTienDien;

import java.util.Scanner;

public class Date {
    private int ngay;
    private int thang;
    private int nam;

   public void nhap(){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Nhập ngày : ");
       ngay = Integer.parseInt(scanner.nextLine());
       System.out.println("Nhập tháng : ");
       thang = Integer.parseInt(scanner.nextLine());
       System.out.println("Nhập năm : ");
       nam = Integer.parseInt(scanner.nextLine());
   }
    public String xuat(){
      return String.format("%2d//%2d//%4d",ngay,thang,nam);
   }


    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
}
