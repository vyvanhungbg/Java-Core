import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class HoaDon {
    private String maHoaDon;
    private String ngayLap;
    private KhachHang khachHang = new KhachHang();
    private HangHoa dsHang [];


    public HoaDon(String maHoaDon, String ngayLap, KhachHang khachHang, HangHoa[] dsHang) {
        this.maHoaDon = maHoaDon;
        this.ngayLap = ngayLap;
        this.khachHang = khachHang;
        this.dsHang = dsHang;
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã hóa đơn");
        maHoaDon = scanner.nextLine();
        System.out.println("Nhập ngày lập ");
        ngayLap = scanner.nextLine();
        khachHang.nhap();
        System.out.println("Nhập số lượng hàng hóa");
        int n = Integer.parseInt(scanner.nextLine());
        dsHang = new HangHoa[n];
        for (int i=0;i<n;i++){
            dsHang[i] = new HangHoa();
            dsHang[i].nhap();
        }

    }

    public void xuatTieuDeHoaDon(){
        System.out.printf("Mã HD : %-10s Ngày bán : %-10s %n",maHoaDon,ngayLap);
    }

    public void tinhTongTien(){
        DecimalFormat df = new DecimalFormat("###, ###.0#");
        double tong = 0;
        for(int i=0;i<dsHang.length;i++)
            tong+=dsHang[i].tinhTien();
        System.out.printf("%nTổng tiền  : %30s",df.format(tong));
    }

    public void sapXep(){
        Arrays.sort(dsHang, new Comparator<HangHoa>() {
            @Override
            public int compare(HangHoa o1, HangHoa o2) {

                if(o1.getTenHang().compareToIgnoreCase(o2.getTenHang()) != 0)
                    return o1.getTenHang().compareToIgnoreCase(o2.getTenHang());
                else
                    return o1.tinhTien()>o2.tinhTien() ? 1:-1;
            }
        });
    }

    public void xuat(){

        xuatTieuDeHoaDon();
        khachHang.xuat();
        HangHoa.tieuDe();
        for(int i=0;i<dsHang.length;i++){
            dsHang[i].xuat();
        }
        tinhTongTien();
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "maHoaDon='" + maHoaDon + '\'' +
                ", ngayLap='" + ngayLap + '\'' +
                ", khachHang=" + khachHang +
                ", dsHang=" + Arrays.toString(dsHang) +
                '}';
    }

    public HoaDon() {
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public HangHoa[] getDsHang() {
        return dsHang;
    }

    public void setDsHang(HangHoa[] dsHang) {
        this.dsHang = dsHang;
    }
}
