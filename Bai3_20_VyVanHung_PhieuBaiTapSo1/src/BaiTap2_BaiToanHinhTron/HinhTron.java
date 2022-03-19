package BaiTap2_BaiToanHinhTron;

import BaiTap1_BaiToanHinhChuNhat.HinhChuNhat;

import java.util.Random;

public class HinhTron {
    private float banKinh;
    public double tinhChuVi(){
        return 2*banKinh*Math.PI;
    }
    public double tinhDienTich() {
        return Math.PI*banKinh*banKinh;
    }
    void nhap() {
        Random random = new Random();
        banKinh = random.nextFloat() + 1;

    }
    public static void inTieuDe(){
        System.out.printf("%15s%15s%15s%n"
               ,"Bán kính "," chu vi","Diện tich");
    }
    public void xuat() {

        System.out.printf("%15.1f%15.1f%15.1f%n"
                ,banKinh,tinhChuVi(),tinhDienTich());
    }
    public static void main(String[] args) {
        HinhTron h =new HinhTron();
        h.nhap();
        HinhTron.inTieuDe();
        h.xuat();
    }
}
