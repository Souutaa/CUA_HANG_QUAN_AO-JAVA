/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Quang Long
 */
public class CTHOADON {

    private String MaSP, MaHD, TenSp, GiamGia;
    private int SoLuong;
    private double DonGia, ThanhTien;

    public CTHOADON() {
    }

    public CTHOADON(String MaSP, String MaHD, String TenSp, String GiamGia, int SoLuong, double DonGia, double ThanhTien) {
        this.MaSP = MaSP;
        this.MaHD = MaHD;
        this.TenSp = TenSp;
        this.GiamGia = GiamGia;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.ThanhTien = ThanhTien;
    }

    

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
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

    public String getTenSp() {
        return TenSp;
    }

    public void setTenSp(String TenSp) {
        this.TenSp = TenSp;
    }

    public String getGiamGia() {
        return GiamGia;
    }

    public void setGiamGia(String GiamGia) {
        this.GiamGia = GiamGia;
    }

    
}
