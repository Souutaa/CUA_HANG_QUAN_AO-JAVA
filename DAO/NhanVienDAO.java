/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import CONNECTION.DBConnect;
import Model.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;

/**
 *
 * @author Quang Long
 */
public class NhanVienDAO {

    private DBConnect dbConnect;
    private Connection conn = DBConnect.getConnection();
    private PreparedStatement ps;
    
    private ResultSet rs = null;

    public ArrayList<NHANVIEN> getAllUsers() {

        // Khởi tạo đối tượng chứa câu lệnh thực hiện tìm kiếm dữ liệu.
        ArrayList<NHANVIEN> NHANVIEN_LIST = new ArrayList<>();
        String sqlSelectAll = "select * from NHANVIEN";

        try {
            dbConnect = new DBConnect();
            conn = dbConnect.getConnection();
            ps = conn.prepareStatement(sqlSelectAll);
            rs = ps.executeQuery();
            while (rs.next()) {
                NHANVIEN nv = new NHANVIEN();
                nv.setMaNV(rs.getString("MANV").trim());
                nv.setTenNV(rs.getString("TENNV").trim());
                nv.setSDT_NV(rs.getString("SDT_NV").trim());
                nv.setNgaySinh_NV(rs.getString("NGAYSINH_NV").trim());
                nv.setDiaChi_NV(rs.getString("DIACHI_NV").trim());

                NHANVIEN_LIST.add(nv);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
                ps.close();
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return NHANVIEN_LIST;
    }
    

    /**
     * updateUser method.<br>
     *
     * @param
     * @return result
     */
    public int updateUser(NHANVIEN nhanvien, NHANVIEN nhanvienold) {
        int result = 0;
        String sqlUpdate = "update NHANVIEN set MANV =?, TENNV = ?, SDT_NV = ?, NGAYSINH_NV = ?, DIACHI_NV = ? where MANV = ?";
        
        try {
            dbConnect = new DBConnect();
            conn = dbConnect.getConnection();
            ps = conn.prepareStatement(sqlUpdate);
            ps.setString(6, nhanvienold.getMaNV());
            ps.setString(1, nhanvien.getMaNV());
            ps.setString(2, nhanvien.getTenNV());
            ps.setString(3, nhanvien.getSDT_NV());
            ps.setString(4, nhanvien.getNgaySinh_NV());
            ps.setString(5, nhanvien.getDiaChi_NV());           
                       
            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    /**
     * deleteUser method.<br>
     *
     * @param nhanvien
     * @return result
     */
      
 public void delete(String manv) {
        conn = DBConnect.getConnection();
        String sql = "delete from NHANVIEN where MANV=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, manv);

            ps.executeUpdate();
        } catch (Exception var6) {
            var6.printStackTrace();
        }        
    }

    public int insertUser(NHANVIEN nhanvien) {
        int result = 0;
        String sqlInsert = "insert into NHANVIEN(MANV, TENNV, SDT_NV, NGAYSINH_NV, DIACHI_NV) values (?, ?, ?, ?, ?)";

        try {
            dbConnect = new DBConnect();
            conn = dbConnect.getConnection();
            ps = conn.prepareStatement(sqlInsert);
            ps.setString(1, nhanvien.getMaNV());
            ps.setString(2, nhanvien.getTenNV());
            ps.setString(3, nhanvien.getSDT_NV());
            ps.setString(4, nhanvien.getNgaySinh_NV());
            ps.setString(5, nhanvien.getDiaChi_NV());

            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
