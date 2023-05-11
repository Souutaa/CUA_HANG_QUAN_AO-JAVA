/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.PhieuNhapHangDAO;
import Model.CTPHIEUNHAPHANG;
import Model.PHIEUNHAPHANG;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Quang Long
 */
public class PhieuNhapHangBUS {

    PhieuNhapHangDAO pnhDAO = new PhieuNhapHangDAO();
    public static List<PHIEUNHAPHANG> PNHLIST = new ArrayList<>();
    public static List<CTPHIEUNHAPHANG> CTPNHLIST = new ArrayList<>();

    public ArrayList<PHIEUNHAPHANG> getAllPNH() {
        return pnhDAO.getAllPNH();
    }

    public ArrayList<CTPHIEUNHAPHANG> getAllCT_PNH() {
        return pnhDAO.getAllCT_PNH();
    }

    public int updatePNH(PHIEUNHAPHANG pnh, PHIEUNHAPHANG pnh_old) {
        int result = pnhDAO.updatePNH(pnh, pnh_old);
        return result;
    }

    public int updateCT_PNH(CTPHIEUNHAPHANG ctpnh, CTPHIEUNHAPHANG ctpnh_old) {
        int result = pnhDAO.updateCT_PNH(ctpnh, ctpnh_old);
        return result;
    }

    public PHIEUNHAPHANG timTheoMaNH(String manh) {
        for (PHIEUNHAPHANG pnh : PNHLIST) {
            if (pnh.getMaNH().equalsIgnoreCase(manh)) {
                return pnh;
            }
        }
        return null;
    }
    
    public PHIEUNHAPHANG timTheoMaNV(String manv) {
        for (PHIEUNHAPHANG pnh : PNHLIST) {
            if (pnh.getMaNV().equalsIgnoreCase(manv)) {
                return pnh;
            }
        }
        return null;
    }
    
    public PHIEUNHAPHANG timTheoMaNCC(String mancc) {
        for (PHIEUNHAPHANG pnh : PNHLIST) {
            if (pnh.getMaNCC().equalsIgnoreCase(mancc)) {
                return pnh;
            }
        }
        return null;
    }

    public ArrayList<PHIEUNHAPHANG> timTheoNgayNhap(String NgayNhap) {
        ArrayList<PHIEUNHAPHANG> PNH_LIST = new ArrayList<>();
        for (PHIEUNHAPHANG pnh : PNHLIST) {
            if (pnh.getNgayNhap().equalsIgnoreCase(NgayNhap)) {
                PNH_LIST.add(pnh);
            }
        }
        return PNH_LIST;
    }
    
    public CTPHIEUNHAPHANG timTheoMaNH_CT(String manh) {
        for (CTPHIEUNHAPHANG ctpnh : CTPNHLIST) {
            if (ctpnh.getMaNH().equalsIgnoreCase(manh)) {
                return ctpnh;
            }
        }
        return null;
    }
    
    public CTPHIEUNHAPHANG timTheoMaSP_CT(String masp) {
        for (CTPHIEUNHAPHANG ctpnh : CTPNHLIST) {
            if (ctpnh.getMaSP().equalsIgnoreCase(masp)) {
                return ctpnh;
            }
        }
        return null;
    }
    
    public ArrayList<CTPHIEUNHAPHANG> timTheoDonGia(String DonGia) {
        ArrayList<CTPHIEUNHAPHANG> CTPNH_LIST = new ArrayList<>();
        for (CTPHIEUNHAPHANG ctpnh : CTPNHLIST) {
            if (String.valueOf(ctpnh.getDonGia()).equalsIgnoreCase(DonGia)) {
                CTPNH_LIST.add(ctpnh);
            }
        }
        return CTPNH_LIST;
    }

    public void deletePNH(String manh) {
        pnhDAO.deletePNH(manh);
    }

    public void deleteCT_PNH(String manh) {
        pnhDAO.deleteCT_PNH(manh);
    }

    public int insertPNH(PHIEUNHAPHANG pnh) {
        int result = pnhDAO.insertPNH(pnh);
        return result;
    }

    public int insertCT_PNH(CTPHIEUNHAPHANG ctpnh) {
        int result = pnhDAO.insertCT_PNH(ctpnh);
        return result;
    }
}
