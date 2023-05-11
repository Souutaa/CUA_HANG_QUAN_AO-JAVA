/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.HoaDonDAO;
import Model.CTHOADON;
import Model.HOADON;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Quang Long
 */
public class HoaDonBUS {

    HoaDonDAO hdDAO = new HoaDonDAO();
    public static List<HOADON> HDLIST = new ArrayList<>();
    public static List<CTHOADON> CTHDLIST = new ArrayList<>();

    public ArrayList<HOADON> getAllHD() {
        return hdDAO.getAllHD();
    }

    public ArrayList<CTHOADON> getAllCTHD() {
        return hdDAO.getAllCTHD();
    }

    public int updateHD(HOADON hd, HOADON hd_old) {
        int result = hdDAO.updateHD(hd, hd_old);
        return result;
    }

    public int updateCTHD(CTHOADON cthd, CTHOADON cthd_old) {
        int result = hdDAO.updateCT_PNH(cthd, cthd_old);
        return result;
    }

    public HOADON timTheoMaHD(String mahd) {
        for (HOADON hd : HDLIST) {
            if (hd.getMaHD().equalsIgnoreCase(mahd)) {
                return hd;
            }
        }
        return null;
    }
    
    public HOADON timTheoMaNV(String manv) {
        for (HOADON hd : HDLIST) {
            if (hd.getMaNV().equalsIgnoreCase(manv)) {
                return hd;
            }
        }
        return null;
    }
    
    public HOADON timTheoMaKH(String makh) {
        for (HOADON hd : HDLIST) {
            if (hd.getMaKH().equalsIgnoreCase(makh)) {
                return hd;
            }
        }
        return null;
    }

    public ArrayList<HOADON> timTheoNgayLap(String NgayLap) {
        ArrayList<HOADON> HD_LIST = new ArrayList<>();
        for (HOADON hd : HDLIST) {
            if (hd.getNgayLapHD().equalsIgnoreCase(NgayLap)) {
                HD_LIST.add(hd);
            }
        }
        return HD_LIST;
    }
    
    public CTHOADON timTheoMaHD_CT(String mahd) {
        for (CTHOADON cthd : CTHDLIST) {
            if (cthd.getMaHD().equalsIgnoreCase(mahd)) {
                return cthd;
            }
        }
        return null;
    }
    
    public CTHOADON timTheoMaSP_CT(String masp) {
        for (CTHOADON cthd : CTHDLIST) {
            if (cthd.getMaSP().equalsIgnoreCase(masp)) {
                return cthd;
            }
        }
        return null;
    }
    
    public ArrayList<CTHOADON> timTheoDonGia(String DonGia) {
        ArrayList<CTHOADON> CTHD_LIST = new ArrayList<>();
        for (CTHOADON cthd : CTHDLIST) {
            if (String.valueOf(cthd.getDonGia()).equalsIgnoreCase(DonGia)) {
                CTHD_LIST.add(cthd);
            }
        }
        return CTHD_LIST;
    }

    public void deleteHD(String mahd) {
        hdDAO.deleteHD(mahd);
    }

    public void deleteCT_HD(String mahd) {
        hdDAO.deleteCT_HD(mahd);
    }

    public int insertHD(HOADON hd) {
        int result = hdDAO.insertHD(hd);
        return result;
    }

    public int insertCT_HD(CTHOADON cthd) {
        int result = hdDAO.insertCT_HD(cthd);
        return result;
    }
}
