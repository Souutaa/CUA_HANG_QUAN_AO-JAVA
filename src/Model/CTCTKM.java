/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.NumberFormat;

/**
 *
 * @author Quang Long
 */
public class CTCTKM {

    private String MaKM;   
    private String phantram_KM ;

    public CTCTKM() {
    }

    public CTCTKM(String MaKM, String phantram_KM) {
        this.MaKM = MaKM;
        this.phantram_KM = phantram_KM;
    }

    public String getMaKM() {
        return MaKM;
    }

    public void setMaKM(String MaKM) {
        this.MaKM = MaKM;
    }

    public String getPhantram_KM() {
        return phantram_KM;
    }

    public void setPhantram_KM(String phantram_KM) {
        this.phantram_KM = phantram_KM;
    }

}
