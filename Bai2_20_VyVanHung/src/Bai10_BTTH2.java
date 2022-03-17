import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Bai10_BTTH2 {

    static Integer[] day ;
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


    static boolean isPrime(int n){
        for(int i=2;i*i <= n;i++)
            if(n % i ==0 )
                return false;
        return n > 1;
    }

    public static void XuLiMang(){
        int count =0;
        for(int i=0;i<n;i++){
            if(!isPrime(day[i])){
                for (int j=i;j<n;j++){
                    if(isPrime(day[j])){
                        int tmp = day[i];
                        day[i] = day[j];
                        day[j] = tmp;
                    }
                }
            }
        }
        while (isPrime(day[count]) && count <n)
            count++;
        Arrays.sort(day,0,count);
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
        XuLiMang();
        //sapXep();
        hienThi();
    }
}
