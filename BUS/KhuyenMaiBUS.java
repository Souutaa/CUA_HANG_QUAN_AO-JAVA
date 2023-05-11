/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.KhuyenMaiDAO;
import Model.CTCTKM;
import Model.CTKM;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Quang Long
 */
public class KhuyenMaiBUS {

    KhuyenMaiDAO kmDAO = new KhuyenMaiDAO();
    public static List<CTKM> CTKMLIST = new ArrayList<>();
    public static List<CTCTKM> CTCTKMLIST = new ArrayList<>();

    public ArrayList<CTKM> getAllChuongTrinhKhuyenMai() {
        return kmDAO.getAllCTKM();
    }

    public ArrayList<CTCTKM> getAllCT_ChuongTrinhKhuyenMai() {
        return kmDAO.getAllCT_CTKM();
    }

    public int updateCTKM(CTKM ctkm, CTKM ctkm_old) {
        int result = kmDAO.updateCTKM(ctkm, ctkm_old);
        return result;
    }

    public int updateCT_CTKM(CTCTKM ctctkm, CTCTKM ctctkm_old) {
        int result = kmDAO.updateCT_CTKM(ctctkm, ctctkm_old);
        return result;
    }

    public CTKM timTheoMaCTKM(String makm) {
        for (CTKM ctkm : CTKMLIST) {
            if (ctkm.getMaKM().equalsIgnoreCase(makm)) {
                return ctkm;
            }
        }
        return null;
    }

    /* public CTCTKM timTheoMaCT_CTKM(String makm) {
        for (CTCTKM ctctkm : CTCTKMLIST) {
            if (ctctkm.getMaKM().equalsIgnoreCase(makm)) {
                return ctctkm;
            }
        }
        return null;
    }*/
    
    public ArrayList<CTKM> timTheoTenKM(String Tenkm) {
        ArrayList<CTKM> CTKM_LIST = new ArrayList<>();
        for (CTKM ctkm : CTKMLIST) {
            if (ctkm.getTenCTKM().indexOf(Tenkm) >= 0 || ctkm.getTenCTKM().equalsIgnoreCase(Tenkm)) {
                CTKM_LIST.add(ctkm);
            }
        }
        return CTKM_LIST;
    }

    public ArrayList<CTKM> timTheoNgayBD(String NgayBD) {
        ArrayList<CTKM> CTKM_LIST = new ArrayList<>();
        for (CTKM ctkm : CTKMLIST) {
            if (ctkm.getNgayBD().indexOf(NgayBD) >= 0 || ctkm.getNgayBD().equalsIgnoreCase(NgayBD)) {
                CTKM_LIST.add(ctkm);
            }
        }
        return CTKM_LIST;
    }

    public ArrayList<CTKM> timTheoNgayKT(String NgayKT) {
        ArrayList<CTKM> CTKM_LIST = new ArrayList<>();
        for (CTKM ctkm : CTKMLIST) {
            if (ctkm.getNgayKT().indexOf(NgayKT) >= 0 || ctkm.getNgayKT().equalsIgnoreCase(NgayKT)) {
                CTKM_LIST.add(ctkm);
            }
        }
        return CTKM_LIST;
    }

    public ArrayList<CTCTKM> timTheoPhanTramCT_CTKM(String phantram) {
        ArrayList<CTCTKM> CTCTKM_LIST = new ArrayList<>();
        for (CTCTKM ctctkm : CTCTKMLIST) {
            if (ctctkm.getPhantram_KM().indexOf(phantram)>= 0 || ctctkm.getPhantram_KM().equalsIgnoreCase(phantram)) {
                CTCTKM_LIST.add(ctctkm);
            }
        }
        return CTCTKM_LIST;
    }
    
    public void deleteCTKM(String makm) {
        kmDAO.deleteCTKM(makm);
    }

    public void deleteCT_CTKM(String makm) {
        kmDAO.deleteCT_CTKM(makm);
    }

    public int insertCTKM(CTKM ctkm) {
        int result = kmDAO.insertCTKM(ctkm);
        return result;
    }

    public int insertCT_CTKM(CTCTKM ctctkm) {
        int result = kmDAO.insertCT_CTKM(ctctkm);
        return result;
    }
}
