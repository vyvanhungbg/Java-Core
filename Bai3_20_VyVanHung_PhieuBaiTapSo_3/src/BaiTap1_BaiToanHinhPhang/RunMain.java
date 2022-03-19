package BaiTap1_BaiToanHinhPhang;

public class RunMain {
    public static void main(String[] args) {
        HinhPhang hinhChuNhat = new HinhChuNhat();
        hinhChuNhat.nhap();
        hinhChuNhat.xuat();

        HinhPhang hinhTron = new HinhTron();
        hinhTron.nhap();
        hinhTron.xuat();
    }
}
