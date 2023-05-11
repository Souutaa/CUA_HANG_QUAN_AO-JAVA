/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import CONNECTION.DBConnect;
import Model.CTHOADON;
import Model.HOADON;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Quang Long
 */
public class HoaDonDAO {

    private DBConnect dbConnect;
    private Connection conn = DBConnect.getConnection();
    private PreparedStatement ps;

    private ResultSet rs = null;

    public ArrayList<HOADON> getAllHD() {

        // Khởi tạo đối tượng chứa câu lệnh thực hiện tìm kiếm dữ liệu.
        ArrayList<HOADON> HOADON_LIST = new ArrayList<>();
        String sqlSelectAll = "Select MAHD, HOADON.MAKH, HOADON.MANV, HOADON.MAKM, NGAYLAPHD, TONGTIEN from HOADON"
                + " INNER JOIN NHANVIEN"
                + " ON NHANVIEN.MANV = HOADON.MANV"
                + " INNER JOIN KHACHHANG"
                + " ON KHACHHANG.MAKH = HOADON.MAKH"
                + " INNER JOIN CHUONGTRINHKHUYENMAI"
                + " ON CHUONGTRINHKHUYENMAI.MAKM = HOADON.MAKM";
        try {
            dbConnect = new DBConnect();
            conn = dbConnect.getConnection();
            ps = conn.prepareStatement(sqlSelectAll);
            rs = ps.executeQuery();
            while (rs.next()) {
                HOADON hd = new HOADON();
                hd.setMaHD(rs.getString("MAHD").trim());
                hd.setMaKH(rs.getString("MAKH").trim());
                hd.setMaNV(rs.getString("MANV").trim());
                hd.setMaKM(rs.getString("MAKM").trim());
                hd.setNgayLapHD(rs.getString("NGAYLAPHD").trim());
                hd.setTongTien(Double.valueOf(rs.getString("TONGTIEN").trim()));

                HOADON_LIST.add(hd);
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
        return HOADON_LIST;
    }

    public ArrayList<CTHOADON> getAllCTHD() {

        // Khởi tạo đối tượng chứa câu lệnh thực hiện tìm kiếm dữ liệu.
        ArrayList<CTHOADON> CTHD_LIST = new ArrayList<>();
        String sqlSelectAll = "select CT_HOADON.MAHD, CT_HOADON.MASP, CT_HOADON.TENSP, CT_HOADON.DONGIA, CT_HOADON.SOLUONG, CT_HOADON.GIAMGIA, CT_HOADON.THANHTIEN from CT_HOADON"
                + " INNER JOIN HOADON"
                + " ON HOADON.MAHD = CT_HOADON.MAHD"
                + " INNER JOIN SANPHAM"
                + " ON SANPHAM.MASP = CT_HOADON.MASP";
        try {
            dbConnect = new DBConnect();
            conn = dbConnect.getConnection();
            ps = conn.prepareStatement(sqlSelectAll);
            rs = ps.executeQuery();
            while (rs.next()) {
                CTHOADON cthd = new CTHOADON();
                cthd.setMaHD(rs.getString("MAHD").trim());
                cthd.setMaSP(rs.getString("MASP").trim());
                cthd.setTenSp(rs.getString("TENSP").trim());
                cthd.setDonGia(Double.valueOf(rs.getString("DONGIA").trim()));
                cthd.setSoLuong(Integer.valueOf(rs.getString("SOLUONG").trim()));
                cthd.setGiamGia(rs.getString("SOLUONG").trim());
                cthd.setThanhTien(Double.valueOf(rs.getString("THANHTIEN").trim()));

                CTHD_LIST.add(cthd);
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
        return CTHD_LIST;
    }

    /**
     * updateUser method.<br>
     *
     * @param ctkm
     * @param ctkm_old
     * @return result
     */
    public int updateHD(HOADON hd, HOADON hd_old) {
        int result = 0;
        String sqlUpdate = "update HOADON set MAHD =?, MANV = ?, MAKH = ?, MAKM = ?, NGAYLAPHD = ?, TONGTIEN =? where MAHD = ?";

        try {
            dbConnect = new DBConnect();
            conn = dbConnect.getConnection();
            ps = conn.prepareStatement(sqlUpdate);
            ps.setString(7, hd_old.getMaHD().trim());
            ps.setString(1, hd_old.getMaHD().trim());
            ps.setString(2, hd.getMaNV().trim());
            ps.setString(3, hd.getMaKH().trim());
            ps.setString(4, hd.getMaKM().trim());
            ps.setString(5, hd.getNgayLapHD().trim());
            ps.setString(6, String.valueOf(hd.getTongTien()));
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

    public int updateCT_PNH(CTHOADON cthd, CTHOADON cthd_old) {
        int result = 0;
        String sqlUpdate = "update CT_HOADON set MAHD =?, MASP = ?, TENSP=?, DONGIA = ?, SOLUONG = ?, GIAMGIA = ?, THANHTIEN = ? where MAHD = ?";

        try {
            dbConnect = new DBConnect();
            conn = dbConnect.getConnection();
            ps = conn.prepareStatement(sqlUpdate);
            ps.setString(8, cthd_old.getMaHD().trim());
            ps.setString(1, cthd.getMaHD().trim());
            ps.setString(2, cthd.getMaSP().trim());
            ps.setString(3, cthd.getTenSp().trim());
            ps.setString(4, String.valueOf(cthd.getDonGia()));
            ps.setString(5, String.valueOf(cthd.getSoLuong()));
            ps.setString(6, cthd.getGiamGia().trim());
            ps.setString(7, String.valueOf(cthd.getThanhTien()));

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

    public void deleteHD(String mahd) {
        conn = DBConnect.getConnection();
        String sql = "delete from HOADON where MAHD=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, mahd);

            ps.executeUpdate();
        } catch (Exception var6) {
            var6.printStackTrace();
        }
    }

    public void deleteCT_HD(String mahd) {
        conn = DBConnect.getConnection();
        String sql = "delete from CT_HOADON where MAHD=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, mahd);

            ps.executeUpdate();
        } catch (Exception var6) {
            var6.printStackTrace();
        }
    }

    public int insertHD(HOADON hd) {
        int result = 0;
        String sqlInsert = "insert into HOADON(MAHD, MANV, MAKH, MAKM, NGAYLAPHD, TONGTIEN) values (?, ?, ?, ?, ?, ?)";

        try {
            dbConnect = new DBConnect();
            conn = dbConnect.getConnection();
            ps = conn.prepareStatement(sqlInsert);
            ps.setString(1, hd.getMaHD().trim());
            ps.setString(2, hd.getMaNV().trim());
            ps.setString(3, hd.getMaKH().trim());
            ps.setString(4, hd.getMaKM().trim());
            ps.setString(5, hd.getNgayLapHD().trim());
            ps.setDouble(6, hd.getTongTien());

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

    public int insertCT_HD(CTHOADON cthd) {
        int result = 0;
        String sqlInsert = "insert into CT_HOADON(MAHD, MASP, TENSP, DONGIA, SOLUONG, GIAMGIA, THANHTIEN) values (?, ?, ?, ?, ?, ?, ?)";

        try {
            dbConnect = new DBConnect();
            conn = dbConnect.getConnection();
            ps = conn.prepareStatement(sqlInsert);
            ps.setString(1, cthd.getMaHD().trim());
            ps.setString(2, cthd.getMaSP().trim());
            ps.setString(3, cthd.getTenSp().trim());
            ps.setDouble(4, cthd.getDonGia());
            ps.setInt(5, cthd.getSoLuong());
            ps.setString(6, cthd.getGiamGia().trim());
            ps.setDouble(7, cthd.getThanhTien());

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
