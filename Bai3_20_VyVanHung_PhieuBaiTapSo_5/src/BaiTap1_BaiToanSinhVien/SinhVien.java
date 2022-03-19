package BaiTap1_BaiToanSinhVien;

import java.util.Scanner;

public class SinhVien implements ChuyenNganh{
    private String ho;
    private String ten;
    private DiaChi diaChiNha = new DiaChi();
    private DiaChi diaChiTruong = new DiaChi();
    private double diem01;
    private double diem02;
    private double diem03;
    private String tenCN;


    void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ : ");
        ho = scanner.nextLine();
        System.out.println("Nhập tên : ");
        ten = scanner.nextLine();
        System.out.println("Nhập địa chỉ nhà    :");
        diaChiNha.nhap();
        System.out.println("Nhập địa chỉ trường : ");
        diaChiTruong.nhap();
        System.out.println("Nhập điểm thứ nhất  : ");
        setCotDiem(1,Double.parseDouble(scanner.nextLine()));
        System.out.println("Nhập điểm thứ hai   : ");
        setCotDiem(2,Double.parseDouble(scanner.nextLine()));
        System.out.println("Nhập điểm thứ ba    : ");
        setCotDiem(3,Double.parseDouble(scanner.nextLine()));
        System.out.println("Nhập chuyên ngành : ");
        setChuyenNganh(scanner.nextLine());
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public DiaChi getDiaChiNha() {
        return diaChiNha;
    }

    public void setDiaChiNha(DiaChi diaChiNha) {
        this.diaChiNha = diaChiNha;
    }

    public DiaChi getDiaChiTruong() {
        return diaChiTruong;
    }

    public void setDiaChiTruong(DiaChi diaChiTruong) {
        this.diaChiTruong = diaChiTruong;
    }

    public double getCotDiem(int loaiDiem) {
        if(loaiDiem == 1) {
            return diem01;
        }else
        if(loaiDiem == 2) {
            return diem02;
        }else
        if(loaiDiem == 3) {
            return diem03;
        }else
            return -1;
    }

    public void setCotDiem(int loaiDiem,double diem) {
       if(loaiDiem == 1) {
           this.diem01 = diem;
       }else
        if(loaiDiem == 2) {
            this.diem02 = diem;
        }else
        if(loaiDiem == 3) {
            this.diem03 = diem;
        }
    }


    public double diemTrungBinh(){
        return (diem01+diem02+diem03)/3;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "ho='" + ho + '\'' +
                ", ten='" + ten + '\'' +
                ", diaChiNha=" + diaChiNha.toString() +
                ", diaChiTruong=" + diaChiTruong.toString() +
                ", diem01=" + diem01 +
                ", diem02=" + diem02 +
                ", diem03=" + diem03 +
                ", diem03=" + diemTrungBinh() +
                ", tenCN='" + getChuyenNganh() + '\'' +
                '}';
    }

    @Override
    public void setChuyenNganh(String tenCN) {
        this.tenCN = tenCN;
    }

    @Override
    public String getChuyenNganh() {
        return tenCN;
    }
}
