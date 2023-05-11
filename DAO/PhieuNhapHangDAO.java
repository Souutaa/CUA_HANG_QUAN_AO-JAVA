/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import CONNECTION.DBConnect;
import Model.CTPHIEUNHAPHANG;
import Model.PHIEUNHAPHANG;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Quang Long
 */
public class PhieuNhapHangDAO {

    private DBConnect dbConnect;
    private Connection conn = DBConnect.getConnection();
    private PreparedStatement ps;
    
    private ResultSet rs = null;

    public ArrayList<PHIEUNHAPHANG> getAllPNH() {

        // Khởi tạo đối tượng chứa câu lệnh thực hiện tìm kiếm dữ liệu.
        ArrayList<PHIEUNHAPHANG> PHIEUNHAPHANG_LIST = new ArrayList<>();
        String sqlSelectAll = "Select MANH, PHIEUNHAPHANG.MANV, PHIEUNHAPHANG.MANCC, NGAYNHAP, TONGTIEN from PHIEUNHAPHANG"
                + " INNER JOIN NHANVIEN"
                + " ON NHANVIEN.MANV = PHIEUNHAPHANG.MANV"
                + " INNER JOIN NHACUNGCAP"
                + " ON NHACUNGCAP.MANCC = PHIEUNHAPHANG.MANCC";
        try {
            dbConnect = new DBConnect();
            conn = dbConnect.getConnection();
            ps = conn.prepareStatement(sqlSelectAll);
            rs = ps.executeQuery();
            while (rs.next()) {
                PHIEUNHAPHANG pnh = new PHIEUNHAPHANG();
                pnh.setMaNH(rs.getString("MANH").trim());
                pnh.setMaNV(rs.getString("MANV").trim());
                pnh.setMaNCC(rs.getString("MANCC").trim());
                pnh.setNgayNhap(rs.getString("NGAYNHAP").trim());
                pnh.setTongTien(Double.valueOf(rs.getString("TONGTIEN").trim()));

                PHIEUNHAPHANG_LIST.add(pnh);
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
        return PHIEUNHAPHANG_LIST;
    }

    public ArrayList<CTPHIEUNHAPHANG> getAllCT_PNH() {

        // Khởi tạo đối tượng chứa câu lệnh thực hiện tìm kiếm dữ liệu.
        ArrayList<CTPHIEUNHAPHANG> CTPNH_LIST = new ArrayList<>();
        String sqlSelectAll = "select CT_PHIEUNHAPHANG.MANH, CT_PHIEUNHAPHANG.MASP, CT_PHIEUNHAPHANG.SOLUONG, CT_PHIEUNHAPHANG.DONGIA, CT_PHIEUNHAPHANG.THANHTIEN from CT_PHIEUNHAPHANG"
                + " INNER JOIN PHIEUNHAPHANG"
                + " ON PHIEUNHAPHANG.MANH = CT_PHIEUNHAPHANG.MANH"
                + " INNER JOIN SANPHAM"
                + " ON SANPHAM.MASP = CT_PHIEUNHAPHANG.MASP";
        try {
            dbConnect = new DBConnect();
            conn = dbConnect.getConnection();
            ps = conn.prepareStatement(sqlSelectAll);
            rs = ps.executeQuery();
            while (rs.next()) {
                CTPHIEUNHAPHANG ctpnh = new CTPHIEUNHAPHANG();
                ctpnh.setMaNH(rs.getString("MANH").trim());
                ctpnh.setMaSP(rs.getString("MASP").trim());
                ctpnh.setSoLuong(Integer.valueOf(rs.getString("SOLUONG").trim()));
                ctpnh.setDonGia(Double.valueOf(rs.getString("DONGIA").trim()));
                ctpnh.setThanhTien(Double.valueOf(rs.getString("THANHTIEN").trim()));

                CTPNH_LIST.add(ctpnh);
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
        return CTPNH_LIST;
    }

    /**
     * updateUser method.<br>
     *
     * @param ctkm
     * @param ctkm_old
     * @return result
     */
    public int updatePNH(PHIEUNHAPHANG pnh, PHIEUNHAPHANG pnh_old) {
        int result = 0;
        String sqlUpdate = "update PHIEUNHAPHANG set MANH =?, MANV = ?, MANCC = ?, NGAYNHAP = ?, TONGTIEN =? where MANH = ?";

        try {
            dbConnect = new DBConnect();
            conn = dbConnect.getConnection();
            ps = conn.prepareStatement(sqlUpdate);
            ps.setString(6, pnh_old.getMaNH().trim());
            ps.setString(1, pnh_old.getMaNH().trim());
            ps.setString(2, pnh.getMaNV().trim());
            ps.setString(3, pnh.getMaNCC().trim());
            ps.setString(4, pnh.getNgayNhap().trim());
            ps.setString(5, String.valueOf(pnh.getTongTien()));
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

    public int updateCT_PNH(CTPHIEUNHAPHANG ctpnh, CTPHIEUNHAPHANG ctpnh_old) {
        int result = 0;
        String sqlUpdate = "update CT_PHIEUNHAPHANG set MANH =?, MASP = ?, SOLUONG = ?, DONGIA = ?, THANHTIEN = ? where MANH = ?";

        try {
            dbConnect = new DBConnect();
            conn = dbConnect.getConnection();
            ps = conn.prepareStatement(sqlUpdate);
            ps.setString(6, ctpnh_old.getMaNH().trim());
            ps.setString(1, ctpnh.getMaNH().trim());
            ps.setString(2, ctpnh.getMaSP().trim());
            ps.setString(3, String.valueOf(ctpnh.getSoLuong()));
            ps.setString(4, String.valueOf(ctpnh.getDonGia()));
            ps.setString(5, String.valueOf(ctpnh.getThanhTien()));

            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e);
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

    public void deletePNH(String manh) {
        conn = DBConnect.getConnection();
        String sql = "delete from PHIEUNHAPHANG where MANH=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, manh);

            ps.executeUpdate();
        } catch (Exception var6) {
            var6.printStackTrace();
        }
    }

    public void deleteCT_PNH(String manh) {
        conn = DBConnect.getConnection();
        String sql = "delete from CT_PHIEUNHAPHANG where MANH=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, manh);

            ps.executeUpdate();
        } catch (Exception var6) {
            var6.printStackTrace();
        }
    }

    public int insertPNH(PHIEUNHAPHANG pnh) {
        int result = 0;
        String sqlInsert = "insert into PHIEUNHAPHANG(MANH, MANV, MANCC, NGAYNHAP, TONGTIEN) values (?, ?, ?, ?, ?)";

        try {
            dbConnect = new DBConnect();
            conn = dbConnect.getConnection();
            ps = conn.prepareStatement(sqlInsert);
            ps.setString(1, pnh.getMaNH().trim());
            ps.setString(2, pnh.getMaNV().trim());
            ps.setString(3, pnh.getMaNCC().trim());
            ps.setString(4, pnh.getNgayNhap().trim());
            ps.setDouble(5, pnh.getTongTien());

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

    public int insertCT_PNH(CTPHIEUNHAPHANG ctpnh) {
        int result = 0;
        String sqlInsert = "insert into CT_PHIEUNHAPHANG(MANH, MASP, SOLUONG, DONGIA, THANHTIEN) values (?, ?, ?, ?, ?)";

        try {
            dbConnect = new DBConnect();
            conn = dbConnect.getConnection();
            ps = conn.prepareStatement(sqlInsert);
            ps.setString(1, ctpnh.getMaNH().trim());
            ps.setString(2, ctpnh.getMaSP().trim());
            ps.setInt(3, ctpnh.getSoLuong());
            ps.setDouble(4, ctpnh.getDonGia());
            ps.setDouble(5, ctpnh.getThanhTien());

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
