/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Quang Long
 */
public class NHANVIEN {
    private String MaNV, TenNV, SDT_NV, NgaySinh_NV, DiaChi_NV;

    public NHANVIEN() {
    }

    public NHANVIEN(String MaNV, String TenNV, String SDT_NV, String NgaySinh_NV, String DiaChi_NV) {
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.SDT_NV = SDT_NV;
        this.NgaySinh_NV = NgaySinh_NV;
        this.DiaChi_NV = DiaChi_NV;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getSDT_NV() {
        return SDT_NV;
    }

    public void setSDT_NV(String SDT_NV) {
        this.SDT_NV = SDT_NV;
    }

    public String getNgaySinh_NV() {
        return NgaySinh_NV;
    }

    public void setNgaySinh_NV(String NgaySinh_NV) {
        this.NgaySinh_NV = NgaySinh_NV;
    }

    public String getDiaChi_NV() {
        return DiaChi_NV;
    }

    public void setDiaChi_NV(String DiaChi_NV) {
        this.DiaChi_NV = DiaChi_NV;
    }

}
