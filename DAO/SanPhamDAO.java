/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import CONNECTION.DBConnect;
import Model.SANPHAM;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Quang Long
 */
public class SanPhamDAO {

    private DBConnect dbConnect;
    private Connection conn = DBConnect.getConnection();
    private PreparedStatement ps;

    private ResultSet rs = null;

    public ArrayList<SANPHAM> getAllSANPHAM() {

        // Khởi tạo đối tượng chứa câu lệnh thực hiện tìm kiếm dữ liệu.
        ArrayList<SANPHAM> SANPHAM_LIST = new ArrayList<>();
        String sqlSelectAll = "select MASP, TENSP, DONGIA, SOLUONG, SANPHAM.MALOAI from SANPHAM "
                + "INNER JOIN LOAISP"
                + " ON SANPHAM.MALOAI = LOAISP.MALOAI";

        try {
            dbConnect = new DBConnect();
            conn = dbConnect.getConnection();
            ps = conn.prepareStatement(sqlSelectAll);
            rs = ps.executeQuery();
            while (rs.next()) {
                SANPHAM sp = new SANPHAM();
                sp.setMaSP(rs.getString("MASP").trim());
                sp.setTenSP(rs.getString("TENSP").trim());
                sp.setDonGia(rs.getDouble("DONGIA"));
                sp.setSoLuong(rs.getInt("SOLUONG"));
                sp.setMaLoai(rs.getString("MALOAI").trim());

                SANPHAM_LIST.add(sp);
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
        return SANPHAM_LIST;
    }

    public int updateSP(SANPHAM sp, SANPHAM sp_old) {
        int result = 0;
        String sqlUpdate = "update SANPHAM set MASP =?, TENSP = ?, DONGIAN = ?, SOLUONG = ? MALOAI = ? where MASP = ?";

        try {
            dbConnect = new DBConnect();
            conn = dbConnect.getConnection();
            ps = conn.prepareStatement(sqlUpdate);
            ps.setString(6, sp_old.getMaSP());
            ps.setString(1, sp.getMaSP());
            ps.setString(2, sp.getTenSP());
            ps.setDouble(3, sp.getDonGia());
            ps.setInt(4, sp.getSoLuong());
            ps.setString(4, sp.getMaLoai());

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

    public void delete(String masp) {
        conn = DBConnect.getConnection();
        String sql = "delete from SANPHAM where MASP=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, masp);

            ps.executeUpdate();
        } catch (Exception var6) {
            var6.printStackTrace();
        }
    }

    public int insertSP(SANPHAM sp) {
        int result = 0;
        String sqlInsert = "insert into SANPHAM(MASP, TENSP, DONGIA, SOLUONG, MALOAI) values (?, ?, ?, ?, ?)";

        try {
            dbConnect = new DBConnect();
            conn = dbConnect.getConnection();
            ps = conn.prepareStatement(sqlInsert);
            ps.setString(1, sp.getMaSP());
            ps.setString(2, sp.getTenSP());
            ps.setDouble(3, sp.getDonGia());
            ps.setInt(4, sp.getSoLuong());
            ps.setString(5, sp.getMaLoai());

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
