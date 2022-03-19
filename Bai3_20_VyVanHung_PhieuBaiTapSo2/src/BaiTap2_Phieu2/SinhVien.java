package BaiTap2_Phieu2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SinhVien {
    private String hoTen;
    private Date ngaySinh = new Date();
    private List<Mon> mons = new ArrayList<>();
    private float diemThi;


    public SinhVien(String hoTen, Date ngaySinh, List<Mon> mons, float diemThi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.mons = mons;
        this.diemThi = diemThi;
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ tên : ");
        hoTen = scanner.nextLine();
        ngaySinh.nhap();
        System.out.println("Nhập số môn học : ");
        int n = Integer.parseInt(scanner.nextLine());
        for(int i=0;i<n;i++){
            Mon mon = new Mon();
            mon.nhap();
            mons.add(mon);
        }
        System.out.println("Nhập điểm thi : ");
        diemThi = Integer.parseInt(scanner.nextLine());
    }

    public void xuat(){
        tieuDe();
        System.out.printf("%-20s %-20s %-20.2f %n",hoTen,ngaySinh.xuat(),diemThi);
        Mon.tieuDe();
        for (int i=0;i<mons.size();i++){
            mons.get(i).xuat();
        }
    }

    public static void tieuDe(){
        System.out.printf("%-20s %-20s %-20s %n","hoTen","ngaySinh","diemThi");

    }

    public SinhVien() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public List<Mon> getMons() {
        return mons;
    }

    public void setMons(List<Mon> mons) {
        this.mons = mons;
    }

    public float getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(float diemThi) {
        this.diemThi = diemThi;
    }
}
