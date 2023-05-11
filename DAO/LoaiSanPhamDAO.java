/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import CONNECTION.DBConnect;
import Model.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Quang Long
 */
public class LoaiSanPhamDAO {
     private DBConnect dbConnect;
    private Connection conn = DBConnect.getConnection();
    private PreparedStatement ps;
    
    private ResultSet rs = null;

    public ArrayList<LOAISP> getAllLoaiSP() {

        // Khởi tạo đối tượng chứa câu lệnh thực hiện tìm kiếm dữ liệu.
        ArrayList<LOAISP> LOAISP_LIST = new ArrayList<>();
        String sqlSelectAll = "select * from LOAISP";

        try {
            dbConnect = new DBConnect();
            conn = dbConnect.getConnection();
            ps = conn.prepareStatement(sqlSelectAll);
            rs = ps.executeQuery();
            while (rs.next()) {
                LOAISP loaisp = new LOAISP();
                loaisp.setMaLoai(rs.getString("MALOAI").trim());
                loaisp.setTenLoai(rs.getString("TENLOAI").trim());
                loaisp.setSize(rs.getString("SIZE").trim());
                loaisp.setMauSac(rs.getString("MAUSAC").trim());               

                LOAISP_LIST.add(loaisp);
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
        return LOAISP_LIST;
    }


    /**
     * updateUser method.<br>
     *
     * @param loaisp
     * @param loaisp_old
     * 
     * @return result
     */
    public int updateLOAISP(LOAISP loaisp, LOAISP loaisp_old) {
        int result = 0;
        String sqlUpdate = "update LOAISP set MALOAI =?, TENLOAI = ?, SIZE = ?, MAUSAC = ? where MALOAI = ?";
        
        try {
            dbConnect = new DBConnect();
            conn = dbConnect.getConnection();
            ps = conn.prepareStatement(sqlUpdate);
            ps.setString(5, loaisp_old.getMaLoai());
            ps.setString(1, loaisp.getMaLoai());
            ps.setString(2, loaisp.getTenLoai());
            ps.setString(3, loaisp.getSize());
            ps.setString(4, loaisp.getMauSac());           
                       
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
     * 
     * @param loaisp
     * @return result
     */
    public int deleteLOAISP(LOAISP loaisp) {
        int result = 0;
        String sqlDelete = "delete from LOAISP where MALOAI = ?";

        try {
            dbConnect = new DBConnect();
            conn = dbConnect.getConnection();
            ps = conn.prepareStatement(sqlDelete);
            ps.setString(1, loaisp.getMaLoai());
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
    
 public void delete(String maloai) {
        conn = DBConnect.getConnection();
        String sql = "delete from LOAISP where MALOAI=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, maloai);

            ps.executeUpdate();
        } catch (Exception var6) {
            var6.printStackTrace();
        }
    }

    public int insertLOAISP(LOAISP loaisp) {
        int result = 0;
        String sqlInsert = "insert into LOAISP(MALOAI, TENLOAI, SIZE, MAUSAC) values (?, ?, ?, ?)";

        try {
            dbConnect = new DBConnect();
            conn = dbConnect.getConnection();
            ps = conn.prepareStatement(sqlInsert);
            ps.setString(1, loaisp.getMaLoai());
            ps.setString(2, loaisp.getTenLoai());
            ps.setString(3, loaisp.getSize());
            ps.setString(4, loaisp.getMauSac());

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
