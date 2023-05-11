/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.*;
import Model.*;

/**
 *
 * @author Quang Long
 */
public class TaiKhoanBUS {

    private TaiKhoanDAO taiKhoanDAO = null;

    public TaiKhoanBUS() {
        taiKhoanDAO = new TaiKhoanDAO();
    }
    
    public TaiKhoan login(String tdn, String mk){
        return taiKhoanDAO.login(tdn, mk);
    }
}
