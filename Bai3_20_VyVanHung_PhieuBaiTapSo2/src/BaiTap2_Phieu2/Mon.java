package BaiTap2_Phieu2;

import java.util.Scanner;

public class Mon {
    private String tenMon;
    private int soHocTring;
    private String hocKy;

    public Mon(String tenMon, int soHocTring, String hocKy) {
        this.tenMon = tenMon;
        this.soHocTring = soHocTring;
        this.hocKy = hocKy;
    }

    public Mon() {
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public int getSoHocTring() {
        return soHocTring;
    }

    public void setSoHocTring(int soHocTring) {
        this.soHocTring = soHocTring;
    }

    public String getHocKy() {
        return hocKy;
    }

    public void setHocKy(String hocKy) {
        this.hocKy = hocKy;
    }

    void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên môn học :");
        tenMon = scanner.nextLine();
        System.out.println("Nhập học trình : ");
        soHocTring = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập học kì : ");
        hocKy = scanner.nextLine();
    }

    public void xuat(){
        System.out.printf("%-20s %-20d %-20s %n",tenMon,soHocTring,hocKy);
    }

    public static void tieuDe(){
        System.out.printf("%-20s %-20s %-20s %n","tenMon","soHocTring","hocKy");
    }


}
