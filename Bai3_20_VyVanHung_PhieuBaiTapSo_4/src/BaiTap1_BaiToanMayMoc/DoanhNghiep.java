package BaiTap1_BaiToanMayMoc;

import java.util.Scanner;
public class DoanhNghiep {
    private String tenDN;
    private String soDT;
    private String diaChi;
    public void nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập tên DN, số điện thoại, địa chỉ:");
        tenDN=sc.nextLine();
        soDT=sc.nextLine();
        diaChi=sc.nextLine();
    }
    @Override
    public String toString() {
        return "("+tenDN + "," + soDT + "," + diaChi+")";
    }
}
