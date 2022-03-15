package minhHoaTriuTuong;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Vu Duong
 */
public class HinhChuNhat extends HinhPhang{
    double dai,rong;
    @Override
    double tinhCV() {
        return (dai+rong)*2;
    }
    @Override
    double tinhDT() {
        return dai*rong;
    }
public void nhap()        
{
    Scanner s=new Scanner(System.in);
    System.out.println("dai, rong=");
    dai=s.nextDouble();
    rong=s.nextDouble();
}
    @Override
    public String toString() {
        return "HinhChuNhat{" + "dai=" + dai + ", rong=" + rong + "chu vi="+tinhCV()
                +" dien tich="+tinhDT();
    }
    
    
    
}
