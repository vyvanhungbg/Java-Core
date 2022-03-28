package try_catch;

import file.DBEngine;

import java.io.File;

public class SinhVienDemo {
    public static void main(String[] args)  {        
       SinhVien sinhVien = new SinhVien("Hung",2);
       //đọc file nếu đã có dữ liệu
       /* v.nhap();
        System.out.println("DL sau khi nhập");
        System.out.println(v);*/
        String fileName = "SinhVien.txt";
        DBEngine db = new DBEngine();

        try {
            db.LuuFile(fileName,sinhVien);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            SinhVien sinhVien1 = (SinhVien) db.docFile(fileName);
            System.out.println( sinhVien1.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

        File file = new File(fileName);
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getPath());
        file.renameTo(new File("SinhVien.txt"));
    }
    
}
