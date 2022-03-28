package BaiTap3_QuanLiNhanVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLiNhanVien {
    List<NhanVien> list = new ArrayList<>();

    public void nhap(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập số nhân viên !");
        int n = Integer.parseInt(scanner.nextLine());
        for(int i=0;i<n;i++){
            do {
                System.out.println("Chọn nhân viên : ");
                System.out.println("1_ Nhân viên sản xuất   : ");
                System.out.println("2_ Nhân viên văn phòng : ");
                int choose = Integer.parseInt(scanner.nextLine());
                if(choose == 1){
                    NhanVienSanXuat nhanVienSanXuat = new NhanVienSanXuat();
                    nhanVienSanXuat.nhap();
                    list.add(nhanVienSanXuat);
                    break;
                }
                if(choose == 2){
                    NhanVienVanPhong nhanVienVanPhong = new NhanVienVanPhong();
                    nhanVienVanPhong.nhap();
                    list.add(nhanVienVanPhong);
                    break;
                }
            }while (true);

        }
    }

    public void xuat(){
        for(int i=0;i<list.size();i++){
            list.get(i).xuat();
        }
    }

    public void tongTienCongTyPhaiTra(){
        double tong = 0;
        for (NhanVien nhanVien:list) {
            tong+= nhanVien.tinhLuong();
        }
        System.out.println("Tổng tiền công ty phải trả là : "+tong);
    }
}
