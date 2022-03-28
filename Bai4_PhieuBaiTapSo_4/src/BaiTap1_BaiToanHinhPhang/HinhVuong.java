package BaiTap1_BaiToanHinhPhang;

public class HinhVuong extends HinhPhang{
    private double canh;

    @Override
    public double dienTich() {
        return canh*canh;
    }

    @Override
    public double chuVi() {
        return canh*4;
    }

    @Override
    public void nhap() {
        System.out.println("Nhập kích thước 1 cạnh : ");
        canh = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public void xuat() {
        System.out.println("Diện tích hình vuông là : "+dienTich());
        System.out.println("Chu vi hình vuông là    : "+chuVi());
    }
}
