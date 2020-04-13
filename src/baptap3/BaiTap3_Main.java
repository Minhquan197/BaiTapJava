/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baptap3;

/**
 *
 * @author ASUS
 */
public class BaiTap3_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SinhVienIT svIT = new SinhVienIT(6, 7, 6, "Thu", "CNTT");
        SinhVienBiz svBiz = new SinhVienBiz(6, 7, "Phong", "TM");
        svIT.xuat();
        svBiz.xuat();
    }
    
}
