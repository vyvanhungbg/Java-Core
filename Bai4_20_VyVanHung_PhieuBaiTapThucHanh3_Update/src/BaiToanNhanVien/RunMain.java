package BaiToanNhanVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        NhanVien nhanVien1 = new NhanVien();
        nhanVien1.nhap();
        NhanVien nhanVien2 = new NhanVien();
        nhanVien2.nhap();
        NhanVien.XuatTieuDe();
        nhanVien1.inDL();
        nhanVien2.inDL();

        // Mở rộng
        List<NhanVien> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng nhân viên ");
        int n = Integer.parseInt(scanner.nextLine());
        for(int i=0;i<n;i++){
            NhanVien nhanVien = new NhanVien();
            nhanVien.nhap();
        }
        System.out.println("Danh sách nhân viên là : ");
        NhanVien.XuatTieuDe();
        for (NhanVien nhanVien:list) {
            nhanVien.inDL();
        }

        System.out.println("Danh sách nhân viên vượt chuẩn là : ");
        NhanVien.XuatTieuDe();
        for (NhanVien nhanVien:list) {
            if(nhanVien.coVuotChuan())
                nhanVien.inDL();
        }
    }
}
