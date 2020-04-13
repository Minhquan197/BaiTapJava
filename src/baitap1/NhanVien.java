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
public class NhanVien {
    String ten;
    String tuoi;
    String diaChi;
    double tienLuong;
    int tongGioLam;
    String thongTin;
    double thuong;

    public NhanVien() {
    }

    public NhanVien(String ten, String tuoi, String diaChi, double tienLunong, int tongGioLam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLunong;
        this.tongGioLam = tongGioLam;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getTienLunong() {
        return tienLuong;
    }

    public void setTienLunong(double tienLunong) {
        this.tienLuong = tienLunong;
    }

    public int getTongGioLam() {
        return tongGioLam;
    }

    public void setTongGioLam(int tongGioLam) {
        this.tongGioLam = tongGioLam;
    }
    
    
    
    double tinhThuong(){
        if(tongGioLam >= 200)
            thuong = tienLuong*(20/100);
        else
            if(tongGioLam < 200 && tongGioLam >=100)
                thuong = tienLuong*(10/100);
            else
                thuong = 0;
        return thuong;
    }
    
    String getThongtin(){
        thongTin = "Ten nhan vien: "+ getTen()+ " Tuoi: "+ getTuoi()+ " Dia chi: "+ getDiaChi()+ " Tong gio lam: "+ getTongGioLam()+ " Thuong:"+ tinhThuong();
        return thongTin;
    }
}
