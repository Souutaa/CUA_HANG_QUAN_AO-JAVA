/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Quang Long
 */
public class CTPHIEUNHAPHANG {
    String MaNH, MaSP;
    private double DonGia, ThanhTien;
    private int SoLuong;

    public CTPHIEUNHAPHANG() {
    }

    public CTPHIEUNHAPHANG(String MaNH, String MaSP, double DonGia, double ThanhTien, int SoLuong) {
        this.MaNH = MaNH;
        this.MaSP = MaSP;
        this.DonGia = DonGia;
        this.ThanhTien = ThanhTien;
        this.SoLuong = SoLuong;
    }

    public String getMaNH() {
        return MaNH;
    }

    public void setMaNH(String MaNH) {
        this.MaNH = MaNH;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }

    public double getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(double ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
    
    public void Tinhtien(){
        ThanhTien = SoLuong*DonGia;
    }
}
