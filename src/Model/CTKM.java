/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Quang Long
 */
public class CTKM {
    private String MaKM, TenCTKM, NgayBD, NgayKT;

    public CTKM() {
    }

    
    public CTKM(String MaKM, String TenCTKM, String NgayBD, String NgayKT) {
        this.MaKM = MaKM;
        this.TenCTKM = TenCTKM;
        this.NgayBD = NgayBD;
        this.NgayKT = NgayKT;
    }

    public String getMaKM() {
        return MaKM;
    }

    public void setMaKM(String MaKM) {
        this.MaKM = MaKM;
    }

    public String getTenCTKM() {
        return TenCTKM;
    }

    public void setTenCTKM(String TenCTKM) {
        this.TenCTKM = TenCTKM;
    }

    public String getNgayBD() {
        return NgayBD;
    }

    public void setNgayBD(String NgayBD) {
        this.NgayBD = NgayBD;
    }

    public String getNgayKT() {
        return NgayKT;
    }

    public void setNgayKT(String NgayKT) {
        this.NgayKT = NgayKT;
    }
    
    
}
