/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Quang Long
 */
public class LOAISP{
    protected String MaLoai, TenLoai, Size, MauSac;

    public LOAISP() {
    }

    public LOAISP(String MaLoai, String TenLoai, String Size, String MauSac) {
        this.MaLoai = MaLoai;
        this.TenLoai = TenLoai;
        this.Size = Size;
        this.MauSac = MauSac;
    }

    public String getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(String MaLoai) {
        this.MaLoai = MaLoai;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void setTenLoai(String TenLoai) {
        this.TenLoai = TenLoai;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public String getMauSac() {
        return MauSac;
    }

    public void setMauSac(String MauSac) {
        this.MauSac = MauSac;
    }
    
    
}
