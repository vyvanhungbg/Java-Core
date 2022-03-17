

import java.util.Arrays;

public class Bai17_BTTH2 {
    public static String delimiter = " ";
    public static void main(String[] args) {
        String str = "nguyen van a";
        String [] strArrays = str.split(delimiter);
        for (int i=0;i< strArrays.length;i++) {
            strArrays[i] = strArrays[i].substring(0, 1).toUpperCase() + strArrays[i].substring(1);
        }
        System.out.println(String.join(delimiter,strArrays));
    }


}
