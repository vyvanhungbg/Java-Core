package BaiTap2_QuanLiTienDien;

public class KhachHangNuocNgoai extends KhachHang{

    private String quocTich;

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhập quốc tích :");
        quocTich = scanner.nextLine();
    }

    @Override
    public void xuat() {
        KhachHang.nhan();
        System.out.printf("%-12s %n","quocTich");
        super.xuat();
        System.out.printf("%-12s %n",quocTich);
    }

    @Override
    public double tinhTien() {
        return donGia*soKw;
    }
}
