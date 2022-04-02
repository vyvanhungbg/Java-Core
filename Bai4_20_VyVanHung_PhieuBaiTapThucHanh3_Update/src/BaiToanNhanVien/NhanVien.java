/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiToanNhanVien;

import java.util.Scanner;

/**
 *
 * @author vyvan
 */
public class NhanVien {
    private String maNhanVien;
    private int soSanPham;
    private static int SO_SAN_PHAM_CHUAN = 500;
    private static int GIA_SAN_PHAM_CO_BAN = 20000;
    private static int GIA_SAN_PHAM_VUOT_CHUAN = 30000;

    public NhanVien() {
    }

    public NhanVien(String maNhanVien, int soSanPham) {
        this.maNhanVien = maNhanVien;
        this.soSanPham = soSanPham;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public int getSoSanPham() {
        return soSanPham;
    }

    public void setSoSanPham(int soSanPham) throws Exception {
        if(soSanPham <=0){
            throw new Exception("Số lượng sản phẩm phải lớn hơn 0");
        }else {
            this.soSanPham = soSanPham;
        }
    }

    public boolean coVuotChuan(){
            return soSanPham>500;
    }

    public String getTongKet(){
            if(coVuotChuan()){
                return "Vượt";
            }
            return "";
    }
    public double getLuong(){
        if(coVuotChuan()){
            return GIA_SAN_PHAM_CO_BAN*SO_SAN_PHAM_CHUAN+(soSanPham-SO_SAN_PHAM_CHUAN)*GIA_SAN_PHAM_VUOT_CHUAN;
        }else {
            return GIA_SAN_PHAM_CO_BAN*soSanPham;
        }
    }
    public  static  void XuatTieuDe(){
        System.out.printf("%-20s %-20s %-20s %-20s %n","Mã NV","Số SP","Lương","Tổng kết");
    }

    public void inDL(){
        System.out.printf("%-20s %-20d %-20.3f %-20s %n",maNhanVien,soSanPham,getLuong(),getTongKet());
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "maNhanVien='" + maNhanVien + '\'' +
                ", soSanPham=" + soSanPham +
                '}';
    }

    public void nhap(){
        boolean oke = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập mã nhân viên :");
            setMaNhanVien( scanner.nextLine());
            System.out.println("Nhập số sản phẩm ");
            try {
                setSoSanPham(soSanPham = Integer.parseInt(scanner.nextLine()));
                oke= true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                oke = false;
            }
        }while (!oke);
    }
}
