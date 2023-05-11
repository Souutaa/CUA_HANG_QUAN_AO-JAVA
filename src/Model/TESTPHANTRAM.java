/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.NumberFormat;
import java.util.ArrayList;

/**
 *
 * @author Quang Long
 */
public class TESTPHANTRAM {

    public TESTPHANTRAM() {
    }

    public double Chuyenthanhphantram(String phantram) {
        String[] pt;
        pt = phantram.split("%");

        //System.out.println(pt[0]);
        Double phantramtinhtoan = Double.parseDouble(pt[0]) / 100;
        //System.out.println(phantramtinhtoan);
        return phantramtinhtoan;
    }
    
    public int LayNgay(String ngaythangnam){
        String[] pt;
        pt = ngaythangnam.split("/");
        
        int ngay = Integer.parseInt(pt[0]);
        
        return ngay;
    }
    
    public int LayThang(String ngaythangnam){
        String[] pt;
        pt = ngaythangnam.split("/");
        
        int thang = Integer.parseInt(pt[1]);
        
        return thang;
    }
    
    public String LayNam(String ngaythangnam){
        String[] pt;
        pt = ngaythangnam.split("/");
        
        String nam = pt[2];
        
        return nam;
    }
}
