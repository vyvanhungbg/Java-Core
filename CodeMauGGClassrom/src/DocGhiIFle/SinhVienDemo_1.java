package DocGhiIFle;
public class SinhVienDemo_1 {
    static String fileName="src/DocGhiIFle/SinhVien.txt";
    //d:/sinhvien.txt
    static DBEngine db=new DBEngine();
    public static void main(String[] args)  {
        //SinhVien v=new SinhVien();
        //đọc file nếu đã có dữ liệu
       // v.nhap();
       // System.out.println("DL sau khi nhập");
       // System.out.println(v);
        SinhVien sinhVien = new SinhVien("Hùng",34);
        luuSinhVien(sinhVien);
        docSinhVien();
    }

    private static void docSinhVien() {
        SinhVien v;
        try {
            v=(SinhVien) db.docFile(fileName);
            System.out.print("file sau khi đọc:" );
            System.out.println(v);
        } catch (Exception ex) {
            System.out.print("lỗi đọc file");
//            Logger.getLogger(SinhVienDemo.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }

    private static void luuSinhVien(SinhVien v) {
        try {
            db.LuuFile(fileName, v);
        } catch (Exception ex) {
            // Logger.getLogger(SinhVienDemo.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print("lỗi ghi file");
            ex.printStackTrace();
        }
    }

}
