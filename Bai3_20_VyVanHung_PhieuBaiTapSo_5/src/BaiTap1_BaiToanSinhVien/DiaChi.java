package BaiTap1_BaiToanSinhVien;

import java.util.Scanner;

public class DiaChi {
    private String duong;
    private String quan;
    private String thanhPho;
    private long maVung;

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường : ");
        duong = scanner.nextLine();
        System.out.println("Nhập quận : ");
        quan = scanner.nextLine();
        System.out.println("Nhập thành phố : ");
        thanhPho = scanner.nextLine();
        System.out.println("Nhập mã vùng : ");
        maVung = Long.parseLong(scanner.nextLine());
    }

    @Override
    public String toString() {
        return "DiaChi{" +
                "duong='" + duong + '\'' +
                ", quan='" + quan + '\'' +
                ", thanhPho='" + thanhPho + '\'' +
                ", maVung=" + maVung +
                '}';
    }
}
