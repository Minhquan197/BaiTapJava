/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import baitap1.NhanVien;

/**
 *
 * @author ASUS
 */
public class BaiTap2_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        NhanVien nv1 = new NhanVien("Quan", "23", "Nha Trang", 200000, 1200);
        qlnv.them(nv1);
        NhanVien nv5 = new NhanVien("Lan", "22", "Nha Trang", 200000, 150);
        qlnv.them(nv5);
        NhanVien nv2 = new NhanVien("Thinh", "23", "Nha Trang", 250000, 1500);
        qlnv.them(nv2);
        NhanVien nv3 = new NhanVien("Nhu", "25", "Nha Trang", 200000, 1300);
        qlnv.them(nv3);
        NhanVien nv4 = new NhanVien("Tai", "23", "Nha Trang", 300000, 1200);
        qlnv.them(nv4);
        qlnv.inDS();
    }
    
}
