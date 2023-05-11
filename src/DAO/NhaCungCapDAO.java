/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import CONNECTION.DBConnect;
import Model.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Quang Long
 */
public class NhaCungCapDAO {
     private DBConnect dbConnect;
    private Connection conn = DBConnect.getConnection();
    private PreparedStatement ps;
    
    private ResultSet rs = null;

    public ArrayList<NHACUNGCAP> getAllUsers() {

        // Khởi tạo đối tượng chứa câu lệnh thực hiện tìm kiếm dữ liệu.
        ArrayList<NHACUNGCAP> NHACUNGCAP_LIST = new ArrayList<>();
        String sqlSelectAll = "select * from NHACUNGCAP";

        try {
            dbConnect = new DBConnect();
            conn = dbConnect.getConnection();
            ps = conn.prepareStatement(sqlSelectAll);
            rs = ps.executeQuery();
            while (rs.next()) {
                NHACUNGCAP ncc = new NHACUNGCAP();
                ncc.setMaNCC(rs.getString("MANCC").trim());
                ncc.setTenNCC(rs.getString("TENNCC").trim());
                ncc.setSDT_NCC(rs.getString("SDT_NCC").trim());
                ncc.setDiaChi_NCC(rs.getString("DIACHI_NCC").trim());

                NHACUNGCAP_LIST.add(ncc);
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
        return NHACUNGCAP_LIST;
    }
    
    /**
     * updateUser method.<br>
     *
     * @param
     * @return result
     */
    public int updateUser(NHACUNGCAP nhacungcap, NHACUNGCAP nhacungcap_old) {
        int result = 0;
        String sqlUpdate = "update NHACUNGCAP set MANCC =?, TENNCC = ?, SDT_NCC = ?, DIACHI_NCC = ? where MANCC = ?";
        
        try {
            dbConnect = new DBConnect();
            conn = dbConnect.getConnection();
            ps = conn.prepareStatement(sqlUpdate);
            ps.setString(5, nhacungcap_old.getMaNCC());
            ps.setString(1, nhacungcap.getMaNCC());
            ps.setString(2, nhacungcap.getTenNCC());
            ps.setString(3, nhacungcap.getSDT_NCC());
            ps.setString(4, nhacungcap.getDiaChi_NCC());           
                       
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

 public void delete(String mancc) {
        conn = DBConnect.getConnection();
        String sql = "delete from NHACUNGCAP where MANCC=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, mancc);

            ps.executeUpdate();
        } catch (Exception var6) {
            var6.printStackTrace();
        }
    }

    public int insertUser(NHACUNGCAP nhacungcap) {
        int result = 0;
        String sqlInsert = "insert into NHACUNGCAP(MANCC, TENNCC, SDT_NCC, DIACHI_NCC) values (?, ?, ?, ?)";

        try {
            dbConnect = new DBConnect();
            conn = dbConnect.getConnection();
            ps = conn.prepareStatement(sqlInsert);
            ps.setString(1, nhacungcap.getMaNCC());
            ps.setString(2, nhacungcap.getTenNCC());
            ps.setString(3, nhacungcap.getSDT_NCC());
            ps.setString(4, nhacungcap.getDiaChi_NCC());

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
