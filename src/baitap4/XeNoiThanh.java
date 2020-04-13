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
public class XeNoiThanh extends ChuyenXe{
    String soTuyen;
    int soKmDiDuoc;

    public XeNoiThanh(String soTuyen, int soKmDiDuoc, String maSoChuyen, String hoTenTaixe, String soXe, int doanhThu) {
        super(maSoChuyen, hoTenTaixe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public String getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(String soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKmDiDuoc() {
        return soKmDiDuoc;
    }

    public void setSoKmDiDuoc(int soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public String getMaSoChuyen() {
        return maSoChuyen;
    }

    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public String getHoTenTaixe() {
        return hoTenTaixe;
    }

    public void setHoTenTaixe(String hoTenTaixe) {
        this.hoTenTaixe = hoTenTaixe;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public int getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(int doanhThu) {
        this.doanhThu = doanhThu;
    }

    
    
}
