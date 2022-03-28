package BaiTap1_BaiToanHinhPhang;

import java.util.Scanner;

public abstract class HinhPhang {
    public static Scanner scanner = new Scanner(System.in);
    public abstract double dienTich();
    public abstract double chuVi();
    public abstract void nhap();
    public abstract void xuat();
}
