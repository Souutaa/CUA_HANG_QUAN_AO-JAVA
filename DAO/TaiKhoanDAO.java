/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import CONNECTION.DBConnect;
import Model.TaiKhoan;
import View.LOGIN_VIEW;
import View.MainFrame_VIEW;
import java.awt.Dialog;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;


/**
 *
 * @author Quang Long
 */
public class TaiKhoanDAO {
    public TaiKhoan login(String tenDangNhap, String matKhau) {
        Connection cons = DBConnect.getConnection();
        String sql = "SELECT * FROM tai_khoan WHERE ten_dang_nhap LIKE ? AND mat_khau LIKE ?";
        TaiKhoan taiKhoan = null;
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ps.setString(1, tenDangNhap);
            ps.setString(2, matKhau);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                taiKhoan = new TaiKhoan();
                taiKhoan.setTen_dang_nhap(rs.getString("ten_dang_nhap"));
                taiKhoan.setMat_khau(rs.getString("mat_khau"));
                                             
                MainFrame_VIEW main= new MainFrame_VIEW();
                main.setVisible(true);
                
            }
            ps.close();
            cons.close();
            return taiKhoan;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}

