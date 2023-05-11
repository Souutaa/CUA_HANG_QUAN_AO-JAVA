/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Quang Long
 */
public class PHIEUNHAPHANG {
    private String MaNH, MaNV, MaNCC, NgayNhap;
    double TongTien;

    public PHIEUNHAPHANG(String MaNH, String MaNV, String MaNCC, String NgayNhap, double TongTien) {
        this.MaNH = MaNH;
        this.MaNV = MaNV;
        this.MaNCC = MaNCC;
        this.NgayNhap = NgayNhap;
        this.TongTien = TongTien;
    }

    public PHIEUNHAPHANG() {
    }

    public String getMaNH() {
        return MaNH;
    }

    public void setMaNH(String MaNH) {
        this.MaNH = MaNH;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String MaNCC) {
        this.MaNCC = MaNCC;
    }

    public String getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(String NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    public double getTongTien() {
        return TongTien;
    }

    public void setTongTien(double TongTien) {
        this.TongTien = TongTien;
    }   
}
