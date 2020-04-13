/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author ASUS
 */
public class BaiTap1_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NhanVien nv = new NhanVien("Quan", "23", "Nha Trang", 2000000, 300);
        System.out.println("Thong tin nhan vien: "+ nv.getThongtin());
    }
    
}
