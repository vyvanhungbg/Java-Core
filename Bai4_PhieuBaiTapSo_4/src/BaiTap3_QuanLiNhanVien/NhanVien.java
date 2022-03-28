package BaiTap3_QuanLiNhanVien;

import java.util.Calendar;
import java.util.Scanner;

public abstract class NhanVien {

    public  static Scanner scanner = new Scanner(System.in);
    protected static double phuCapCoBan = 100000;

    protected String hoTen;
    protected int namVaoLam;
    protected int  ngayNghi;



    public void nhap(){
        System.out.println("Nhập tên nhân viên : ");
        hoTen = scanner.nextLine();
        System.out.println("Nhập nam vào làm : ");
        namVaoLam = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số ngày nghỉ : ");
        ngayNghi = Integer.parseInt(scanner.nextLine());
    }

    public  abstract double tinhLuong();


    public void xuat(){
        System.out.printf("%-12s %-12d %-12d %-12.2f",hoTen,namVaoLam,ngayNghi,phuCap());
    }

    public static void nhan(){
        System.out.printf("%-12s %-12s %-12s %-12s","hoTen","namVaoLam","ngayNghi","phuCap");
    }

    public double phuCap(){
        Calendar calendar = Calendar.getInstance();
        int now = calendar.get(Calendar.YEAR);
        return phuCapCoBan+ (namVaoLam < now ? 20000*(now-namVaoLam) : 0);
    }


}
