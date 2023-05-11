/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.KhachHangDAO;
import Model.KHACHHANG;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class KhachHangBUS {

    KhachHangDAO khdao = new KhachHangDAO();
    public static List<KHACHHANG> KHACHHANGLIST = new ArrayList<>();

    public ArrayList<KHACHHANG> getAllUsers() {
        return khdao.getAllUsers();
    }

    public ArrayList<KHACHHANG> getUsersById(String Tenkh) {
        return khdao.getUsersById(Tenkh);
    }

    public int updateUser(KHACHHANG khachhang, KHACHHANG khachhangold) {
        int result = khdao.updateUser(khachhang, khachhangold);
        return result;
    }

    public int deleteUser(KHACHHANG khachhang) {
        int result = khdao.deleteUser(khachhang);
        return result;
    }

    public void deleteUser(String Makh) {
        khdao.delete(Makh);
    }

    public int insertUser(KHACHHANG khachhang) {
        int result = khdao.insertUser(khachhang);
        return result;
    }

    public KHACHHANG timTheoMa(String Makh) {
        for (KHACHHANG kh : KHACHHANGLIST) {
            if (kh.getMaKH().equalsIgnoreCase(Makh)) {
                return kh;
            }
        }
        return null;
    }

    public ArrayList<KHACHHANG> timTheoTen(String Tenkh) {
        ArrayList<KHACHHANG> KHACHHANG_LIST = new ArrayList<>();
        for (KHACHHANG kh : KHACHHANGLIST) {
            if (kh.getTenKH().indexOf(Tenkh) >= 0 || kh.getTenKH().equalsIgnoreCase(Tenkh)) {
                KHACHHANG_LIST.add(kh);
            }
        }
        return KHACHHANG_LIST;
    }

    public ArrayList<KHACHHANG> timTheoDiaChi(String DiaChikh) {
        ArrayList<KHACHHANG> KHACHHANG_LIST = new ArrayList<>();
        for (KHACHHANG kh : KHACHHANGLIST) {
            if (kh.getDiaChi_KH().indexOf(DiaChikh) >= 0 || kh.getDiaChi_KH().equalsIgnoreCase(DiaChikh)) {
                KHACHHANG_LIST.add(kh);
            }
        }
        return KHACHHANG_LIST;
    }

    public ArrayList<KHACHHANG> timTheoNamSinh(String NamSinhkh) {
        ArrayList<KHACHHANG> KHACHHANG_LIST = new ArrayList<>();
        for (KHACHHANG kh : KHACHHANGLIST) {
            if (kh.getNgaySinh_KH().indexOf(NamSinhkh) >= 0 || kh.getNgaySinh_KH().equalsIgnoreCase(NamSinhkh)) {
                KHACHHANG_LIST.add(kh);
            }
        }
        return KHACHHANG_LIST;
    }

    public ArrayList<KHACHHANG> timTheoDiaChivaNgaySinh(String DiaChi, String NgaySinh) {
        ArrayList<KHACHHANG> KHACHHANG_LIST = new ArrayList<>();
        for (KHACHHANG kh : KHACHHANGLIST) {
            if (kh.getDiaChi_KH().equalsIgnoreCase(DiaChi) && kh.getNgaySinh_KH().equalsIgnoreCase(NgaySinh)) {
                KHACHHANG_LIST.add(kh);
            }
        }
        return KHACHHANG_LIST;
    }

    public ArrayList<KHACHHANG> timTheoDiaChihoacNgaySinh(String DiaChihoacNgaySinh) {
        ArrayList<KHACHHANG> KHACHHANG_LIST = new ArrayList<>();
        for (KHACHHANG kh : KHACHHANGLIST) {
            if (kh.getDiaChi_KH().equalsIgnoreCase(DiaChihoacNgaySinh) || kh.getNgaySinh_KH().equalsIgnoreCase(DiaChihoacNgaySinh)) {
                KHACHHANG_LIST.add(kh);
            }
        }
        return KHACHHANG_LIST;
    }
}
