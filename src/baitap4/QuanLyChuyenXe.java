/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class QuanLyChuyenXe {
    ArrayList<ChuyenXe> dsChuyenXe = new ArrayList<>();
    
    void them(ChuyenXe cx){
        dsChuyenXe.add(cx);
        
    }
    
    void xuat(){
        for(int i = 0; i < dsChuyenXe.size(); i++){
            System.out.println(dsChuyenXe.get(i));
        }
    }
    
    int tinhDoanhThuNoiThanh(){
        int tongDoanhThu =0;
        for(int i = 0; i < dsChuyenXe.size(); i++){
            if(dsChuyenXe.get(i) instanceof XeNoiThanh)
                tongDoanhThu = tongDoanhThu + dsChuyenXe.get(i).doanhThu;
        }
        return tongDoanhThu;
    }
    
    int tinhDoanhThuNgoaiThanh(){
        int tongDoanhThu =0;
        for(int i = 0; i < dsChuyenXe.size(); i++){
            if(dsChuyenXe.get(i) instanceof XeNgoaiThanh)
                tongDoanhThu = tongDoanhThu + dsChuyenXe.get(i).doanhThu;
        }
        return tongDoanhThu;
    }
}
