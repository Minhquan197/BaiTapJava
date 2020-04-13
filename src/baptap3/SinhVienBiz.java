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
public class SinhVienBiz extends SinhVienPoly{
    double diemMarketing;
    double diemSale;

    public SinhVienBiz(double diemMarketing, double diemSale, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSale = diemSale;
    }
    

    @Override
    double getDiem() {
        return (diemMarketing*2 + diemSale)/3;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
