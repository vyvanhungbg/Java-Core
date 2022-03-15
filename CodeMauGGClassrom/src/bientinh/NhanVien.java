/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BGDT_Lop_BienTinh;
public class NhanVien {
    private String ten,diachi,ngaySinh,gioiTinh;
    private int id=0;
    private static int nextID=1;
    final double LUONG=1234;
    public NhanVien() {
         this.ten = "";
        this.diachi = "";
        id=nextID;
//        id=id+1;
        nextID++;
//        LUONG=2232;
    }
    public NhanVien(String ten, String diachi){
        this.ten = ten;
        this.diachi = diachi;
        id=nextID;
//        id=id+1;
        nextID++;
        
    }
    public static int getNextID() {
        return nextID ;//+ id;
    }

    @Override
    public String toString() {
        return "NhanVien: ma:"+ id+" nextID: "+ nextID+
                " ten:"+ ten + ", diachi:" + diachi;             
                
    }   
}
