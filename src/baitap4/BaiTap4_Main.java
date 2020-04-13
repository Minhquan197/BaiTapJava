/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

/**
 *
 * @author ASUS
 */
public class BaiTap4_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
    
        XeNgoaiThanh ngoaiThanh1 = new XeNgoaiThanh("TPHCM", 5, "TP302", "Van", "A12", 200000);
        XeNgoaiThanh ngoaiThanh2 = new XeNgoaiThanh("HaNoi", 5, "TP303", "Min", "A14", 300000);
        XeNgoaiThanh ngoaiThanh3 = new XeNgoaiThanh("Hue", 5, "TP304", "Tai", "A15", 400000);
        
        XeNoiThanh noiThanh1 = new XeNoiThanh("K02", 10, "KL002", "Kien", "F02", 120000);
        XeNoiThanh noiThanh2 = new XeNoiThanh("K03", 23, "KL003", "Hung", "F03", 220000);
        XeNoiThanh noiThanh3 = new XeNoiThanh("K04", 12, "KL004", "Nhan", "F04", 340000);
        
        QuanLyChuyenXe qlcx = new QuanLyChuyenXe();
        qlcx.dsChuyenXe.add(noiThanh1);
        qlcx.dsChuyenXe.add(noiThanh2);
        qlcx.dsChuyenXe.add(noiThanh3);
        
        qlcx.dsChuyenXe.add(ngoaiThanh1);
        qlcx.dsChuyenXe.add(ngoaiThanh2);
        qlcx.dsChuyenXe.add(ngoaiThanh3);
        
        System.out.println("Danh sach chuyen xe:");
        for(int i = 0; i < qlcx.dsChuyenXe.size(); i++)
            System.out.println(qlcx.dsChuyenXe.get(i));
        
        
        System.out.println("Tong doanh thu xe ngoai thanh: " +qlcx.tinhDoanhThuNgoaiThanh());
        System.out.println("Tong doanh thu noi thanh: "+qlcx.tinhDoanhThuNoiThanh());
       
        
        
    }
    

}