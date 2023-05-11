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
 * @author admin
 */
public class KhachHangDAO {

    private DBConnect dbConnect;
    private Connection conn = DBConnect.getConnection();
    private PreparedStatement ps;
    
    private ResultSet rs = null;

    public ArrayList<KHACHHANG> getAllUsers() {

        // Khởi tạo đối tượng chứa câu lệnh thực hiện tìm kiếm dữ liệu.
        ArrayList<KHACHHANG> KHACHHANG_LIST = new ArrayList<>();
        String sqlSelectAll = "select * from KHACHHANG";

        try {
            dbConnect = new DBConnect();
            conn = dbConnect.getConnection();
            ps = conn.prepareStatement(sqlSelectAll);
            rs = ps.executeQuery();
            while (rs.next()) {
                KHACHHANG kh = new KHACHHANG();
                kh.setMaKH(rs.getString("MAKH").trim());
                kh.setTenKH(rs.getString("TENKH").trim());
                kh.setSDT_KH(rs.getString("SDT_KH").trim());
                kh.setNgaySinh_KH(rs.getString("NGAYSINH_KH").trim());
                kh.setDiaChi_KH(rs.getString("DIACHI_KH").trim());

                KHACHHANG_LIST.add(kh);
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
        return KHACHHANG_LIST;
    }

    /**
     * getUsersById method.<br>
     *
     * @param usersDTO
     * @return resultSet
     */
    public ArrayList<KHACHHANG> getUsersById(String Tenkh) {

        // Khởi tạo đối tượng chứa câu lệnh thực hiện tìm kiếm dữ liệu.
        ArrayList<KHACHHANG> KHACHHANG_LIST = new ArrayList<>();
        String sqlSelectById = "select * from KHACHHANG where MAKH = ?";

        try {
            dbConnect = new DBConnect();
            conn = dbConnect.getConnection();
            ps = conn.prepareStatement(sqlSelectById);
            ps.setString(1, Tenkh);
            rs = ps.executeQuery();
            while (rs.next()) {
                KHACHHANG kh = new KHACHHANG();
                kh.setMaKH(rs.getString("MAKH"));
                kh.setTenKH(rs.getString("TENKH"));
                kh.setSDT_KH(rs.getString("SDT_KH"));
                kh.setNgaySinh_KH(rs.getString("NGAYSINH_KH"));
                kh.setDiaChi_KH(rs.getString("DIACHI_KH"));

                KHACHHANG_LIST.add(kh);
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
        return KHACHHANG_LIST;
    }

    /**
     * updateUser method.<br>
     *
     * @param
     * @return result
     */
    public int updateUser(KHACHHANG khachhang, KHACHHANG khachhangold) {
        int result = 0;
        String sqlUpdate = "update KHACHHANG set MAKH =?, TENKH = ?, SDT_KH = ?, NGAYSINH_KH = ?, DIACHI_KH = ? where MAKH = ?";
        
        try {
            dbConnect = new DBConnect();
            conn = dbConnect.getConnection();
            ps = conn.prepareStatement(sqlUpdate);
            ps.setString(6, khachhangold.getMaKH());
            ps.setString(1, khachhang.getMaKH());
            ps.setString(2, khachhang.getTenKH());
            ps.setString(3, khachhang.getSDT_KH());
            ps.setString(4, khachhang.getNgaySinh_KH());
            ps.setString(5, khachhang.getDiaChi_KH());           
                       
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
    public int deleteUser(KHACHHANG khachhang) {
        int result = 0;
        String sqlDelete = "delete from KHACHHANG where MAKH = ?";

        try {
            dbConnect = new DBConnect();
            conn = dbConnect.getConnection();
            ps = conn.prepareStatement(sqlDelete);
            ps.setString(1, khachhang.getMaKH());
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
    
 public void delete(String makh) {
        conn = DBConnect.getConnection();
        String sql = "delete from KHACHHANG where MAKH=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, makh);

            ps.executeUpdate();
        } catch (Exception var6) {
            var6.printStackTrace();
        }
    }

    public int insertUser(KHACHHANG khachhang) {
        int result = 0;
        String sqlInsert = "insert into KHACHHANG(MAKH, TENKH, SDT_KH, NGAYSINH_KH, DIACHI_KH) values (?, ?, ?, ?, ?)";

        try {
            dbConnect = new DBConnect();
            conn = dbConnect.getConnection();
            ps = conn.prepareStatement(sqlInsert);
            ps.setString(1, khachhang.getMaKH());
            ps.setString(2, khachhang.getTenKH());
            ps.setString(3, khachhang.getSDT_KH());
            ps.setString(4, khachhang.getNgaySinh_KH());
            ps.setString(5, khachhang.getDiaChi_KH());

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
