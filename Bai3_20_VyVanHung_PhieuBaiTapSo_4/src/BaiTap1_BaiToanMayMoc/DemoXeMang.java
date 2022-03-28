package BaiTap1_BaiToanMayMoc;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

// Code mẫu của giáo viên
public class DemoXeMang {
    static Xe dsXe[];
    static int n;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("==============Quan ly xe==============");
        int chon;
        do{
            System.out.print("1\tNhập danh sách xe\n");
            System.out.print("2\tIn danh sách xe\n");
            System.out.print("3\tTìm kiếm xe có trọng tải max\n");
            System.out.print("4\tXóa xe theo stt\n");
            System.out.print("5\tThoát\n");
            chon=sc.nextInt();
            switch(chon){
                case 1:
                    nhapXe(); break;
                case 2:
                    inDSXe(); break;
                case 3:
                    timXeTrongTaiMax();
                    break;
                case 4:
                    System.out.print("Nhập số xe cần xóa:");
                    int stt=sc.nextInt();
                    xoaXe(stt); break;
            }
        }
        while(chon!=5);

    }
    public static void nhapXe() {
        Scanner s=new Scanner(System.in);
        System.out.println("nhập số lượng xe=");
        n=s.nextInt();
        dsXe=new Xe[n];
        for(int i=0; i<n ; i++){
            Xe xe = new Xe();
            xe.nhap();
            dsXe[i]=xe;
        }
    }
    public static void inDSXe() {
        Xe.inTieuDe();
        for (int i = 0; i < dsXe.length; i++) {
            dsXe[i].inDL();
        }
    }
    public static boolean xoaXe(int stt) {
        if ((stt>=0)&&(stt<dsXe.length)){
            //sinh viên tự hoàn thiện xóa 1 phần tử trong mảng
            return true;
        }
        else
        { System.out.println("vi tri xe ngoai pham vi");
            return false;
        }
    }
    public static void timXeTrongTaiMax(){
        Comparator<Xe> c=new Comparator<Xe>() {
            @Override
            public int compare(Xe t, Xe t1) {
                return
                        Float.compare(t.getTrongTai(), t1.getTrongTai());
            }} ;
        Xe x= Collections.max(Arrays.asList(dsXe),c);
        System.out.println("DS xe co trong tai max=");
        Xe.inTieuDe();
        float max=x.getTrongTai();
        for (int i = 0; i < dsXe.length; i++) {
            if (dsXe[i].getTrongTai()==max) {
                dsXe[i].inDL();
            }
        }
    }
}