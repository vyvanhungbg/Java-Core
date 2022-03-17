import java.util.Arrays;
import java.util.Random;

public class Bai11_BTTH2 {
    static Integer[][] day ;
    static int n,m;
    static void nhap(){
        Random rd=new Random();
        for (int i=0; i<m;i++){
            for(int j=0;j<n;j++){
                day[i][j]=rd.nextInt(20);
            }

        }

    }
    static void hienThi()
    {
        for (int i=0; i<m;i++){
            for(int j=0;j<n;j++){
                System.out.printf("%-3d",day[i][j]);
            }
            System.out.println();
        }

    }


    static boolean isPrime(int n){
        for(int i=2;i*i <= n;i++)
            if(n % i ==0 )
                return false;
        return n > 1;
    }


    public static void XuLiMang(){
        int min = day[0][0];
        for (int i=0; i<m;i++){
            for(int j=0;j<n;j++){
                if(isPrime(day[i][j]) && day[i][j] > min)
                    min = day[i][j];
            }
        }
        if(isPrime(min)){
            System.out.println("Số nguyên tố lớn nhất trong mảng là : "+min);
        }else {
            System.out.println("Không có số nguyên tố lớn nhất trong mảng ");
        }
    }

    public static void main (String[] args) {
        m=3;
        n=5;
        day = new Integer[m][n];

        System.out.println("Nhập : ");
        nhap();

        System.out.println ("Xuất : ");
        hienThi();
        XuLiMang();

    }

}
