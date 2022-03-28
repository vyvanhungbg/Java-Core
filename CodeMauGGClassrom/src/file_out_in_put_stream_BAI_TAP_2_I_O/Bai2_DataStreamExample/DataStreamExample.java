package file_out_in_put_stream_BAI_TAP_2_I_O.Bai2_DataStreamExample;

import java.io.FileInputStream;

public class DataStreamExample {
    public static void main(String args[]){
          readOne();

      //  readAll();

    }

    private static void readAll() {
        try{
            FileInputStream fin=new FileInputStream("src/file_out_in_put_stream_BAI_TAP_2_I_O/testout.txt"); // Khởi tạo đối tượng FileInputStream
            int i=0;                                // Khởi tạo biến i
            while((i=fin.read())!=-1){              // vòng lặp đọc khi kết thúc
                System.out.print((char)i);          // đọc kí tự
            }
            fin.close();
        }catch(Exception e){System.out.println(e);}
    }

    private static void readOne() {
        try{
            FileInputStream fin=new FileInputStream("src/file_out_in_put_stream_BAI_TAP_2_I_O/testout.txt");
            int i=fin.read();                      // đọc kí tự đầu
            System.out.print((char)i);

            fin.close();
        }catch(Exception e){System.out.println(e);}
    }


}
