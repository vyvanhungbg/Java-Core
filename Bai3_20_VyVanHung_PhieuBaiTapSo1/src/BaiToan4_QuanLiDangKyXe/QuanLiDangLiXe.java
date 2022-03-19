package BaiToan4_QuanLiDangKyXe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLiDangLiXe {
    static Scanner scanner = new Scanner(System.in);
    static List<Xe> list = new ArrayList<>();
    public static void main(String[] args) {
       do{
           System.out.println("Nhập 1 tạo danh sách !");
           System.out.println("Nhập 2 xuất danh sách !");
           System.out.println("Nhập 3 thoát !");
           System.out.println("Nhập lựa chọn : ");
           int choose = Integer.parseInt(scanner.nextLine());

           switch (choose){
               case 1 : nhap();break;
               case 2: xuat();break;
               case 0: return;
           }

       }while (true);

    }

    public static void nhap(){
        System.out.println("Nhập số lượng xe : ");
        int n = Integer.parseInt(scanner.nextLine());
        for(int i=0;i<n;i++){
            Xe xe = new Xe();
            xe.nhap();
            list.add(xe);
        }
    }

    public static void xuat(){
        Xe.nhan();
        for(int i=0;i<list.size();i++){
            list.get(i).xuat();
        }
    }
}
