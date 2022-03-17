import java.util.Scanner;

public class Main {
    static int UCLN(int a, int b)
    {
        if(b==0) return a;
        if(a%b==0) return b;
        return UCLN(b,a%b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println( "UCLN a va b : "+ UCLN(a,b));
    }
}
