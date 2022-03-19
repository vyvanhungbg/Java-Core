package BaiTap1_BaiToanSinhVien;

import java.util.*;

public class XuatSinhVien {
    static List<SinhVien> list = new ArrayList<>();
    public static void main(String[] args) {
        nhap();
        xuat();
        sinhVienCoDiemTbCaoNhat();
    }

    public static void sinhVienCoDiemTbCaoNhat(){
        Comparator<SinhVien> comparator =new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien t, SinhVien t1) {
                return
                        Double.compare(t.diemTrungBinh(), t1.diemTrungBinh());
            }} ;
        SinhVien sv = Collections.max(list,comparator);
        System.out.println("Sinh viên có điểm tb cao nhất là : ");
        System.out.println(sv.toString());
    }

    public static void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên :");
        int n = Integer.parseInt(scanner.nextLine());
        for(int i=0;i<n;i++){
            SinhVien sinhVien = new SinhVien();
            sinhVien.nhap();
            list.add(sinhVien);
        }
    }

    public static void xuat(){
        for (SinhVien sinhVien: list) {
            System.out.println(sinhVien.toString());;
        }
    }
}
