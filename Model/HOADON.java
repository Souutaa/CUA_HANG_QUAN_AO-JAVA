/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Quang Long
 */
public class HOADON {
    private String MaHD, NgayLapHD, MaKH, MaNV, MaKM;
    private Double TongTien;

    public HOADON() {
    }

    public HOADON(String MaHD, String NgayLapHD, String MaKH, String MaNV, String MaKM, Double TongTien) {
        this.MaHD = MaHD;
        this.NgayLapHD = NgayLapHD;
        this.MaKH = MaKH;
        this.MaNV = MaNV;
        this.MaKM = MaKM;
        this.TongTien = TongTien;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getNgayLapHD() {
        return NgayLapHD;
    }

    public void setNgayLapHD(String NgayLapHD) {
        this.NgayLapHD = NgayLapHD;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaKM() {
        return MaKM;
    }

    public void setMaKM(String MaKM) {
        this.MaKM = MaKM;
    }

    public Double getTongTien() {
        return TongTien;
    }

    public void setTongTien(Double TongTien) {
        this.TongTien = TongTien;
    }
    
}
