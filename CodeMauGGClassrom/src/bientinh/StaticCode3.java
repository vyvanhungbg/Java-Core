package BGDT_Lop_BienTinh;
public class StaticCode3 {
    int m;
    static long n;
    static {
        n=1000;
    }
    public static void main(String[] args) {
        System.out.println("static n="+StaticCode3.n);
        StaticCode3 obj=new StaticCode3();
        System.out.println("static n theo obj="+StaticCode3.n);
    }  
}
