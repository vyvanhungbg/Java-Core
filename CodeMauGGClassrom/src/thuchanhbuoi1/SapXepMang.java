package thuchanhbuoi1;
import java.util.*;

class SapXepMang{
    static Integer[] day ;
    String str;
     static int n;
        static void nhap(){
            Random rd=new Random();
            for (int k=0; k<n;k++)
                day[k]=rd.nextInt(20);
    }
    static void hienThi()
    {
            for(int k=0; k<n;k++)
                    System.out.print (day[k]+" ");
            System.out.println();
    }
    // sap xep day
    static void sapXep(){
        int tg;
        for( int i=0;i<day.length;i++)
            for( int j=i+1;j<day.length;j++)
                if (day[i]>day[j]){ 
                    tg=day[i];
                    day[i]=day[j];
                    day[j]=tg;
                }
    }
//ham chinh
public static void main (String[] args) {
    //khai báo số phần tử dãy và nhập số phần tử
    day = new Integer[10];
    n = day.length;
    System.out.println(" Nhap vao so phan tu cua day");
    //xin cấp phát dãy số
    nhap();
    //nhập dãy số và in dãy trước khi nhập

    System.out.println ("day truuoc khi sap xep");
    hienThi();
    //sắp xếp dãy số và in lại

    System.out.println ("day sau khi sap xep");
    Arrays.sort(day, Collections.reverseOrder());
    //sapXep();
    hienThi();
    }
}