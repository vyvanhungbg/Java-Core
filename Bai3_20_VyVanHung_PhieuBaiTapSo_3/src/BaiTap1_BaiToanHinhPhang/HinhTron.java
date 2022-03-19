package BaiTap1_BaiToanHinhPhang;

public class HinhTron extends HinhPhang{
    private double banKinh;

    @Override
    public double dienTich() {
        return banKinh*banKinh*Math.PI;
    }

    @Override
    public double chuVi() {
        return 2*banKinh*Math.PI;
    }

    @Override
    public void nhap() {
        System.out.println("Nhập bán kính : ");
        banKinh = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public void xuat() {
        System.out.println("Diện tích hình tròn là : "+dienTich());
        System.out.println("Chu vi hình tròn là    : "+chuVi());
    }
}
