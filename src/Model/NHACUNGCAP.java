/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Quang Long
 */
public class NHACUNGCAP {
    private String MaNCC, TenNCC, DiaChi_NCC, SDT_NCC;

    public NHACUNGCAP() {
    }

    public NHACUNGCAP(String MaNCC, String TenNCC, String DiaChi_NCC, String SDT_NCC) {
        this.MaNCC = MaNCC;
        this.TenNCC = TenNCC;
        this.DiaChi_NCC = DiaChi_NCC;
        this.SDT_NCC = SDT_NCC;
    }

    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String MaNCC) {
        this.MaNCC = MaNCC;
    }

    public String getTenNCC() {
        return TenNCC;
    }

    public void setTenNCC(String TenNCC) {
        this.TenNCC = TenNCC;
    }

    public String getDiaChi_NCC() {
        return DiaChi_NCC;
    }

    public void setDiaChi_NCC(String DiaChi_NCC) {
        this.DiaChi_NCC = DiaChi_NCC;
    }

    public String getSDT_NCC() {
        return SDT_NCC;
    }

    public void setSDT_NCC(String SDT_NCC) {
        this.SDT_NCC = SDT_NCC;
    }
    
    
}
