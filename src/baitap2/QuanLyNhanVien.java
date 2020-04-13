/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import baitap1.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class QuanLyNhanVien implements IQuanLy{
    ArrayList<NhanVien> dsNV = new ArrayList<>();

    @Override
    public void them(NhanVien nv) {
        dsNV.add(nv);
    }

    @Override
    public void inDS() {
        System.out.println("Danh sach nhan vien:");
        for(int i = 0; i < dsNV.size(); i++){
            System.out.println(dsNV.get(i));
        }
    }
}
