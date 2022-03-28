package BaiTap1_BaiToanHinhPhang;

public class HinhChuNhat extends HinhPhang {
    private double dai;
    private double rong;

    @Override
    public double dienTich() {
        return dai*rong;
    }

    @Override
    public double chuVi() {
        return (dai+rong)*2;
    }

    @Override
    public void nhap() {
        System.out.println("Nhập chiều dài  : ");
        dai = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chiều rộng  : ");
        rong = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public void xuat() {
        System.out.println("Diện tích hình chữ nhật là : "+dienTich());
        System.out.println("Chu vi hình chữ nhật là    : "+chuVi());
    }
}
