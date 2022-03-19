package BaiTap2_QuanLiTienDien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HoaDon {
    private List<KhachHang> list = new ArrayList<>();

    public void nhap(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập số khách hàng !");
        int n = Integer.parseInt(scanner.nextLine());
        for(int i=0;i<n;i++){
            do {
                System.out.println("Chọn khách hàng : ");
                System.out.println("1_ Khách hàng việt nam   : ");
                System.out.println("2_ Khách hàng nước ngoài : ");
                int choose = Integer.parseInt(scanner.nextLine());
                if(choose == 1){
                    KhachHang khachHang = new KhachHangVN();
                    khachHang.nhap();
                    list.add(khachHang);
                    break;
                }
                if(choose == 2){
                    KhachHang khachHang = new KhachHangNuocNgoai();
                    khachHang.nhap();
                    list.add(khachHang);
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

    public void trungBinhThanhTienCuaNguoiNuocNgoai(){
        double tong = 0;
        int dem = 0;
        for (KhachHang item :list) {
            if(item instanceof KhachHangNuocNgoai){
                tong+=item.tinhTien();
                dem++;
            }
        }
        if(dem !=0){
            System.out.println("Trung binh tien điện của người nước ngoài là : "+(tong/dem));
        }else {
            System.out.println("Không có khách hàng người nước ngoài nào !");
        }
    }

    public void xuatTheoThang(int thang, int nam ){
        System.out.println("Danh sách hóa đơn trong tháng "+thang + " nam "+nam +"là : ");
        for(int i=0;i<list.size();i++){
            int mThang = list.get(i).ngay.getThang();
            int mNam = list.get(i).ngay.getNam();
            if(mThang == thang && mNam == nam){
                list.get(i).xuat();
            }
        }
    }
}
