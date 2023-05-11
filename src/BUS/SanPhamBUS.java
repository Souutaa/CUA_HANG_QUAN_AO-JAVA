/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.SanPhamDAO;
import Model.SANPHAM;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Quang Long
 */
public class SanPhamBUS {

    SanPhamDAO spDAO = new SanPhamDAO();
    public static List<SANPHAM> SANPHAMLIST = new ArrayList<>();

    public ArrayList<SANPHAM> getAllSanPham() {
        return spDAO.getAllSANPHAM();
    }

    public int updateSP(SANPHAM sp, SANPHAM sp_old) {
        int result = spDAO.updateSP(sp, sp_old);
        return result;
    }

    public void deleteSP(String masp) {
        spDAO.delete(masp);
    }

    public int insertSP(SANPHAM sp) {
        int result = spDAO.insertSP(sp);
        return result;
    }

    public SANPHAM timTheoMa(String masp) {
        for (SANPHAM sp : SANPHAMLIST) {
            if (sp.getMaSP().equalsIgnoreCase(masp)) {
                return sp;
            }
        }
        return null;
    }

    public ArrayList<SANPHAM> timTheoTen(String Tensp) {
        ArrayList<SANPHAM> SANPHAM_LIST = new ArrayList<>();
        for (SANPHAM sp : SANPHAMLIST) {
            if (sp.getTenSP().indexOf(Tensp) >= 0 || sp.getTenSP().equalsIgnoreCase(Tensp)) {
                SANPHAM_LIST.add(sp);
            }
        }
        return SANPHAM_LIST;
    }

    public ArrayList<SANPHAM> timTheoDonGia(String Dongia) {
        ArrayList<SANPHAM> SANPHAM_LIST = new ArrayList<>();
        for (SANPHAM sp : SANPHAMLIST) {
            if (String.valueOf(sp.getDonGia()).indexOf(Dongia) >= 0 || 
                    String.valueOf(sp.getDonGia()).equalsIgnoreCase(Dongia)) {
                SANPHAM_LIST.add(sp);
            }
        }
        return SANPHAM_LIST;
    }

   /* public SANPHAM timTheoMaloai(String Maloai) {
        for (SANPHAM sp : SANPHAMLIST) {
            if (sp.getMaLoai().equalsIgnoreCase(Maloai)) {
                return sp;
            }
        }
        return null;
    }*/

    /*public ArrayList<LOAISP> timTheoSizevaMauSac(String Size, String Mausac) {
        ArrayList<LOAISP> LOAISP_LIST = new ArrayList<>();
        for (LOAISP lsp : LOAISPLIST) {
            if (lsp.getSize().indexOf(Size) >= 0 && lsp.getMauSac().indexOf(Mausac) >= 0  ) {
                LOAISP_LIST.add(lsp);
            }
        }
        return LOAISP_LIST;
    }
    
    public ArrayList<LOAISP> timTheoSizehoacMausac(String SizehoacMauSac) {
        ArrayList<LOAISP> LOAISP_LIST = new ArrayList<>();
        for (LOAISP lsp : LOAISPLIST) {
            if (lsp.getSize().indexOf(SizehoacMauSac) >= 0 || lsp.getMauSac().indexOf(SizehoacMauSac) >= 0  ) {
                LOAISP_LIST.add(lsp);
            }
        }
        return LOAISP_LIST;
    }*/
}
