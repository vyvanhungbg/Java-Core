package BaiTap2_QuanLiTienDien;

public class KhachHangVN extends KhachHang{
    private String doiTuongKH;
    private int dinhMuc;

    @Override
    public void nhap(){
        super.nhap();
        System.out.println("Nhập đối tượng khách hàng : ");
        doiTuongKH = scanner.nextLine();
        System.out.println("Nhập định mức : ");
        dinhMuc = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public void xuat() {
        KhachHang.nhan();
        System.out.printf("%-12s %-12s %n","DoiTuongKh","dinhMuc");
        super.xuat();
        System.out.printf("%-12s %-12d %n",doiTuongKH,dinhMuc);

    }

    @Override
    public double tinhTien() {
        if(soKw <= dinhMuc)
            return soKw*donGia;
        return soKw*donGia*dinhMuc + (soKw-dinhMuc)*donGia*2.5;
    }
}
