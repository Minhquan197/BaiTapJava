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
public abstract class SinhVienPoly {
    String hoTen;
    String nganh;

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    
    abstract double getDiem();
    String getHocLuc(){
        String hocLuc = null;
        if(getDiem() < 5)
            hocLuc = "Yeu";
        else 
            if(getDiem() >=5 && getDiem() < 6.5)
                hocLuc = "Trung binh";
            else
                if(getDiem() >=6.5 && getDiem() < 7.5)
                    hocLuc = "Kha";
                else 
                    if(getDiem() >=7.5 && getDiem() < 9)
                        hocLuc = "Gioi";
                    else hocLuc = "Xuat sac";
        return hocLuc;
    }
    void xuat(){
        System.out.println("Ho ten sinh vien: "+ hoTen+ " Nganh hoc: "+nganh);
    }
}
