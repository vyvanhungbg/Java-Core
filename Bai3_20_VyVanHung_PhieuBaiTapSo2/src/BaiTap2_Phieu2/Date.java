package BaiTap2_Phieu2;

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
}
