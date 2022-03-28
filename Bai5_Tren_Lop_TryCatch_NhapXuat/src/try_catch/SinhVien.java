
package try_catch;

import java.io.Serializable;
import java.util.Scanner;
public class SinhVien implements Serializable {
    String ten;
    int tuoi;
    public void setTen(String ten) {
        this.ten = ten;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public  SinhVien(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public SinhVien() {

    }

    void nhap() {
        Scanner s = new Scanner(System.in);
        boolean oke = false;
        do{
           try{
               System.out.print("Nhap Ten: ");
               setTen(s.nextLine());
               System.out.print("Nhap Tuoi : ");
               setTuoi(Integer.parseInt(s.nextLine()));
               oke = true;
               if(tuoi < 0) throw new Exception("Tuổi không hợp lệ  tuổi > 0");
           }catch (NumberFormatException e){
               System.out.println("Vui lòng nhập tuổi là chữ số !");
           }
           catch (Exception e){
               System.out.println("Vui lòng nhập tên và tuổi hợp lệ "+e.getMessage());
           }
        }while (tuoi<0 || oke == false);
 }
    @Override
    public String toString() {
        return "SinhVien0{" + "ten=" + ten + ", tuoi=" + tuoi + '}';
    }       
}
