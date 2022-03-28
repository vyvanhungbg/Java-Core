package BaiTap3_QuanLiNhanVien;

public class NhanVienVanPhong extends NhanVien {
    private double luong;
    private static double mucPhatNghiMotNgay = 10000;
    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhập lương cơ bản : ");
        luong = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public void xuat() {
        NhanVien.nhan();
        System.out.printf("%-12s %n","tinhLuong");
        super.xuat();
        System.out.printf("%-12.2f %n",tinhLuong());
    }

    @Override
    public double tinhLuong() {
        return luong - ngayNghi*mucPhatNghiMotNgay;
    }
}
