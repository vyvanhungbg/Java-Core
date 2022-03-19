package BaiToan3_PTB2;

import BaiTap1_BaiToanHinhChuNhat.HinhChuNhat;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PTB2 {
    private float a,b,c;

    public PTB2(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public PTB2() {
    }

    public float delta(){
        return b*b-4*a*c;
    }
    public double nghiemThuNhat() {
        return ( (-b+Math.sqrt(delta())) / (2*a) );
    }

    public double nghiemThuHai() {
        return ( (-b-Math.sqrt(delta())) / (2*a));
    }
    void nhap() {
        Random random = new Random();
        a = random.nextFloat() + 1;
        b = random.nextFloat() + 1;
        c = random.nextFloat() + 1;
    }
    public static void inTieuDe(){
        System.out.printf("%15s %15s %15s %15s %15s%n",
                "a ","b "," c","nghiệm 1","nghiệm 2");
    }
    public void xuat() {
        if(a == 0){
            System.out.printf("%15.1f %15.1f %15.1f %30s %n",
                    a,b,c,"Đây không là ptb 2");
            return;
        }
        if(delta()<0){
            System.out.printf("%15.1f %15.1f %15.1f %30s %n",
                    a,b,c,"Pt vô nghiệm !");
            return;
        }
        System.out.printf("%15.1f %15.1f %15.1f %15.1f %15.1f %n",
                a,b,c,nghiemThuNhat(),nghiemThuHai());
    }
    public static void main(String[] args) {
        inTieuDe();
        List<PTB2> list = new ArrayList<PTB2>();
        for(int i=0;i<5;i++){
            PTB2 ptb2 = new PTB2();
            ptb2.nhap();
            list.add(ptb2);
        }
        list.add(new PTB2(1,2,-3));
        for (PTB2 item :list) {
            item.xuat();
        }


    }

}
