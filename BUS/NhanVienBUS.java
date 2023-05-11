/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.NhanVienDAO;
import Model.NHANVIEN;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Quang Long
 */
public class NhanVienBUS {

    NhanVienDAO nvdao = new NhanVienDAO();
    public static List<NHANVIEN> NHANVIENLIST = new ArrayList<>();

    public ArrayList<NHANVIEN> getAllUsers() {
        return nvdao.getAllUsers();
    }
    
    public int updateUser(NHANVIEN nhanvien,NHANVIEN nhanvienold) {
        int result = nvdao.updateUser(nhanvien,nhanvienold);
        return result;
    }

    public void deleteUser(String Manv) {
        nvdao.delete(Manv);
    }

    public int insertUser(NHANVIEN nhanvien) {
        int result = nvdao.insertUser(nhanvien);
        return result;
    }

    public NHANVIEN timTheoMa(String Manv) {       
        for (NHANVIEN nv : NHANVIENLIST) {
            if (nv.getMaNV().equalsIgnoreCase(Manv)) {
                return nv;
            }
        }
        return null;
    }

    public ArrayList<NHANVIEN> timTheoTen(String Tennv) {
        ArrayList<NHANVIEN> NHANVIEN_LIST = new ArrayList<>();
        for (NHANVIEN nv : NHANVIENLIST) {
            if (nv.getTenNV().indexOf(Tennv) >= 0 || nv.getTenNV().equalsIgnoreCase(Tennv)) {
                NHANVIEN_LIST.add(nv);
            }
        }
        return NHANVIEN_LIST;
    }
    
    public ArrayList<NHANVIEN> timTheoDiaChi(String DiaChinv) {
        ArrayList<NHANVIEN> NHANVIEN_LIST = new ArrayList<>();
        for (NHANVIEN nv : NHANVIENLIST) {
            if (nv.getDiaChi_NV().equalsIgnoreCase(DiaChinv)) {
                NHANVIEN_LIST.add(nv);
            }
        }
        return NHANVIEN_LIST;
    }
    
    public ArrayList<NHANVIEN> timTheoNamSinh(String NamSinhnv) {
        ArrayList<NHANVIEN> NHANVIEN_LIST = new ArrayList<>();
        for (NHANVIEN nv : NHANVIENLIST) {
            if (nv.getNgaySinh_NV().equalsIgnoreCase(NamSinhnv)) {
                NHANVIEN_LIST.add(nv);
            }
        }
        return NHANVIEN_LIST;
    }
     
    public ArrayList<NHANVIEN> timTheoDiaChivaNgaySinh(String DiaChi, String NgaySinh) {
        ArrayList<NHANVIEN> NHANVIEN_LIST = new ArrayList<>();
        for (NHANVIEN nv : NHANVIENLIST) {
            if (nv.getDiaChi_NV().equalsIgnoreCase(DiaChi) && nv.getNgaySinh_NV().equalsIgnoreCase(NgaySinh)) {
                NHANVIEN_LIST.add(nv);
            }
        }
        return NHANVIEN_LIST;
    }
    
    public ArrayList<NHANVIEN> timTheoDiaChihoacNgaySinh(String DiaChihoacNgaySinh) {
        ArrayList<NHANVIEN> NHANVIEN_LIST = new ArrayList<>();
        for (NHANVIEN nv : NHANVIENLIST) {
            if (nv.getDiaChi_NV().equalsIgnoreCase(DiaChihoacNgaySinh) || nv.getNgaySinh_NV().equalsIgnoreCase(DiaChihoacNgaySinh)) {
                NHANVIEN_LIST.add(nv);
            }
        }
        return NHANVIEN_LIST;
    }
}
