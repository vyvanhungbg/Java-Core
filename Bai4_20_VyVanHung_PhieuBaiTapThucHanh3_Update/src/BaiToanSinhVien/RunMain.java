package BaiToanSinhVien;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        SinhVien sinhVien1 = new SinhVien(1,"hùng",5.6,7.8);
        sinhVien1.nhap();
        SinhVien sinhVien2 = new SinhVien(1,"hùng",5.6,7.8);
        SinhVien sinhVien3 = new SinhVien();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên :");
        sinhVien3.setMaSinhVien( Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập họ tên :");
        sinhVien3.setHoTen(scanner.nextLine());
        System.out.println("Nhập điểm LT");
        sinhVien3.setDiemLT(Double.parseDouble(scanner.nextLine()));
        System.out.println("Nhập điểm TH");
        sinhVien3.setDiemTH(Double.parseDouble(scanner.nextLine()));

        SinhVien.inTieuDe();
        sinhVien1.inDL();
        sinhVien2.inDL();
        sinhVien3.inDL();

        SinhVien sinhVien = (sinhVien1.diemTB()>sinhVien2.diemTB()?sinhVien1:sinhVien2).diemTB() > sinhVien3.diemTB()? (sinhVien1.diemTB()>sinhVien2.diemTB()?sinhVien1:sinhVien2) :sinhVien3;
        System.out.println("Sinh viên có điểm TB Cao nhất là : ");
        SinhVien.inTieuDe();
        sinhVien.inDL();
    }
}
