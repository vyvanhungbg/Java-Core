package file_out_in_put_stream_BAI_TAP_2_I_O.Bai1_FileOutPutStream;

import java.io.FileOutputStream;

public class FileOutputStreamExample {
    public static void main(String args[]){
        try{
            FileOutputStream fout=new FileOutputStream("src/file_out_in_put_stream_BAI_TAP_2_I_O/testout.txt");  // Khởi tạo đối tượng FileOutPutStream
            String s="Welcome to javaTpoint.";                                // Chuỗi cần nhập
            byte b[]=s.getBytes();//converting string into byte array       // chuyển dổi chuỗi cần ghi về dạng chuỗi byte
            fout.write(b);                                                     // tiến hành ghi
            fout.close();                                                       // đóng file
            System.out.println("success...");
        }catch(Exception e){System.out.println(e);}
    }
}
