import java.util.Scanner;

public class Main {
    public static boolean SNT(int a){
        for(int i=2; i*i<=a;i++){
            if(a%i ==0 ){
                return false;
            }
        }
        return a>1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println( "a  la so nguyen to : "+ SNT(a));
    }
}
