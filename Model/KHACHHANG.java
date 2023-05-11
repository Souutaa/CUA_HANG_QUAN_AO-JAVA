/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Quang Long
 */
public class KHACHHANG {
    private String MaKH, TenKH, NgaySinh_KH, SDT_KH, DiaChi_KH;

    public KHACHHANG(String MaKH, String TenKH, String NgaySinh_KH, String SDT_KH, String DiaChi_KH) {
        this.MaKH = MaKH;
        this.TenKH = TenKH;
        this.NgaySinh_KH = NgaySinh_KH;
        this.SDT_KH = SDT_KH;
        this.DiaChi_KH = DiaChi_KH;
    }

    public KHACHHANG() {
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getNgaySinh_KH() {
        return NgaySinh_KH;
    }

    public void setNgaySinh_KH(String NgaySinh_KH) {
        this.NgaySinh_KH = NgaySinh_KH;
    }

    public String getSDT_KH() {
        return SDT_KH;
    }

    public void setSDT_KH(String SDT_KH) {
        this.SDT_KH = SDT_KH;
    }

    public String getDiaChi_KH() {
        return DiaChi_KH;
    }

    public void setDiaChi_KH(String DiaChi_KH) {
        this.DiaChi_KH = DiaChi_KH;
    }
    
    
}
