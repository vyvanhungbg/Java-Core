package BaiTap3_QuanLiNhanVien;

public class NhanVienSanXuat extends NhanVien{

    private int sanPham;
    private static double luongTrenMotSanPham = 10000;

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhập số lượng sản phẩm : ");
        sanPham = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public void xuat() {
        NhanVien.nhan();
        System.out.printf("%-12s %-12s %n","sanPham","tinhLuong");
        super.xuat();
        System.out.printf("%-12d %-12.2f %n",sanPham,tinhLuong());
    }

    @Override
    public double tinhLuong() {
        return sanPham*luongTrenMotSanPham;
    }
}
