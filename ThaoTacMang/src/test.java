import java.util.Scanner;

public class test {

    static int arr[] ;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
      do{
          int n;
          message("=======================");
          message("1. Nhập mảng  ");
          message("2. Xuất mảng  ");
          message("3. Thêm phần tử vào vị trí k ");
          message("4. Xoá phần tử ở vị trí k ");
          message("5. Đảo ngược mảng ");
          message("6. Hiển thị phần tử ở vị trí 2 và các số chia hết cho phần tử ở vị trí 2  ");
          message("7. Tính tổng các số nguyên tố trong mảng   ");
          message("8. Thoát ! ");
          message("\n---Nhập lựa chọn :");
          n = sc.nextInt();
          switch (n){

              case  1 : input();break;
              case  2 : output();break;
              case  3 : insert();break;
              case  4 : delete();break;
              case  5 : reverse();break;
              case  6 : firstElement();break;
              case  7 : sumOfPrimeNumber();break;
              case  8 : message("Đã thoát chương trình !");System.exit(0);break;
          }
      }while (true);
    }

    private static void sumOfPrimeNumber() {
        int sum =0;
        for (int item :arr) {
            if(isPrime(item))
                sum += item;
        }
        message("Tổng các số nguyên tố có trong mảng là : "+sum);
    }
    static boolean isPrime(int n){
        for(int i=2;i*i <= n;i++)
            if(n % i ==0 )
                return false;
        return n > 1;
    }

    private static void reverse() {
        int n = arr.length;
        for(int i=0; i<n/2 ;i++){
            int tmp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = tmp;
        }
        message("Đảo ngược thành công");
    }

    private static void firstElement() {
        if(arr.length <2){
            message("Không có phần tử thứ 2 !");
            return;
        }
        message("Phần tử arr[1] là : "+arr[1]);
        message("Các phần tử chia hết cho "+arr[1] + " là :");   // tính cả phần tử thứ 2
        for (int item : arr) {
           if(item % arr[1] ==0 )
               System.out.print(item+" ");
        }
        message("");
    }

    private static void delete() {
        int pos;
        message("Nhập vị trí cần xoá : ");
        pos = sc.nextInt();
        if(pos <1 || pos > arr.length){
            message("Vị trí xoá không hợp lệ");
            return;
        }
        int tmp[] = new int[arr.length-1];
        for(int i=0; i<tmp.length ;i++){
            if(i<pos)
                tmp[i] = arr[i];
            else
                tmp[i] = arr[i+1];
        }
        arr = tmp.clone();
        message("Xoá thành công !");
    }

    private static void insert() {
        int value,  pos ,i;
        message("Nhập giá trị cần chèn : ");
        value = sc.nextInt();
        message("Nhập vị chí cần chèn");
        pos = sc.nextInt();
        if(pos > arr.length+1 || pos <1){
            message("Vị trí không hợp lệ !");
            return;
        }

        int tmp [] = new int[arr.length+1];
        for(i =0;i<pos-1 ;i++)
            tmp[i] = arr[i];
        tmp[pos-1] = value;
        for (i = pos; i<arr.length+1;i++)
            tmp[i] = arr[i-1];

        arr = tmp.clone();
        message("Chèn thành công !");
    }



    private static void output() {
        message("Xuất mảng có "+arr.length+ " phần tử là : ");
        for (int item:arr)
            System.out.print(item + " ");
        message("\n");
    }

    private static void input() {
        message("Nhập số lượng phần tử mảng :");
        int n = sc.nextInt();                       // Sử dụng arr.length sẽ giảm bớt việc quản lí n trong sửa xoá
        arr = new int[n];
        for(int i=0 ; i< arr.length ;i++)
            arr[i] = sc.nextInt();
    }

    private static void message(String message){
        System.out.println(message);
    }

}
