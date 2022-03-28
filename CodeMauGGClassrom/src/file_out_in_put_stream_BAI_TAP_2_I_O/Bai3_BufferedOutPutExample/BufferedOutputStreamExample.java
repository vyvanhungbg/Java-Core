package file_out_in_put_stream_BAI_TAP_2_I_O.Bai3_BufferedOutPutExample;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample{
    public static void main(String args[])throws Exception{
        FileOutputStream fout=new FileOutputStream("src/file_out_in_put_stream_BAI_TAP_2_I_O/Bai3_BufferedOutPutExample/bai3.txt");
        BufferedOutputStream bout=new BufferedOutputStream(fout);   // Khởi tạo bộ đệm
        String s="Welcome to javaTpoint.";
        byte b[]=s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("success");
    }
}
