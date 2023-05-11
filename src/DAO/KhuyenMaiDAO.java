/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import CONNECTION.DBConnect;
import Model.CTCTKM;
import Model.CTKM;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Quang Long
 */
public class KhuyenMaiDAO {

    private DBConnect dbConnect;
    private Connection conn = DBConnect.getConnection();
    private PreparedStatement ps;

    private ResultSet rs = null;

    public ArrayList<CTKM> getAllCTKM() {

        // Khởi tạo đối tượng chứa câu lệnh thực hiện tìm kiếm dữ liệu.
        ArrayList<CTKM> CTKM_LIST = new ArrayList<>();
        String sqlSelectAll = "Select * from CHUONGTRINHKHUYENMAI";
        try {
            dbConnect = new DBConnect();
            conn = dbConnect.getConnection();
            ps = conn.prepareStatement(sqlSelectAll);
            rs = ps.executeQuery();
            while (rs.next()) {
                CTKM ctkm = new CTKM();
                ctkm.setMaKM(rs.getString("MAKM").trim());
                ctkm.setTenCTKM(rs.getString("TENKM").trim());
                ctkm.setNgayBD(rs.getString("NGAYBD").trim());
                ctkm.setNgayKT(rs.getString("NGAYKT").trim());

                CTKM_LIST.add(ctkm);
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
        return CTKM_LIST;
    }

    public ArrayList<CTCTKM> getAllCT_CTKM() {

        // Khởi tạo đối tượng chứa câu lệnh thực hiện tìm kiếm dữ liệu.
        ArrayList<CTCTKM> CTCTKM_LIST = new ArrayList<>();
        String sqlSelectAll = "select CT_CHUONGTRINHKHUYENMAI.MAKM, PHANTRAM_KM from CT_CHUONGTRINHKHUYENMAI"                
                + " INNER JOIN CHUONGTRINHKHUYENMAI"
                + " ON CHUONGTRINHKHUYENMAI.MAKM = CT_CHUONGTRINHKHUYENMAI.MAKM";
        try {
            dbConnect = new DBConnect();
            conn = dbConnect.getConnection();
            ps = conn.prepareStatement(sqlSelectAll);
            rs = ps.executeQuery();
            while (rs.next()) {
                CTCTKM ctctkm = new CTCTKM();
                ctctkm.setMaKM(rs.getString("MAKM").trim());                
                ctctkm.setPhantram_KM(rs.getString("PHANTRAM_KM"));
                CTCTKM_LIST.add(ctctkm);
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
        return CTCTKM_LIST;
    }

    /**
     * updateUser method.<br>
     *
     * @param ctkm
     * @param ctkm_old
     * @return result
     */
    public int updateCTKM(CTKM ctkm, CTKM ctkm_old) {
        int result = 0;
        String sqlUpdate = "update CHUONGTRINHKHUYENMAI set MAKM =?, TENKM = ?, NGAYBD = ?, NGAYKT = ? where MAKM = ?";

        try {
            dbConnect = new DBConnect();
            conn = dbConnect.getConnection();
            ps = conn.prepareStatement(sqlUpdate);
            ps.setString(5, ctkm_old.getMaKM());
            ps.setString(1, ctkm_old.getMaKM());
            ps.setString(2, ctkm.getTenCTKM());
            ps.setString(3, ctkm.getNgayBD());
            ps.setString(4, ctkm.getNgayKT());

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

    public int updateCT_CTKM(CTCTKM ctctkm, CTCTKM ctctkm_old) {
        int result = 0;
        String sqlUpdate = "update CT_CHUONGTRINHKHUYENMAI set MAKM =?, MASP = ?, PHANTRAM_KM = ? where MAKM = ?";

        try {
            dbConnect = new DBConnect();
            conn = dbConnect.getConnection();
            ps = conn.prepareStatement(sqlUpdate);
            ps.setString(3, ctctkm_old.getMaKM());
            ps.setString(1, ctctkm.getMaKM());
            ps.setString(2, ctctkm.getPhantram_KM());

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

    public void deleteCTKM(String makm) {
        conn = DBConnect.getConnection();
        String sql = "delete from CHUONGTRINHKHUYENMAI where MAKM=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, makm);

            ps.executeUpdate();
        } catch (Exception var6) {
            var6.printStackTrace();
        }
    }

    public void deleteCT_CTKM(String makm) {
        conn = DBConnect.getConnection();
        String sql = "delete from CT_CHUONGTRINHKHUYENMAI where MAKM=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, makm);

            ps.executeUpdate();
        } catch (Exception var6) {
            var6.printStackTrace();
        }
    }

    public int insertCTKM(CTKM ctkm) {
        int result = 0;
        String sqlInsert = "insert into CHUONGTRINHKHUYENMAI(MAKM, TENKM, NGAYBD, NGAYKT) values (?, ?, ?, ?)";

        try {
            dbConnect = new DBConnect();
            conn = dbConnect.getConnection();
            ps = conn.prepareStatement(sqlInsert);
            ps.setString(1, ctkm.getMaKM().trim());
            ps.setString(2, ctkm.getTenCTKM().trim());
            ps.setString(3, ctkm.getNgayBD().trim());
            ps.setString(4, ctkm.getNgayKT().trim());

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

    public int insertCT_CTKM(CTCTKM ctctkm) {
        int result = 0;
        String sqlInsert = "insert into CT_CHUONGTRINHKHUYENMAI(MAKM, PHANTRAM_KM) values (?, ?)";

        try {
            dbConnect = new DBConnect();
            conn = dbConnect.getConnection();
            ps = conn.prepareStatement(sqlInsert);
            ps.setString(1, ctctkm.getMaKM());
            ps.setString(2, ctctkm.getPhantram_KM());

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
