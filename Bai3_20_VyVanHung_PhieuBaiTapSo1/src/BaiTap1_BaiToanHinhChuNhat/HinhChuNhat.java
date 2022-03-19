package BaiTap1_BaiToanHinhChuNhat;

import java.text.DecimalFormat;
import java.util.Random;

public class HinhChuNhat {
    private float dai,rong;
    public float tinhDienTich(){
        return dai*rong;
    }
    public float tinhChuVi() {
        return (dai+rong)*2;
    }
    void nhap() {
        Random random = new Random();
        dai = random.nextFloat() + 1;
        rong = random.nextFloat() + 1;
    }
    public static void inTieuDe(){
        System.out.printf("%15s%15s%15s%15s%n",
                "Chiều dài ","Chiều rộng "," chu vi","Diện tich");
    }
    public void xuat() {

        System.out.printf("%15.1f%15.1f%15.1f%15.1f%n",
                dai,rong,tinhChuVi(),tinhDienTich());
    }
    public static void main(String[] args) {
        HinhChuNhat h=new HinhChuNhat();
        h.nhap();
        HinhChuNhat.inTieuDe();
        h.xuat();
    }

}