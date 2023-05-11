/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.NhaCungCapDAO;
import Model.NHACUNGCAP;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Quang Long
 */
public class NhaCungCapBUS {
    NhaCungCapDAO nccdao = new NhaCungCapDAO();
    public static List<NHACUNGCAP> NHACUNGCAPLIST = new ArrayList<>();

    public ArrayList<NHACUNGCAP> getAllUsers() {
        return nccdao.getAllUsers();
    }

    public int updateUser(NHACUNGCAP nhacungcap,NHACUNGCAP nhacungcap_old) {
        int result = nccdao.updateUser(nhacungcap, nhacungcap_old);
        return result;
    }

    public void deleteUser(String Mancc) {
        nccdao.delete(Mancc);
    }

    public int insertUser(NHACUNGCAP nhancungcap) {
        int result = nccdao.insertUser(nhancungcap);
        return result;
    }

    public NHACUNGCAP timTheoMa(String Mancc) {       
        for (NHACUNGCAP ncc : NHACUNGCAPLIST) {
            if (ncc.getMaNCC().equalsIgnoreCase(Mancc)) {
                return ncc;
            }
        }
        return null;
    }

    public ArrayList<NHACUNGCAP> timTheoTen(String Tenncc) {
        ArrayList<NHACUNGCAP> NHACUNGCAP_LIST = new ArrayList<>();
        for (NHACUNGCAP ncc : NHACUNGCAPLIST) {
            if (ncc.getTenNCC().indexOf(Tenncc) >= 0 || ncc.getTenNCC().equalsIgnoreCase(Tenncc)) {
                NHACUNGCAP_LIST.add(ncc);
            }
        }
        return NHACUNGCAP_LIST;
    }
    
    public ArrayList<NHACUNGCAP> timTheoDiaChi(String DiaChincc) {
        ArrayList<NHACUNGCAP> NHACUNGCAP_LIST = new ArrayList<>();
        for (NHACUNGCAP ncc : NHACUNGCAPLIST) {
            if (ncc.getDiaChi_NCC().indexOf(DiaChincc) >= 0 ||ncc.getDiaChi_NCC().equalsIgnoreCase(DiaChincc)) {
                NHACUNGCAP_LIST.add(ncc);
            }
        }
        return NHACUNGCAP_LIST;
    }
    
}
