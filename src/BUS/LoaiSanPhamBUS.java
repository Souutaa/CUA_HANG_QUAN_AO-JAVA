/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.*;
import Model.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Quang Long
 */
public class LoaiSanPhamBUS {
    LoaiSanPhamDAO loaiSanPhamDAO= new LoaiSanPhamDAO();
    public static List<LOAISP> LOAISPLIST = new ArrayList<>();

    public ArrayList<LOAISP> getAllLoaiSP() {
        return loaiSanPhamDAO.getAllLoaiSP();
    }

    public int updateUser(LOAISP loaisp,LOAISP loaisp_old) {
        int result = loaiSanPhamDAO.updateLOAISP(loaisp,loaisp_old);
        return result;
    }

    public void deleteLoaiSP(String maloai) {
        loaiSanPhamDAO.delete(maloai);
    }

    public int insertLoaiSP(LOAISP loaisp) {
        int result = loaiSanPhamDAO.insertLOAISP(loaisp);
        return result;
    }

    public LOAISP timTheoMa(String maloai) {       
        for (LOAISP lsp : LOAISPLIST) {
            if (lsp.getMaLoai().equalsIgnoreCase(maloai)) {
                return lsp;
            }
        }
        return null;
    }

    public ArrayList<LOAISP> timTheoTen(String Tenloai) {
        ArrayList<LOAISP> LOAISP_LIST = new ArrayList<>();
        for (LOAISP lsp : LOAISPLIST) {
            if (lsp.getTenLoai().indexOf(Tenloai) >= 0) {
                LOAISP_LIST.add(lsp);
            }
        }
        return LOAISP_LIST;
    }
    
    public ArrayList<LOAISP> timTheoSize(String Size) {
        ArrayList<LOAISP> LOAISP_LIST = new ArrayList<>();
        for (LOAISP lsp : LOAISPLIST) {
            if (lsp.getSize().equalsIgnoreCase(Size)) {
                LOAISP_LIST.add(lsp);
            }
        }
        return LOAISP_LIST;
    }
    
    public ArrayList<LOAISP> timTheoMauSac(String Mausac) {
        ArrayList<LOAISP> LOAISP_LIST = new ArrayList<>();
        for (LOAISP lsp : LOAISPLIST) {
            if (lsp.getMauSac().indexOf(Mausac)>= 0 || lsp.getMauSac().equalsIgnoreCase(Mausac)) {
                LOAISP_LIST.add(lsp);
            }
        }
        return LOAISP_LIST;
    }
     
    public ArrayList<LOAISP> timTheoSizevaMauSac(String Size, String Mausac) {
        ArrayList<LOAISP> LOAISP_LIST = new ArrayList<>();
        for (LOAISP lsp : LOAISPLIST) {
            if (lsp.getSize().indexOf(Size) >= 0 && lsp.getMauSac().indexOf(Mausac) >= 0 || 
                    lsp.getSize().equalsIgnoreCase(Size) && lsp.getMauSac().equalsIgnoreCase(Mausac) ) {
                LOAISP_LIST.add(lsp);
            }
        }
        return LOAISP_LIST;
    }
    
    public ArrayList<LOAISP> timTheoSizehoacMausac(String SizehoacMauSac) {
        ArrayList<LOAISP> LOAISP_LIST = new ArrayList<>();
        for (LOAISP lsp : LOAISPLIST) {
            if (lsp.getSize().equalsIgnoreCase(SizehoacMauSac)|| lsp.getMauSac().equalsIgnoreCase(SizehoacMauSac)) {
                LOAISP_LIST.add(lsp);
            }
        }
        return LOAISP_LIST;
    }
}
        
